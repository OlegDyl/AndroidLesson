package nasledovanie

open class Person (val name: String, val age: Int) /* свойства name и age*/ {
    fun walk() = println("walking")
    fun eat() = println("eating")
    fun sleep() = println("sleeping")

    // теперь создадим отдельный класс Driver, для того чтобы унаследовать класс от другого, нужно поставить двоеточие
    // после первичного конструктора класса, а если его нет, то после имени класса и указать от какого класса мы хотим
    // наследоваться
}