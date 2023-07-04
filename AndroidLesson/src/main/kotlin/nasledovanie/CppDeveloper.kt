package nasledovanie

class CppDeveloper : Developer {
    constructor(name: String, age: Int) : super(name, age)
    constructor(name: String, age: Int, exception: Int) : super(name, age, exception)// Будет срабатывать если явно передавать значение

    override fun writeCode() {
        super.writeCode() // это явный вызов родительской функции
        println("c++ code") // после родительской функции в консоль выведется этот текс
    }

    override fun toString(): String = when(experience) { // родительскую функцию мы изменить не можем, поэтому скопируем у нее код
        0 -> "intern"
        in 1..3 -> "junior"
        in 4..6 -> "middle"
        in 6..8 -> "senior"
        else -> "leading"
    }

}