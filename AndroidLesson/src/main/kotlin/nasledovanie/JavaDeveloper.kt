package nasledovanie

class JavaDeveloper : Developer {
    constructor(name: String, age: Int) : super(name, age)
    constructor(name: String, age: Int, exception: Int) : super(name, age, exception)// Будет срабатывать если явно передавать значение

    override fun writeCode() { // переопределили функцию из класса Developer
        println("java developer write java code")
    }
}