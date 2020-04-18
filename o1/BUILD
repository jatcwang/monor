load("@io_bazel_rules_scala//scala:scala.bzl", "scala_binary")

scala_binary(
  name = "o1",
  srcs = glob(["**/*.scala"]),
  deps = ["//k1:k1", "//k2:k2"],
  main_class = "o.Main1",
  unused_dependency_checker_mode = "error",
)
