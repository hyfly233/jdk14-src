/*
 * Copyright (c) 2017, 2019, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package jdk.incubator.jpackage.internal;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.util.*;

public class WinExeBundler extends AbstractBundler {

    static {
        System.loadLibrary("jpackage");
    }

    private static final ResourceBundle I18N = ResourceBundle.getBundle(
            "jdk.incubator.jpackage.internal.resources.WinResources");

    public static final BundlerParamInfo<WinAppBundler> APP_BUNDLER
            = new WindowsBundlerParam<>(
                    "win.app.bundler",
                    WinAppBundler.class,
                    params -> new WinAppBundler(),
                    null);

    public static final BundlerParamInfo<File> EXE_IMAGE_DIR
            = new WindowsBundlerParam<>(
                    "win.exe.imageDir",
                    File.class,
                    params -> {
                        File imagesRoot = IMAGES_ROOT.fetchFrom(params);
                        if (!imagesRoot.exists()) {
                            imagesRoot.mkdirs();
                        }
                        return new File(imagesRoot, "win-exe.image");
                    },
                    (s, p) -> null);

    private final static String EXE_WRAPPER_NAME = "msiwrapper.exe";

    @Override
    public String getName() {
        return getString("exe.bundler.name");
    }

    @Override
    public String getID() {
        return "exe";
    }

    @Override
    public String getBundleType() {
        return "INSTALLER";
    }

    @Override
    public File execute(Map<String, ? super Object> params,
            File outputParentDir) throws PackagerException {
        return bundle(params, outputParentDir);
    }

    @Override
    public boolean supported(boolean platformInstaller) {
        return msiBundler.supported(platformInstaller);
    }

    @Override
    public boolean isDefault() {
        return true;
    }

    @Override
    public boolean validate(Map<String, ? super Object> params)
            throws ConfigException {
        return msiBundler.validate(params);
    }

    public File bundle(Map<String, ? super Object> params, File outdir)
            throws PackagerException {

        IOUtils.writableOutputDir(outdir.toPath());

        File exeImageDir = EXE_IMAGE_DIR.fetchFrom(params);

        // Write msi to temporary directory.
        File msi = msiBundler.bundle(params, exeImageDir);

        try {
            new ScriptRunner()
            .setDirectory(msi.toPath().getParent())
            .setResourceCategoryId("resource.post-msi-script")
            .setScriptNameSuffix("post-msi")
            .setEnvironmentVariable("JpMsiFile", msi.getAbsolutePath().toString())
            .run(params);

            return buildEXE(msi, outdir);
        } catch (IOException ex) {
            Log.verbose(ex);
            throw new PackagerException(ex);
        }
    }

    private File buildEXE(File msi, File outdir)
            throws IOException {

        Log.verbose(MessageFormat.format(
                getString("message.outputting-to-location"),
                outdir.getAbsolutePath()));

        // Copy template msi wrapper next to msi file
        String exePath = msi.getAbsolutePath();
        exePath = exePath.substring(0, exePath.lastIndexOf('.')) + ".exe";
        try (InputStream is = OverridableResource.readDefault(EXE_WRAPPER_NAME)) {
            Files.copy(is, Path.of(exePath));
        }
        // Embed msi in msi wrapper exe.
        embedMSI(exePath, msi.getAbsolutePath());

        Path dstExePath = Paths.get(outdir.getAbsolutePath(),
                Path.of(exePath).getFileName().toString());
        Files.deleteIfExists(dstExePath);

        Files.copy(Path.of(exePath), dstExePath);

        Log.verbose(MessageFormat.format(
                getString("message.output-location"),
                outdir.getAbsolutePath()));

        return dstExePath.toFile();
    }

    private static String getString(String key)
            throws MissingResourceException {
        return I18N.getString(key);
    }

    private final WinMsiBundler msiBundler = new WinMsiBundler();

    private static native int embedMSI(String exePath, String msiPath);
}
