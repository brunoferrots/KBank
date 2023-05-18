fun main() {
    val acBruno = Account("Bruno", 6190)

    acBruno.deposit(1000.0)
    acBruno.draw(500.0)

    println("This holder of fist account is ${acBruno.getHolder()}, number account : ${acBruno.getNumber()} and your balance : ${acBruno.getBalance()}")

    val acJulia = Account("Julia", 3190)

    acJulia.deposit(1000.0)
    println("This holder of fist account is ${acJulia.getHolder()}, number account : ${acJulia.getNumber()} and your balance : ${acJulia.getBalance()}")

    acBruno.transfer(acJulia, 600.0)

    println("This holder of fist account is ${acBruno.getHolder()}, number account : ${acBruno.getNumber()} and your balance : ${acBruno.getBalance()}")

    println("This holder of fist account is ${acJulia.getHolder()}, number account : ${acJulia.getNumber()} and your balance : ${acJulia.getBalance()}")

}