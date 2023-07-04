package module8.ModifikatoryDostupaGeterryISettery

import kotlin.random.Random

class Car(val brand: String, val model: String, val color: String = "Black") {

    // Научим наш автомобиль разгоняться и тормозить для этого создадим функции accelerate и decelerate

    constructor(descriptor: Pair<String, String>, color: String): this(
        brand = descriptor.first,
        model = descriptor.second,
        color = color
    )
    {
        println("secondary constructor")
    }


    init { // код в блоках init становится частью основного конструктора
        println("Car init")
    }

    var currentSpeed = 0.0 // Переменная скорости
    get() {// пишется возле переменной. Это функция, поэтому у нее есть тело, оно также может быть представлено одним выражением,
        // либо заключено в фигурные скобки
        println("current speed getter")
        return field // важная особенность, если обратиться к полю внутри тела геттера, это создаст рекурсию, поэтому
        // со значением нужно работать через специальную скрытую переменную field - эта переменная имеет точно такой же тип,
        // что и наше поле и хранит текущее значение поля
        }
    // Чтобы объявить сеттер необходимо написать set возле нужной переменной
    set(value) {
        field = value
        println("current speed setter")
    }

    private var fuelCount = 0.0 // Уровень топлива

    init {
        println("Second init")
    }

    fun accelerate(speed: Double) { // функция увеличения скорости
        val needFuel = speed * 0.1
        if (fuelCount > needFuel) {
            currentSpeed += speed
            useFuel(needFuel)// передаем значение в другую функцию!!!!!!!!!!!!!!!!!
        }
        else
            println("недостаточно топлива для ускорения")
    }

    fun decelerate(speed: Double) { // функция уменьшения скорости
        currentSpeed = maxOf(0.0, currentSpeed - speed)    // то же самое написано вгнизу
    /* var finalSpeed = currentSpeed - speed
        currentSpeed = if (finalSpeed < 0) 0.0
        else finalSpeed = currentSpeed
        currentSpeed -= speed*/
    }

    private fun useFuel(fuelCount: Double) { //  функция использования топлива, которая уменьшает количество топлива на переданное значение
    // useFuel(fuelCount: Double) это не та переменная, что и val fuelCount = 0.0, если мы хотим обратиться к переменной,
    // то внутри функции не обходимо написать this.fuelCount - тогда мы обращаемся к переменной которая прописана вне функции
        this.fuelCount -= fuelCount // this.fuelCount - это мы обращаемcя к полю класса, а fuelCount - мы обращаемся к аргументу функции!!!!!!!!!!!!!

    }


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

