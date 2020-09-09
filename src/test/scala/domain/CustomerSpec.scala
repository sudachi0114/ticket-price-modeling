package domain

package domain

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.must.Matchers

import scala.reflect.internal.MissingRequirementError

class CustomerSpec extends AnyFreeSpec with Matchers {

  "Customer" - {
    "お客さんモデルを作ることができる" in {
      val myAge = Age(22)
      val customer = CustomerMoc(myAge)

      val expectedAgeValue:Int = 22
      note("あなたの年齢 : " + customer.howOld)
      assert(customer.howOld === expectedAgeValue)

      val expectedTicketFee:Int = 1000
      note("お客さんのチケット料金 (とりあえず) : " + customer.ticketFee)
      assert(customer.ticketFee === expectedTicketFee)

      val expectedWeekDayTicketFee:Int = 1500
      note("お客さんの平日のチケット料金 (平日) : " + customer.weekDayTicketFee)
      assert(customer.weekDayTicketFee === expectedWeekDayTicketFee)

      val expectedWeekEndHolidayTicketFee:Int = 500
      note("お客さんのチケット料金 (土日祝日) : " + customer.ticketFee)
      assert(customer.weekEndHolidayTicketFee === expectedWeekEndHolidayTicketFee)
    }
  }
}
