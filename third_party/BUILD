package(default_visibility = ["//visibility:public"])

java_plugin(
    name = "dagger_plugin",
    processor_class = "dagger.internal.codegen.ComponentProcessor",
    deps = [
        ":jsr330_inject",
        "@dagger//jar",
        "@dagger_compiler//jar",
        "@dagger_producers//jar",
        "@guava//jar",
    ],
)

java_import(
    name = "jsr330_inject",
    jars = ["jsr330_inject/javax.inject.jar"],
)

java_library(
    name = "dagger",
    exported_plugins = [":dagger_plugin"],
    exports = [
        "@dagger//jar",
        ":jsr330_inject"
    ],
)
