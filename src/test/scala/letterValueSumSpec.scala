import letterValueSum.letterSum
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class letterValueSumSpec extends AnyFlatSpec {

  behavior of "letterValueSum"


  it should "Assign every lowercase letter a value, from 1 for a to 26 for z." in {
    letterSum("") shouldBe 0
    letterSum("a") shouldBe 1
    letterSum("z") shouldBe 26
  }

  it should "Find the sum of the values of the letters in the string." in {
    letterSum("cab") shouldBe 6
    letterSum("excellent") shouldBe  100
  }

}
