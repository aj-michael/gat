java_binary(
    name = "gat",
    main_class = "net.ajmichael.gat.Gat",
    runtime_deps = [":gat_library"],
)

java_library(
    name = "gat_library",
    srcs = [
        "Gat.java",
        "GatComponent.java",
    ],
    deps = [
        "//third_party:dagger",
        "@guava//jar",
        "//src/main/java/net/ajmichael/gat/commands",
    ],
)
