package domain

case class CustomerMoc(value: Age) {
  def howOld: Int = value.asInt

  def weekDayTicketFee: Int = 1800     // 平日のチケット料金
  def weekDayLateTicketFee: Int = 1300 // 平日 (Late) のチケット料金

  def weekEndHolidayTicketFee: Int = 1800     // 土日祝日のチケット料金
  def weekEndHolidayLateTicketFee: Int = 1300 // 土日祝日 (Late) のチケット料金

  def theMovieDayTicketFee: Int = 1100 // 映画の日のチケット料金
}
