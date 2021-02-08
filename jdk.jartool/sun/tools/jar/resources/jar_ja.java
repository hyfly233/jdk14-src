package sun.tools.jar.resources;

import java.util.ListResourceBundle;

public final class jar_ja extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "error.bad.cflag", "\u30D5\u30E9\u30B0'c'\u3067\u306F\u30DE\u30CB\u30D5\u30A7\u30B9\u30C8\u307E\u305F\u306F\u5165\u529B\u30D5\u30A1\u30A4\u30EB\u306E\u6307\u5B9A\u304C\u5FC5\u8981\u3067\u3059\u3002" },
            { "error.bad.dflag", "'-d, --describe-module'\u30AA\u30D7\u30B7\u30E7\u30F3\u3067\u306F\u5165\u529B\u30D5\u30A1\u30A4\u30EB\u306E\u6307\u5B9A\u306F\u4E0D\u8981\u3067\u3059" },
            { "error.bad.eflag", "'e'\u30D5\u30E9\u30B0\u3068'Main-Class'\u5C5E\u6027\u3092\u6301\u3064\u30DE\u30CB\u30D5\u30A7\u30B9\u30C8\u306F\u540C\u6642\u306B\n\u6307\u5B9A\u3067\u304D\u307E\u305B\u3093\u3002" },
            { "error.bad.file.arg", "\u30D5\u30A1\u30A4\u30EB\u5F15\u6570\u306E\u89E3\u6790\u4E2D\u306B\u30A8\u30E9\u30FC\u304C\u767A\u751F\u3057\u307E\u3057\u305F" },
            { "error.bad.option", "\u30AA\u30D7\u30B7\u30E7\u30F3-{ctxuid}\u306E\u3046\u3061\u306E1\u3064\u3092\u6307\u5B9A\u3059\u308B\u5FC5\u8981\u304C\u3042\u308A\u307E\u3059\u3002" },
            { "error.bad.reason", "\u4E0D\u6B63\u306A\u7406\u7531: {0}\u3001\u975E\u63A8\u5968\u3001\u524A\u9664\u4E88\u5B9A\u306E\u975E\u63A8\u5968\u307E\u305F\u306F\u5B9F\u9A13\u7684\u306E\u3044\u305A\u308C\u304B\u3067\u3042\u308B\u5FC5\u8981\u304C\u3042\u308A\u307E\u3059" },
            { "error.bad.uflag", "\u30D5\u30E9\u30B0'u'\u3067\u306F\u30DE\u30CB\u30D5\u30A7\u30B9\u30C8\u304B'e'\u30D5\u30E9\u30B0\u3001\u307E\u305F\u306F\u5165\u529B\u30D5\u30A1\u30A4\u30EB\u306E\u6307\u5B9A\u304C\u5FC5\u8981\u3067\u3059\u3002" },
            { "error.cant.open", "{0}\u3092\u958B\u304F\u3053\u3068\u304C\u3067\u304D\u307E\u305B\u3093" },
            { "error.create.dir", "\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA{0}\u3092\u4F5C\u6210\u3067\u304D\u307E\u305B\u3093\u3067\u3057\u305F" },
            { "error.create.tempfile", "\u4E00\u6642\u30D5\u30A1\u30A4\u30EB\u3092\u4F5C\u6210\u3067\u304D\u307E\u305B\u3093\u3067\u3057\u305F" },
            { "error.hash.dep", "\u30E2\u30B8\u30E5\u30FC\u30EB{0}\u4F9D\u5B58\u6027\u306E\u30CF\u30C3\u30B7\u30E5\u3067\u30E2\u30B8\u30E5\u30FC\u30EB{1}\u304C\u30E2\u30B8\u30E5\u30FC\u30EB\u30FB\u30D1\u30B9\u306B\u898B\u3064\u304B\u308A\u307E\u305B\u3093" },
            { "error.illegal.option", "\u4E0D\u6B63\u306A\u30AA\u30D7\u30B7\u30E7\u30F3: {0}" },
            { "error.incorrect.length", "{0}\u306E\u51E6\u7406\u4E2D\u306B\u4E0D\u6B63\u306A\u9577\u3055\u304C\u3042\u308A\u307E\u3057\u305F" },
            { "error.invalid.versioned.module.attribute", "\u30E2\u30B8\u30E5\u30FC\u30EB\u30FB\u30C7\u30A3\u30B9\u30AF\u30EA\u30D7\u30BF\u5C5E\u6027{0}\u304C\u7121\u52B9\u3067\u3059" },
            { "error.missing.arg", "\u30AA\u30D7\u30B7\u30E7\u30F3{0}\u306B\u306F\u5F15\u6570\u304C\u5FC5\u8981\u3067\u3059\u3002" },
            { "error.missing.provider", "\u30B5\u30FC\u30D3\u30B9\u30FB\u30D7\u30ED\u30D0\u30A4\u30C0\u304C\u898B\u3064\u304B\u308A\u307E\u305B\u3093: {0}" },
            { "error.module.descriptor.not.found", "\u30E2\u30B8\u30E5\u30FC\u30EB\u30FB\u30C7\u30A3\u30B9\u30AF\u30EA\u30D7\u30BF\u304C\u898B\u3064\u304B\u308A\u307E\u305B\u3093" },
            { "error.module.options.without.info", "--module-version\u307E\u305F\u306F--hash-modules\u306E\u3044\u305A\u308C\u304B\u3067module-info.class\u304C\u3042\u308A\u307E\u305B\u3093" },
            { "error.multiple.main.operations", "\u8907\u6570\u306E'cuxtid'\u30AA\u30D7\u30B7\u30E7\u30F3\u3092\u6307\u5B9A\u3067\u304D\u307E\u305B\u3093" },
            { "error.no.operative.descriptor", "\u30EA\u30EA\u30FC\u30B9\u306E\u64CD\u4F5C\u30C7\u30A3\u30B9\u30AF\u30EA\u30D7\u30BF\u306F\u3042\u308A\u307E\u305B\u3093: {0}" },
            { "error.no.root.descriptor", "\u30EB\u30FC\u30C8\u30FB\u30E2\u30B8\u30E5\u30FC\u30EB\u306E\u30C7\u30A3\u30B9\u30AF\u30EA\u30D7\u30BF\u304C\u3042\u308A\u307E\u305B\u3093\u3002--release\u3092\u6307\u5B9A\u3057\u3066\u304F\u3060\u3055\u3044" },
            { "error.nosuch.fileordir", "{0}\u3068\u3044\u3046\u30D5\u30A1\u30A4\u30EB\u307E\u305F\u306F\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA\u306F\u3042\u308A\u307E\u305B\u3093" },
            { "error.release.unexpected.versioned.entry", "\u30EA\u30EA\u30FC\u30B9{1}\u3067\u4E88\u671F\u3057\u306A\u3044\u30D0\u30FC\u30B8\u30E7\u30CB\u30F3\u30B0\u6E08\u30A8\u30F3\u30C8\u30EA{0}" },
            { "error.release.value.notnumber", "\u30EA\u30EA\u30FC\u30B9{0}\u306F\u6709\u52B9\u3067\u306F\u3042\u308A\u307E\u305B\u3093" },
            { "error.release.value.toosmall", "\u30EA\u30EA\u30FC\u30B9{0}\u306F\u6709\u52B9\u3067\u306F\u3042\u308A\u307E\u305B\u3093\u30029\u4EE5\u4E0A\u3067\u3042\u308B\u5FC5\u8981\u304C\u3042\u308A\u307E\u3059" },
            { "error.unable.derive.automodule", "\u6B21\u306E\u30E2\u30B8\u30E5\u30FC\u30EB\u30FB\u30C7\u30A3\u30B9\u30AF\u30EA\u30D7\u30BF\u3092\u5C0E\u51FA\u3067\u304D\u307E\u305B\u3093: {0}" },
            { "error.unexpected.module-info", "\u4E88\u671F\u3057\u306A\u3044\u30E2\u30B8\u30E5\u30FC\u30EB\u30FB\u30C7\u30A3\u30B9\u30AF\u30EA\u30D7\u30BF{0}" },
            { "error.unrecognized.option", "\u8A8D\u8B58\u3055\u308C\u306A\u3044\u30AA\u30D7\u30B7\u30E7\u30F3: {0}" },
            { "error.validator.bad.entry.name", "\u30A8\u30F3\u30C8\u30EA\u540D\u304C\u4E0D\u6B63\u3067\u3059: {0}" },
            { "error.validator.different.api", "\u30A8\u30F3\u30C8\u30EA: {0}\u306B\u306F\u3001\u4EE5\u524D\u306E\u30D0\u30FC\u30B8\u30E7\u30F3\u3068\u306F\u7570\u306A\u308BAPI\u3092\u6301\u3064\u30AF\u30E9\u30B9\u304C\u542B\u307E\u308C\u307E\u3059" },
            { "error.validator.entryname.tooshort", "\u30A8\u30F3\u30C8\u30EA\u540D: {0}\u304C\u77ED\u3059\u304E\u307E\u3059\u3002\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA\u3067\u306F\u3042\u308A\u307E\u305B\u3093" },
            { "error.validator.incompatible.class.version", "\u30A8\u30F3\u30C8\u30EA: {0}\u306B\u306F\u3001\u4EE5\u524D\u306E\u30D0\u30FC\u30B8\u30E7\u30F3\u3068\u4E92\u63DB\u6027\u306E\u306A\u3044\u30AF\u30E9\u30B9\u30FB\u30D0\u30FC\u30B8\u30E7\u30F3\u304C\u542B\u307E\u308C\u307E\u3059" },
            { "error.validator.info.exports.notequal", "\u30D0\u30FC\u30B8\u30E7\u30CB\u30F3\u30B0\u3055\u308C\u305F\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA\u306Emodule-info.class\u306B\u7570\u306A\u308B\"exports\"\u304C\u542B\u307E\u308C\u3066\u3044\u307E\u3059" },
            { "error.validator.info.manclass.notequal", "{0}: \u30D0\u30FC\u30B8\u30E7\u30CB\u30F3\u30B0\u3055\u308C\u305F\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA\u306Emodule-info.class\u306B\u7570\u306A\u308B\"main-class\"\u304C\u542B\u307E\u308C\u3066\u3044\u307E\u3059" },
            { "error.validator.info.name.notequal", "\u30D0\u30FC\u30B8\u30E7\u30CB\u30F3\u30B0\u3055\u308C\u305F\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA\u306Emodule-info.class\u306B\u6B63\u3057\u304F\u306A\u3044\u540D\u524D\u304C\u542B\u307E\u308C\u3066\u3044\u307E\u3059" },
            { "error.validator.info.opens.notequal", "\u30D0\u30FC\u30B8\u30E7\u30CB\u30F3\u30B0\u30FB\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA\u306Emodule-info.class\u306B\u7570\u306A\u308B\"opens\"\u304C\u542B\u307E\u308C\u3066\u3044\u307E\u3059" },
            { "error.validator.info.provides.notequal", "\u30D0\u30FC\u30B8\u30E7\u30CB\u30F3\u30B0\u3055\u308C\u305F\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA\u306Emodule-info.class\u306B\u7570\u306A\u308B\"provides\"\u304C\u542B\u307E\u308C\u3066\u3044\u307E\u3059" },
            { "error.validator.info.requires.added", "\u30D0\u30FC\u30B8\u30E7\u30CB\u30F3\u30B0\u3055\u308C\u305F\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA\u306Emodule-info.class\u306B\u8FFD\u52A0\u306E\"requires\"\u304C\u542B\u307E\u308C\u3066\u3044\u307E\u3059" },
            { "error.validator.info.requires.dropped", "\u30D0\u30FC\u30B8\u30E7\u30CB\u30F3\u30B0\u3055\u308C\u305F\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA\u306Emodule-info.class\u306B\u6B20\u843D\u3057\u3066\u3044\u308B\"requires\"\u304C\u542B\u307E\u308C\u3066\u3044\u307E\u3059" },
            { "error.validator.info.requires.transitive", "\u30D0\u30FC\u30B8\u30E7\u30CB\u30F3\u30B0\u30FB\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA\u306Emodule-info.class\u306B\u8FFD\u52A0\u306E\"requires transitive\"\u304C\u542B\u307E\u308C\u3066\u3044\u307E\u3059" },
            { "error.validator.info.version.notequal", "{0}: \u30D0\u30FC\u30B8\u30E7\u30CB\u30F3\u30B0\u3055\u308C\u305F\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA\u306Emodule-info.class\u306B\u7570\u306A\u308B\"version\"\u304C\u542B\u307E\u308C\u3066\u3044\u307E\u3059" },
            { "error.validator.isolated.nested.class", "\u30A8\u30F3\u30C8\u30EA: {0}\u306F\u3001\u5206\u96E2\u578B\u306E\u30CD\u30B9\u30C8\u3055\u308C\u305F\u30AF\u30E9\u30B9\u3067\u3059" },
            { "error.validator.jarfile.exception", "{0}\u3092\u691C\u8A3C\u3067\u304D\u307E\u305B\u3093: {1}" },
            { "error.validator.jarfile.invalid", "\u7121\u52B9\u306A\u30DE\u30EB\u30C1\u30EA\u30EA\u30FC\u30B9jar\u30D5\u30A1\u30A4\u30EB{0}\u304C\u524A\u9664\u3055\u308C\u307E\u3057\u305F" },
            { "error.validator.names.mismatch", "\u30A8\u30F3\u30C8\u30EA: {0}\u306B\u306F\u3001\u5185\u90E8\u540D{1}\u3092\u6301\u3064\u30AF\u30E9\u30B9\u304C\u542B\u307E\u308C\u307E\u3059\u304C\u3001\u540D\u524D\u304C\u4E00\u81F4\u3057\u307E\u305B\u3093" },
            { "error.validator.new.public.class", "\u30A8\u30F3\u30C8\u30EA: {0}\u306B\u306F\u3001\u30D9\u30FC\u30B9\u30FB\u30A8\u30F3\u30C8\u30EA\u306B\u5B58\u5728\u3057\u306A\u3044\u65B0\u3057\u3044public\u30AF\u30E9\u30B9\u304C\u542B\u307E\u308C\u307E\u3059" },
            { "error.validator.version.notnumber", "\u30A8\u30F3\u30C8\u30EA\u540D: {0}\u306B\u30D0\u30FC\u30B8\u30E7\u30F3\u756A\u53F7\u304C\u3042\u308A\u307E\u305B\u3093" },
            { "error.write.file", "\u65E2\u5B58jar\u30D5\u30A1\u30A4\u30EB\u306E\u66F8\u8FBC\u307F\u4E2D\u306B\u30A8\u30E9\u30FC\u304C\u767A\u751F\u3057\u307E\u3057\u305F" },
            { "main.help.opt.any", " \u3069\u306E\u30E2\u30FC\u30C9\u3067\u3082\u6709\u52B9\u306A\u64CD\u4F5C\u4FEE\u98FE\u5B50:\n\n  -C DIR                     \u6307\u5B9A\u306E\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA\u306B\u5909\u66F4\u3057\u3001\u6B21\u306E\u30D5\u30A1\u30A4\u30EB\u3092\n                             \u53D6\u308A\u8FBC\u307F\u307E\u3059" },
            { "main.help.opt.any.file", "  -f\u3001--file=FILE            \u30A2\u30FC\u30AB\u30A4\u30D6\u30FB\u30D5\u30A1\u30A4\u30EB\u540D\u3002\u7701\u7565\u3057\u305F\u5834\u5408\u3001stdin\u307E\u305F\u306F\n                             stdout\u306E\u3044\u305A\u308C\u304B\u304C\u64CD\u4F5C\u306B\u57FA\u3065\u3044\u3066\u4F7F\u7528\u3055\u308C\u307E\u3059\n      --release VERSION      \u6B21\u306E\u3059\u3079\u3066\u306E\u30D5\u30A1\u30A4\u30EB\u3092jar\u306E\u30D0\u30FC\u30B8\u30E7\u30CB\u30F3\u30B0\u3055\u308C\u305F\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA\n                             (\u3064\u307E\u308A\u3001META-INF/versions/VERSION/)\u306B\u914D\u7F6E\u3057\u307E\u3059" },
            { "main.help.opt.any.verbose", "  -v\u3001--verbose              \u6A19\u6E96\u51FA\u529B\u306B\u8A73\u7D30\u306A\u51FA\u529B\u3092\u751F\u6210\u3057\u307E\u3059" },
            { "main.help.opt.create", " \u4F5C\u6210\u30E2\u30FC\u30C9\u3067\u306E\u307F\u6709\u52B9\u306A\u64CD\u4F5C\u4FEE\u98FE\u5B50:\n" },
            { "main.help.opt.create.normalize", "  -n, --normalize            \u65B0\u3057\u3044jar\u30A2\u30FC\u30AB\u30A4\u30D6\u306E\u4F5C\u6210\u5F8C\u3001\u542B\u307E\u308C\u308B\u60C5\u5831\u3092\n                             \u6B63\u898F\u5316\u3057\u307E\u3059\u3002\u3053\u306E\u30AA\u30D7\u30B7\u30E7\u30F3\u306F\u975E\u63A8\u5968\u3067\u3042\u308A\u3001\n                             \u4ECA\u5F8C\u306EJDK\u30EA\u30EA\u30FC\u30B9\u3067\u524A\u9664\u3055\u308C\u308B\u4E88\u5B9A\u3067\u3059" },
            { "main.help.opt.create.update", " \u4F5C\u6210\u307E\u305F\u306F\u66F4\u65B0\u30E2\u30FC\u30C9\u3067\u306E\u307F\u6709\u52B9\u306A\u64CD\u4F5C\u4FEE\u98FE\u5B50:\n" },
            { "main.help.opt.create.update.do-not-resolve-by-default", "      --do-not-resolve-by-default  \u30E2\u30B8\u30E5\u30FC\u30EB\u306E\u30C7\u30D5\u30A9\u30EB\u30C8\u306E\u30EB\u30FC\u30C8\u8A2D\u5B9A\u304B\u3089\u9664\u5916\u3057\u307E\u3059" },
            { "main.help.opt.create.update.hash-modules", "      --hash-modules=PATTERN \u30E2\u30B8\u30E5\u30E9jar\u306E\u4F5C\u6210\u6642\u307E\u305F\u306F\u975E\u30E2\u30B8\u30E5\u30E9jar\u306E\u66F4\u65B0\u6642\u306B\n                             \u6307\u5B9A\u306E\u30D1\u30BF\u30FC\u30F3\u306B\u4E00\u81F4\u3057\u3001\u76F4\u63A5\u307E\u305F\u306F\u9593\u63A5\u7684\u306B\n                             \u4F9D\u5B58\u3057\u3066\u3044\u308B\u30E2\u30B8\u30E5\u30FC\u30EB\u306E\u30CF\u30C3\u30B7\u30E5\u3092\n                             \u8A08\u7B97\u304A\u3088\u3073\u8A18\u9332\u3057\u307E\u3059" },
            { "main.help.opt.create.update.index", " \u4F5C\u6210\u3001\u66F4\u65B0\u304A\u3088\u3073\u7D22\u5F15\u751F\u6210\u30E2\u30FC\u30C9\u3067\u306E\u307F\u6709\u52B9\u306A\u64CD\u4F5C\u4FEE\u98FE\u5B50:\n" },
            { "main.help.opt.create.update.index.no-compress", "  -0, --no-compress          \u683C\u7D0D\u306E\u307F\u3002ZIP\u5727\u7E2E\u3092\u4F7F\u7528\u3057\u307E\u305B\u3093" },
            { "main.help.opt.create.update.main-class", "  -e\u3001--main-class=CLASSNAME \u30E2\u30B8\u30E5\u30E9\u307E\u305F\u306F\u5B9F\u884C\u53EF\u80FD\u306Ajar\u30A2\u30FC\u30AB\u30A4\u30D6\u306B\n                             \u30D0\u30F3\u30C9\u30EB\u3055\u308C\u305F\u30B9\u30BF\u30F3\u30C9\u30A2\u30ED\u30F3\u30FB\u30A2\u30D7\u30EA\u30B1\u30FC\u30B7\u30E7\u30F3\u306E\n                             \u30A2\u30D7\u30EA\u30B1\u30FC\u30B7\u30E7\u30F3\u30FB\u30A8\u30F3\u30C8\u30EA\u30FB\u30DD\u30A4\u30F3\u30C8" },
            { "main.help.opt.create.update.manifest", "  -m\u3001--manifest=FILE        \u6307\u5B9A\u306E\u30DE\u30CB\u30D5\u30A7\u30B9\u30C8\u30FB\u30D5\u30A1\u30A4\u30EB\u304B\u3089\u30DE\u30CB\u30D5\u30A7\u30B9\u30C8\u60C5\u5831\u3092\n                             \u53D6\u308A\u8FBC\u307F\u307E\u3059" },
            { "main.help.opt.create.update.module-path", "  -p\u3001--module-path          \u30CF\u30C3\u30B7\u30E5\u3092\u751F\u6210\u3059\u308B\u30E2\u30B8\u30E5\u30FC\u30EB\u4F9D\u5B58\u6027\n                             \u306E\u5834\u6240" },
            { "main.help.opt.create.update.module-version", "      --module-version=VERSION    \u30E2\u30B8\u30E5\u30E9jar\u306E\u4F5C\u6210\u6642\u307E\u305F\u306F\u975E\u30E2\u30B8\u30E5\u30E9jar\u306E\u66F4\u65B0\u6642\u306E\n                             \u30E2\u30B8\u30E5\u30FC\u30EB\u30FB\u30D0\u30FC\u30B8\u30E7\u30F3" },
            { "main.help.opt.create.update.no-manifest", "  -M\u3001--no-manifest          \u30A8\u30F3\u30C8\u30EA\u306E\u30DE\u30CB\u30D5\u30A7\u30B9\u30C8\u30FB\u30D5\u30A1\u30A4\u30EB\u3092\u4F5C\u6210\u3057\u307E\u305B\u3093" },
            { "main.help.opt.create.update.warn-if-resolved", "      --warn-if-resolved     \u30E2\u30B8\u30E5\u30FC\u30EB\u304C\u89E3\u6C7A\u3055\u308C\u3066\u3044\u308B\u5834\u5408\u306F\u3001\u8B66\u544A\u3092\u767A\u884C\u3059\u308B\n                             \u30C4\u30FC\u30EB\u306E\u30D2\u30F3\u30C8\u3002\u975E\u63A8\u5968\u3001\u524A\u9664\u4E88\u5B9A\u306E\u975E\u63A8\u5968\u307E\u305F\u306F\n                             \u5B9F\u9A13\u7684\u306E\u3044\u305A\u308C\u304B" },
            { "main.help.opt.main", " \u30E1\u30A4\u30F3\u64CD\u4F5C\u30E2\u30FC\u30C9:\n" },
            { "main.help.opt.main.create", "  -c\u3001--create               \u30A2\u30FC\u30AB\u30A4\u30D6\u3092\u4F5C\u6210\u3057\u307E\u3059" },
            { "main.help.opt.main.describe-module", "  -d, --describe-module      \u30E2\u30B8\u30E5\u30FC\u30EB\u30FB\u30C7\u30A3\u30B9\u30AF\u30EA\u30D7\u30BF\u307E\u305F\u306F\u81EA\u52D5\u30E2\u30B8\u30E5\u30FC\u30EB\u540D\u3092\u51FA\u529B\u3057\u307E\u3059" },
            { "main.help.opt.main.extract", "  -x\u3001--extract              \u6307\u5B9A\u306E(\u307E\u305F\u306F\u3059\u3079\u3066\u306E)\u30D5\u30A1\u30A4\u30EB\u3092\u30A2\u30FC\u30AB\u30A4\u30D6\u304B\u3089\u62BD\u51FA\u3057\u307E\u3059" },
            { "main.help.opt.main.generate-index", "  -i,\u3001--generate-index=FILE  \u6307\u5B9A\u306Ejar\u30A2\u30FC\u30AB\u30A4\u30D6\u306E\u7D22\u5F15\u60C5\u5831\u3092\n                             \u751F\u6210\u3057\u307E\u3059" },
            { "main.help.opt.main.list", "  -t\u3001--list                 \u30A2\u30FC\u30AB\u30A4\u30D6\u306E\u5185\u5BB9\u3092\u4E00\u89A7\u8868\u793A\u3057\u307E\u3059" },
            { "main.help.opt.main.update", "  -u\u3001--update               \u65E2\u5B58\u306Ejar\u30A2\u30FC\u30AB\u30A4\u30D6\u3092\u66F4\u65B0\u3057\u307E\u3059" },
            { "main.help.opt.other", " \u305D\u306E\u4ED6\u306E\u30AA\u30D7\u30B7\u30E7\u30F3:\n" },
            { "main.help.opt.other.help", "  -?\u3001-h\u3001--help[:compat]        \u3053\u308C(\u30AA\u30D7\u30B7\u30E7\u30F3\u3067\u4E92\u63DB\u6027)\u3092help\u306B\u6307\u5B9A\u3057\u307E\u3059" },
            { "main.help.opt.other.help-extra", "      --help-extra           \u8FFD\u52A0\u30AA\u30D7\u30B7\u30E7\u30F3\u306E\u30D8\u30EB\u30D7\u3092\u63D0\u4F9B\u3057\u307E\u3059" },
            { "main.help.opt.other.version", "      --version              \u30D7\u30ED\u30B0\u30E9\u30E0\u30FB\u30D0\u30FC\u30B8\u30E7\u30F3\u3092\u51FA\u529B\u3057\u307E\u3059" },
            { "main.help.postopt", " \u30E2\u30B8\u30E5\u30FC\u30EB\u30FB\u30C7\u30A3\u30B9\u30AF\u30EA\u30D7\u30BF'module-info.class'\u304C\u6307\u5B9A\u306E\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA\u306E\u30EB\u30FC\u30C8\u307E\u305F\u306F\n jar\u30A2\u30FC\u30AB\u30A4\u30D6\u81EA\u4F53\u306E\u30EB\u30FC\u30C8\u306B\u3042\u308B\u5834\u5408\u3001\u30A2\u30FC\u30AB\u30A4\u30D6\u306F\u30E2\u30B8\u30E5\u30E9jar\u3067\u3059\u3002\n \u6B21\u306E\u64CD\u4F5C\u306F\u3001\u30E2\u30B8\u30E5\u30E9jar\u306E\u4F5C\u6210\u6642\u307E\u305F\u306F\u65E2\u5B58\u306E\u975E\u30E2\u30B8\u30E5\u30E9jar\u306E\u66F4\u65B0\u6642\u306B\n \u306E\u307F\u6709\u52B9\u3067\u3059:  '--module-version'\u3001\n '--hash-modules'\u304A\u3088\u3073'--module-path'\u3002\n\n \u30ED\u30F3\u30B0\u30FB\u30AA\u30D7\u30B7\u30E7\u30F3\u3078\u306E\u5FC5\u9808\u307E\u305F\u306F\u30AA\u30D7\u30B7\u30E7\u30F3\u306E\u5F15\u6570\u306F\u3001\u5BFE\u5FDC\u3059\u308B\u30B7\u30E7\u30FC\u30C8\u30FB\u30AA\u30D7\u30B7\u30E7\u30F3\n \u306B\u5BFE\u3057\u3066\u3082\u5FC5\u9808\u307E\u305F\u306F\u30AA\u30D7\u30B7\u30E7\u30F3\u306B\u306A\u308A\u307E\u3059\u3002" },
            { "main.help.preopt", "\u4F7F\u7528\u65B9\u6CD5: jar [OPTION...] [ [--release VERSION] [-C dir] files] ...\njar\u306F\u30AF\u30E9\u30B9\u304A\u3088\u3073\u30EA\u30BD\u30FC\u30B9\u306E\u30A2\u30FC\u30AB\u30A4\u30D6\u3092\u4F5C\u6210\u3057\u3001\u30A2\u30FC\u30AB\u30A4\u30D6\u304B\u3089\u500B\u3005\u306E\u30AF\u30E9\u30B9\u307E\u305F\u306F\n\u30EA\u30BD\u30FC\u30B9\u3092\u64CD\u4F5C\u307E\u305F\u306F\u5FA9\u5143\u3067\u304D\u307E\u3059\u3002\n\n \u4F8B:\n # 2\u3064\u306E\u30AF\u30E9\u30B9\u30FB\u30D5\u30A1\u30A4\u30EB\u3092\u542B\u3080classes.jar\u3068\u3044\u3046\u30A2\u30FC\u30AB\u30A4\u30D6\u3092\u4F5C\u6210\u3059\u308B:\n jar --create --file classes.jar Foo.class Bar.class\n # foo/\u306E\u3059\u3079\u3066\u306E\u30D5\u30A1\u30A4\u30EB\u3092\u542B\u3080\u3001\u65E2\u5B58\u306E\u30DE\u30CB\u30D5\u30A7\u30B9\u30C8\u3092\u4F7F\u7528\u3057\u305F\u30A2\u30FC\u30AB\u30A4\u30D6\u3092\u4F5C\u6210\u3059\u308B:\n jar --create --file classes.jar --manifest mymanifest -C foo/ .\n # \u30E2\u30B8\u30E5\u30E9jar\u30A2\u30FC\u30AB\u30A4\u30D6\u3092\u4F5C\u6210\u3059\u308B\u3002\u30E2\u30B8\u30E5\u30FC\u30EB\u30FB\u30C7\u30A3\u30B9\u30AF\u30EA\u30D7\u30BF\u306Fclasses/module-info.class\u306B\n # \u3042\u308B:\n jar --create --file foo.jar --main-class com.foo.Main --module-version 1.0\n     -C foo/ classes resources\n # \u65E2\u5B58\u306E\u975E\u30E2\u30B8\u30E5\u30E9jar\u3092\u30E2\u30B8\u30E5\u30E9jar\u306B\u66F4\u65B0\u3059\u308B:\n jar --update --file foo.jar --main-class com.foo.Main --module-version 1.0\n     -C foo/ module-info.class\n # \u8907\u6570\u30EA\u30EA\u30FC\u30B9jar\u3092\u4F5C\u6210\u3057\u3001\u4E00\u90E8\u306E\u30D5\u30A1\u30A4\u30EB\u3092META-INF/versions/9\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA\u306B\u914D\u7F6E\u3059\u308B:\n jar --create --file mr.jar -C foo classes --release 9 -C foo9 classes\n\njar\u30B3\u30DE\u30F3\u30C9\u3092\u77ED\u7E2E\u307E\u305F\u306F\u7C21\u7565\u5316\u3059\u308B\u306B\u306F\u3001\u500B\u5225\u306E\u30C6\u30AD\u30B9\u30C8\u30FB\u30D5\u30A1\u30A4\u30EB\u3067\u5F15\u6570\u3092\u6307\u5B9A\u3057\u3001\n\u8A18\u53F7(@)\u3092\u63A5\u982D\u8F9E\u3068\u3057\u3066\u4F7F\u7528\u3057\u3066jar\u30B3\u30DE\u30F3\u30C9\u306B\u6E21\u3057\u307E\u3059\u3002\n\n \u4F8B:\n # \u8FFD\u52A0\u30AA\u30D7\u30B7\u30E7\u30F3\u304A\u3088\u3073\u30AF\u30E9\u30B9\u30FB\u30D5\u30A1\u30A4\u30EB\u306E\u30EA\u30B9\u30C8\u3092\u30D5\u30A1\u30A4\u30EBclasses.list\u304B\u3089\u8AAD\u8FBC\u307F\u307E\u3059\n jar --create --file my.jar @classes.list\n" },
            { "main.usage.summary", "\u4F7F\u7528\u65B9\u6CD5: jar [OPTION...] [ [--release VERSION] [-C dir] files] ..." },
            { "main.usage.summary.try", "\u8A73\u7D30\u306F\u3001`jar --help'\u3092\u5B9F\u884C\u3057\u3066\u304F\u3060\u3055\u3044\u3002" },
            { "out.added.manifest", "\u30DE\u30CB\u30D5\u30A7\u30B9\u30C8\u304C\u8FFD\u52A0\u3055\u308C\u307E\u3057\u305F" },
            { "out.added.module-info", "module-info\u304C\u8FFD\u52A0\u3055\u308C\u307E\u3057\u305F: {0}" },
            { "out.adding", "{0}\u3092\u8FFD\u52A0\u4E2D\u3067\u3059" },
            { "out.automodule", "\u30E2\u30B8\u30E5\u30FC\u30EB\u30FB\u30C7\u30A3\u30B9\u30AF\u30EA\u30D7\u30BF\u304C\u898B\u3064\u304B\u308A\u307E\u305B\u3093\u3002\u81EA\u52D5\u30E2\u30B8\u30E5\u30FC\u30EB\u304C\u5C0E\u51FA\u3055\u308C\u307E\u3057\u305F\u3002" },
            { "out.create", "  {0}\u304C\u4F5C\u6210\u3055\u308C\u307E\u3057\u305F" },
            { "out.deflated", "({0}%\u53CE\u7E2E\u3055\u308C\u307E\u3057\u305F)" },
            { "out.extracted", "{0}\u304C\u62BD\u51FA\u3055\u308C\u307E\u3057\u305F" },
            { "out.ignore.entry", "\u30A8\u30F3\u30C8\u30EA{0}\u3092\u7121\u8996\u3057\u307E\u3059" },
            { "out.inflated", " {0}\u304C\u5C55\u958B\u3055\u308C\u307E\u3057\u305F" },
            { "out.size", "(\u5165={0})(\u51FA={1})" },
            { "out.stored", "(0%\u683C\u7D0D\u3055\u308C\u307E\u3057\u305F)" },
            { "out.update.manifest", "\u30DE\u30CB\u30D5\u30A7\u30B9\u30C8\u304C\u66F4\u65B0\u3055\u308C\u307E\u3057\u305F" },
            { "out.update.module-info", "module-info\u304C\u66F4\u65B0\u3055\u308C\u307E\u3057\u305F: {0}" },
            { "usage.compat", "\u4E92\u63DB\u6027\u30A4\u30F3\u30BF\u30D5\u30A7\u30FC\u30B9: \n\u4F7F\u7528\u65B9\u6CD5: jar {ctxui}[vfmn0PMe] [jar-file] [manifest-file] [entry-point] [-C dir] files] ...\n\u30AA\u30D7\u30B7\u30E7\u30F3:\n    -c \u30A2\u30FC\u30AB\u30A4\u30D6\u3092\u65B0\u898F\u4F5C\u6210\u3059\u308B\n    -t \u30A2\u30FC\u30AB\u30A4\u30D6\u306E\u5185\u5BB9\u3092\u4E00\u89A7\u8868\u793A\u3059\u308B\n    -x \u6307\u5B9A\u306E(\u307E\u305F\u306F\u3059\u3079\u3066\u306E)\u30D5\u30A1\u30A4\u30EB\u3092\u30A2\u30FC\u30AB\u30A4\u30D6\u304B\u3089\u62BD\u51FA\u3059\u308B\n    -u \u65E2\u5B58\u30A2\u30FC\u30AB\u30A4\u30D6\u3092\u66F4\u65B0\u3059\u308B\n    -v \u6A19\u6E96\u51FA\u529B\u306B\u8A73\u7D30\u306A\u51FA\u529B\u3092\u751F\u6210\u3059\u308B\n    -f \u30A2\u30FC\u30AB\u30A4\u30D6\u30FB\u30D5\u30A1\u30A4\u30EB\u540D\u3092\u6307\u5B9A\u3059\u308B\n    -m \u6307\u5B9A\u306E\u30DE\u30CB\u30D5\u30A7\u30B9\u30C8\u30FB\u30D5\u30A1\u30A4\u30EB\u304B\u3089\u30DE\u30CB\u30D5\u30A7\u30B9\u30C8\u60C5\u5831\u3092\u53D6\u308A\u8FBC\u3080\n    -e \u5B9F\u884C\u53EF\u80FDjar\u30D5\u30A1\u30A4\u30EB\u306B\u30D0\u30F3\u30C9\u30EB\u3055\u308C\u305F\u30B9\u30BF\u30F3\u30C9\u30A2\u30ED\u30F3\u30FB\u30A2\u30D7\u30EA\u30B1\u30FC\u30B7\u30E7\u30F3\u306E\n        \u30A8\u30F3\u30C8\u30EA\u30FB\u30DD\u30A4\u30F3\u30C8\u3092\u6307\u5B9A\u3059\u308B\n    -0 \u683C\u7D0D\u306E\u307F\u3002ZIP\u5727\u7E2E\u3092\u4F7F\u7528\u3057\u306A\u3044\n    -P \u30D5\u30A1\u30A4\u30EB\u540D\u306E\u5148\u982D\u306E'/' (\u7D76\u5BFE\u30D1\u30B9)\u304A\u3088\u3073\"..\" (\u89AA\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA)\u30B3\u30F3\u30DD\u30FC\u30CD\u30F3\u30C8\u3092\u4FDD\u6301\u3059\u308B\n    -M \u30A8\u30F3\u30C8\u30EA\u306E\u30DE\u30CB\u30D5\u30A7\u30B9\u30C8\u30FB\u30D5\u30A1\u30A4\u30EB\u3092\u4F5C\u6210\u3057\u306A\u3044\n    -i \u6307\u5B9A\u306Ejar\u30D5\u30A1\u30A4\u30EB\u306E\u7D22\u5F15\u60C5\u5831\u3092\u751F\u6210\u3059\u308B\n    -C \u6307\u5B9A\u306E\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA\u306B\u5909\u66F4\u3057\u3001\u6B21\u306E\u30D5\u30A1\u30A4\u30EB\u3092\u53D6\u308A\u8FBC\u3080\n\u30D5\u30A1\u30A4\u30EB\u304C\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA\u306E\u5834\u5408\u306F\u518D\u5E30\u7684\u306B\u51E6\u7406\u3055\u308C\u307E\u3059\u3002\n\u30DE\u30CB\u30D5\u30A7\u30B9\u30C8\u30FB\u30D5\u30A1\u30A4\u30EB\u540D\u3001\u30A2\u30FC\u30AB\u30A4\u30D6\u30FB\u30D5\u30A1\u30A4\u30EB\u540D\u304A\u3088\u3073\u30A8\u30F3\u30C8\u30EA\u30FB\u30DD\u30A4\u30F3\u30C8\u540D\u306F\u3001\n\u30D5\u30E9\u30B0'm'\u3001'f'\u3001'e'\u306E\u6307\u5B9A\u3068\u540C\u3058\u9806\u756A\u3067\u6307\u5B9A\u3059\u308B\u5FC5\u8981\u304C\u3042\u308A\u307E\u3059\u3002\n\n\u4F8B1: 2\u3064\u306E\u30AF\u30E9\u30B9\u30FB\u30D5\u30A1\u30A4\u30EB\u3092\u30A2\u30FC\u30AB\u30A4\u30D6classes.jar\u306B\u4FDD\u5B58\u3059\u308B:\n     jar cvf classes.jar Foo.class Bar.class\n\u4F8B2: \u65E2\u5B58\u306E\u30DE\u30CB\u30D5\u30A7\u30B9\u30C8\u30FB\u30D5\u30A1\u30A4\u30EB'mymanifest'\u3092\u4F7F\u7528\u3057\u3001foo/\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA\u306E\n     \u5168\u30D5\u30A1\u30A4\u30EB\u3092'classes.jar'\u306B\u30A2\u30FC\u30AB\u30A4\u30D6\u3059\u308B:\n     jar cvfm classes.jar mymanifest -C foo/ . \n" },
            { "warn.flag.is.deprecated", "\u8B66\u544A: {0}\u30AA\u30D7\u30B7\u30E7\u30F3\u306F\u975E\u63A8\u5968\u3067\u3042\u308A\u3001\u4ECA\u5F8C\u306EJDK\u30EA\u30EA\u30FC\u30B9\u3067\u524A\u9664\u3055\u308C\u308B\u4E88\u5B9A\u3067\u3059\u3002\n" },
            { "warn.release.unexpected.versioned.entry", "\u4E88\u671F\u3057\u306A\u3044\u30D0\u30FC\u30B8\u30E7\u30CB\u30F3\u30B0\u6E08\u30A8\u30F3\u30C8\u30EA{0}" },
            { "warn.validator.concealed.public.class", "\u8B66\u544A : \u30A8\u30F3\u30C8\u30EA{0}\u306F\u3001\u96A0\u3057\u30D1\u30C3\u30B1\u30FC\u30B8\u5185\u306Epublic\u30AF\u30E9\u30B9\u3067\u3059\u3002\n\u30AF\u30E9\u30B9\u30D1\u30B9\u306B\u3053\u306Ejar\u3092\u914D\u7F6E\u3059\u308B\u3068\u3001\u4E92\u63DB\u6027\u306E\u306A\u3044\npublic\u30A4\u30F3\u30BF\u30D5\u30A7\u30FC\u30B9\u304C\u751F\u6210\u3055\u308C\u307E\u3059" },
            { "warn.validator.identical.entry", "\u8B66\u544A : \u30A8\u30F3\u30C8\u30EA{0}\u306B\u306F\u3001jar\u306B\u3059\u3067\u306B\u5B58\u5728\u3059\u308B\n\u30A8\u30F3\u30C8\u30EA\u3068\u540C\u3058\u30AF\u30E9\u30B9\u304C\u542B\u307E\u308C\u307E\u3059" },
            { "warn.validator.resources.with.same.name", "\u8B66\u544A : \u30A8\u30F3\u30C8\u30EA{0}\u3001\u540C\u3058\u540D\u524D\u3092\u6301\u3064\u8907\u6570\u306E\u30EA\u30BD\u30FC\u30B9" },
        };
    }
}
