package domain

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.must.Matchers

import scala.reflect.internal.MissingRequirementError

class AgeSpec extends AnyFreeSpec with Matchers {

  "Age" - {
    "年齢を格納できる" in {
      val myAge = Age(22)
      val expectedAgeValue:Int = 22
      note("あなたの年齢 : " + myAge)
      assert(myAge.asInt === expectedAgeValue)
    }

    "年齢を負の値で渡すとエラー" in {
      an[IllegalArgumentException] should be thrownBy Age(-30)
    }

    "200歳以上の年齢を渡すとエラー" in {
      an[IllegalArgumentException] should be thrownBy Age(5000)
    }
  }

}
