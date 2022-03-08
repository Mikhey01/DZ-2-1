

fun main() {
    val commissionPercentage = 0.75
    val comissionSumm = 3500.0
    val transferAmount1 = 5000


    val amount = transferAmount1 * 100
    val commissionAmount: Double = if (amount/100*commissionPercentage > comissionSumm)
        amount/100*commissionPercentage else comissionSumm
    println("Сумма перевода составляет: ${(amount + commissionAmount)/100} " +
            "из них сумма комиссии: ${commissionAmount/100}")



}