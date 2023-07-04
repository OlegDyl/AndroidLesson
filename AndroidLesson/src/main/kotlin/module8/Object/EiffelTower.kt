package Object

object EiffelTower {
    private var backligtsOn = false
    val height = 324
    fun turnOnBacklights() {
        println("backlights on")
        backligtsOn = true
    }

    fun turnOffBacklights() {
        println("backlights off")
        backligtsOn = false
    }

}