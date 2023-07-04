package nasledovanie

class KotlinDeveloper : Developer {
    // Рассмотрим вариант с дополнительными конструкторами, для правильного наследования нам все еше необходимо
    // указывать родительский класс и передавать в его конструктор все необходимые аргументы, для этого в дополнительном
    // конструкторе класса KotlinDeveloper(вызывается constructor)
   constructor(name: String, age: Int) : super(name, age)
   constructor(name: String, age: Int, exception: Int) : super(name, age, exception)// Будет срабатывать если явно передавать значение

    override fun writeCode() { // переопределили функцию из класса Developer
        println("kt developer write kt code")
        super.getCoffeeBreak()
    }

    override fun getCoffeeBreak() = true
}