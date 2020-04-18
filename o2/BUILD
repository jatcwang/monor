load("@io_bazel_rules_scala//scala:scala.bzl", "scala_binary")

scala_binary(
  name = "o2",
  srcs = glob(["**/*.scala"]),
  deps = ["//k2:k2", "//k3:k3"],
  main_class = "o.Main2",
  unused_dependency_checker_mode = "error",
)
