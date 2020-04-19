load("@io_bazel_rules_scala//scala:scala.bzl", "scala_binary")

scala_binary(
    name = "o2",
    srcs = glob(["main/**/*.scala"]),
    main_class = "o.Main2",
    unused_dependency_checker_mode = "error",
    deps = [
        "//k2:lib",
        "//k3:lib",
    ],
)
