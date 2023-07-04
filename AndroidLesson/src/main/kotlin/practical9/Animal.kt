package practical9

import kotlin.collections.MutableList as MutableList1


open class Animal(var energy: Int, var weight: Int, var age: Int, val maxAge: Int = 15, var name: String)  {  // Энергия, вес, максимальный возраст и имя должны инициализироваться через конструктор.

    //constructor(var reserve: MutableList) : super (reserve)

    var isTooOld = if (age <= maxAge) true else false

/*     open fun repeat(functions: Int) {
        repeat(functions) {
            iterations()
        }
    }*/

    open fun iterations() = when ((1..4).random()) {
            1 -> sleep()
            2 -> nutrition()
            3 -> go()
            4 -> birth() /*{
                val baby = birth()
                reserve.add(child)}*/

        else -> println("Ошибка")
    }



    open fun sleep() {
        energy = energy + 5
        age = age + 1
        print("${name} спит ")
        //println(("Имя - ${reserve()[1].name}, Возраст - ${reserve[1].age}, Энергия - ${reserve[1].energy}, Вес - ${reserve[1].weight}"))
    }

    open fun nutrition() {

        energy = energy + 3
        weight = weight + 1
        age = age + 1
        println("${name} ест")
    }

    open fun go() {
        energy = energy - 5
        weight = weight - 1
        age = age + 1
        println("${name} передвигается")
    }

    open fun birth() {
        println("Родился пес")
         reserve.add(
             Dog(7, 10, 7, 15, "Собака"))
          //  Dog(energyArg = (1..10).random(), weightArg = (1..5).random(), ageArg = 0, maxAgeArg = 15, nameArg = "Собака"))

        // для каждого класса переопределить эту функцию в плане кто родился
    }
 /*   open fun birth(): Animal { // Функция рождения. Имя и максимальный возраст как у родителя. Энергия случайно от 1-10. Вес случайно от 1-5.
        val child = Animal(
            energy = (1..10).random(),
            weight = (1..5).random(),
            maxAge = maxAge,
            name = this.name,
            age = 0)

        println("Родился $name у которого ${this.energy} энергии и вес $weight")
        return child
        }*/

    //companion object
}

/*    open fun birth() { // Функция рождения. Имя и максимальный возраст как у родителя. Энергия случайно от 1-10. Вес случайно от 1-5.
        val child = Animal(
            energy = (1..10).random(),
            weight = (1..5).random(),
            maxAge = maxAge,
            name = this.name,
            age = 0)

        println("Родился $name у которого $energy энергии и вес $weight")
        // return child
    }
}*/

/*3.  Добавьте вычисляемое свойство isTooOld — Boolean. Оно должно сравнивать текущий возраст
    с максимальным и возвращать true, если текущий возраст равен или больше максимального.*/