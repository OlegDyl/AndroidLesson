package nasledovanie

class ScalaDeveloper : Developer {
    constructor(name: String, age: Int) : super(name, age)
    constructor(name: String, age: Int, exception: Int) : super(name, age, exception)// Будет срабатывать если явно передавать значение

     override val paradigm = "finctional" //так мы переопределяем переменную из другого класса

}