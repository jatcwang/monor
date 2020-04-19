load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_test")

# hi
scala_library(
    name = "lib",
    srcs = glob(["main/**/*.scala"]),
    visibility = ["//visibility:public"],
)

scala_test(
    name = "test",
    srcs = glob(["test/**/*.scala"]),
    deps = [":lib"],
)
