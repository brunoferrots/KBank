class Account constructor (holder : String, number: Int) {
    private var holder: String = holder
    private var number: Int = number
    private var balance: Double = 0.0

    fun deposit(value: Double) {
        if (value < 1)
            println("Error : invalid value")

        this.balance += value
    }

    fun draw(value: Double) {
        if (value > balance)
            return println("Error : invalid value")

        this.balance -= value
    }

    fun transfer(account: Account, value: Double): Boolean {
        if (value > balance) {
            println("Error : invalid value")
            return false
        }

        this.draw(value)
        account.deposit(value)
        return true
    }

    fun getBalance(): Double {
        return this.balance
    }

    fun getHolder(): String {
        return this.holder
    }

    fun getNumber(): Int {
        return this.number
    }
}