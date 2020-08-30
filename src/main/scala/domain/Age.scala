package domain

case class Age(private val value: Int) {
  require(value >= 0, "年齢は正の値で入力してください")
  require(value < 200, "年齢は200歳未満の範囲で入力してください")

  def asInt: Int = value
}
