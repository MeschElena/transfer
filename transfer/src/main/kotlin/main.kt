fun main() {
    val amount = 12000
    val minimumComission = 3500
    val percentage = .75

    val commission = if (amount * percentage <= minimumComission) minimumComission else amount * percentage
    val commissionPrint = commission.toInt()
    println("Ваша комиссия: $commissionPrint копеек")
}