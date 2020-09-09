package domain

case class CustomerMoc(value: Age) {
  def howOld: Int = value.asInt

  def ticketFee: Int = 1000  // ticket の値段を一度 1000 円で固定

  def weekDayTicketFee: Int = 1500   // 平日のチケット料金
  def weekEndHolidayTicketFee: Int = 500  // 土日祝日のチケット料金
}
