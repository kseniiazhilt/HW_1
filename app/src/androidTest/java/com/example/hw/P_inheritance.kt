
open class USA {
    protected val countryBudget: Long = 500000000000000
    private val secretDocument: String = "spendings"

    open fun moneyCharity() {
        println("Мы государство USA, мы тратим деньги на благотворительность всего у нас $countryBudget долларов")
    }

}

class Texas: USA(){
    override fun moneyCharity() {
        println("Мы штат USA, мы тратим деньги только на свои нужды")
    }
}

