package practical9

fun main() {



    println("Сколько дней проживет ваш зоопарк(максимальное число 30)?")
    var functions: Int = readLine()?.toIntOrNull() ?: return
    if (functions !in 0..30) {
        println("Попробуйте еще раз: ")
        functions = readLine()?.toIntOrNull() ?: return

    }




    while (functions > 0) {
        val result = reserve.map { it.iterations() }// применение функции для каждого элемента списка отдельно
       // println("Имя - ${reserve[1].name}, Возраст - ${reserve[1].age}, Энергия - ${reserve[1].energy}, Вес - ${reserve[1].weight}")
        println(result)
        functions--
    }
       println(reserve.size)

}

    var reserve = mutableListOf(
    Bird(10, 7, 11, 15, "Птица"),
    Bird(8, 8, 6, 15, "Птица"),
    Bird(3, 4, 4, 15, "Птица"),
    Bird(6, 6, 10, 15, "Птица"),
    Bird(10, 3, 2, 15, "Птица"),
    Fish(5, 6, 1, 15, "Рыба"),
    Fish(10, 4, 8, 15, "Рыба"),
    Fish(4, 3, 5, 15, "Рыба"),
    Dog(10, 7, 6, 15, "Собака"),
    Dog(7, 10, 7, 15, "Собака")
)


/*   // Последний в массиве длинна массива -1 == этому элементу тогда последний раз выполняется функция.
    // чтобы обратиться к последнему элементу Kotlin предоставляет специальное свойство lastInde
            for (i in list.indices){
    println(list[i] * i) // в массивах и списках 88 строка
}
//reserve.iterations (functions)*/



/*
val numbers = MutableList(10) { Random.nextInt(-10, 10)}
println(numbers)
numbers.removeAll{ it < 0} // удаляет из списка все что меньше 0 можно что больше предельного возраста
println(numbers)
*/

/*
// Для удаления значения из таблиыц необходимо вызвать функцию remove() и передать туда значения ключа.
// Если такой ключ будет найден, то запись будет удалена, если нет, то ничего не произойдет

priceListSorted.remove("Yogurt")
println(priceListSorted)


   fun useFuel(fuelCount: Double) { //  функция использования топлива, которая уменьшает количество топлива на переданное значение
    // useFuel(fuelCount: Double) это не та переменная, что и val fuelCount = 0.0, если мы хотим обратиться к переменной,
    // то внутри функции не обходимо написать this.fuelCount - тогда мы обращаемся к переменной которая прописана вне функции
        this.fuelCount -= fuelCount // this.fuelCount  - это мы обращяемя к полю класса, а fuelCount - мы обращаемся к аргументу функции

    }
*/




