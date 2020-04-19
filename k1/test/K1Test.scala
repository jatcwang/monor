package k
import org.scalatest.WordSpec

class K1Test extends WordSpec {
  "k1 go" in {
    assert(K1.call().contains("K1"))
  }
}
