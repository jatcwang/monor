package k

import org.scalatest.WordSpec

class K2Test extends WordSpec {
  "k2 go" in {
    assert(K2.call().contains("K2"))
  }
}
