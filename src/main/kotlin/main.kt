package ru.netology

fun main () {
    val amount = 100000
    val interest = 0.0075f
    val minInterest = 3500
    //val message = "Transaction is: "
    //val messageInterest = ", with interest: "

    if ((amount * interest) > minInterest) {
        print("Transaction is: " + (amount - amount * interest) + ", with interest: " + (amount * interest) )
    } else print("Transaction is: " + (amount - minInterest) + ", with interest: " + minInterest)
}