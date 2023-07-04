package module8.class1

import kotlin.random.Random

class Car {

    // все свойства и методы необходимо указывать внутри класса в фигурных скобках

    val brand = "Audi" // добавили классу car свойство brand
    val model = "A3"
    val color = "Red"

    // определим методы класса, создадим функцию move

    fun move()  { //функция имитирует передвижение автомобиля и выводит расстояние на которое сдвинулся автомобиль
        val distance = Random.nextInt(1, 10)
        println("Car passed $distance km")
    }

    fun start() {
        println(" Car started")
    }

    fun stop(){
        println(" Car stopped")
    }
}