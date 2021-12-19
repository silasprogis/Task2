package ru.netology

fun main () {
    val amount = 10000
    val interest = 0.0075f
    val minInterest = 3500f
    val resultInterest:Float
    if ((amount * interest) > minInterest) {
        resultInterest = amount * interest
    } else { resultInterest = minInterest }

    val amountAfterNet = (amount - (resultInterest))
    val amountAfterRub = amountAfterNet / 100
    val amountAfterKop = (amountAfterRub % 1) * 100
    val resultInterestRub = resultInterest / 100
    val resultInterestKop = (resultInterestRub % 1) * 100

    print("Transaction is: " + String.format("%.0f", amountAfterRub) + " Rub "
            + String.format("%.0f", amountAfterKop) + " Kop., " + "with an interest: "
            + String.format("%.0f", resultInterestRub) + " Rub " + String.format("%.0f", resultInterestKop) + " Kop." )
}