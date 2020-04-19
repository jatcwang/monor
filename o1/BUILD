load("@io_bazel_rules_scala//scala:scala.bzl", "scala_binary")

scala_binary(
    name = "o1",
    srcs = glob(["main/**/*.scala"]),
    main_class = "o.Main1",
    unused_dependency_checker_mode = "error",
    deps = [
        "//k1:lib",
        "//k2:lib",
    ],
)
