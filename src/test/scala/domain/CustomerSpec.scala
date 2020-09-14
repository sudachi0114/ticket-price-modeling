package domain

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.must.Matchers

class CustomerSpec extends AnyFreeSpec with Matchers {

  val myAge: Age = Age(22)
  val customer: CustomerMoc = CustomerMoc(myAge)

  "Customer" - {
    "お客さんモデルを作ることができる" in {

      val expectedAgeValue: Int = 22
      note("あなたの年齢 : " + customer.howOld)
      assert(customer.howOld === expectedAgeValue)
    }

    "お客さんモデルは、各条件下での料金をメソッドとして持つ" in {
      val expectedWeekDayTicketFee:Int = 1800
      note("お客さんの平日のチケット料金 (平日) : " + customer.weekDayTicketFee)
      assert(customer.weekDayTicketFee === expectedWeekDayTicketFee)

      val expectedWeekDayLateTicketFee:Int = 1300
      note("お客さんの平日のチケット料金 (平日, レイト) : " + customer.weekDayLateTicketFee)
      assert(customer.weekDayTicketFee === expectedWeekDayTicketFee)

      val expectedWeekEndHolidayTicketFee:Int = 1800
      note("お客さんのチケット料金 (土日祝日) : " + customer.weekEndHolidayTicketFee)
      assert(customer.weekEndHolidayTicketFee === expectedWeekEndHolidayTicketFee)

      val expectedWeekEndHolidayLateTicketFee:Int = 1300
      note("お客さんのチケット料金 (土日祝日、レイト) : " + customer.weekEndHolidayLateTicketFee)
      assert(customer.weekEndHolidayLateTicketFee === expectedWeekEndHolidayLateTicketFee)

      val expectedTheMovieDayTicketFee:Int = 1100
      note("お客さんのチケット料金 (映画の日) : " + customer.theMovieDayTicketFee)
      assert(customer.theMovieDayTicketFee === expectedTheMovieDayTicketFee)
    }
  }
}
