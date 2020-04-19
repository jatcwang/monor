package k

import org.scalatest.WordSpec

class K3Test extends WordSpec {
  "k3 go" in {
    assert(K3.call().contains("K3"))
  }
}
