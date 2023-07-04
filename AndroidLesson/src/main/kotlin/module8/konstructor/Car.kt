package module8.konstructor

import kotlin.random.Random

/* Чтобы явно указать конструктор в классе, необходимо поставить скобки после названия класса
Каждый параметр у конструктора может быть объявлен двумя способами
1-й указать им параметра и его тип по аналогии с функциями

class Car(brandArg: String, modelArg: String, colorArg: String) { // в таком виде можно обращаться только при инициализации полей и в специальном блоке init

    // все свойства и методы необходимо указывать внутри класса в фигурных скобках

    val brand = brandArg // нам необходимо явно присвоить значение параметра полям
    val model = modelArg
    val color = colorArg
}

Второй вариант где помимо имени и типа указывается ключевое слова val или var   */

class Car(val brand: String, val model: String, val color: String = "Black")// тогда параметры автоматически становятся полями
// класса, а значит к ним можно обращаться и внутри класса и через экземпляр
{

   constructor(descriptor: Pair<String, String>, color: String): this(
       brand = descriptor.first,
       model = descriptor.second,
       color = color
   )
   {
       println("secondary constructor")
   }

    // а теперь в функции Konstruktor создадим экземпляр автомобиля с помощью дополнительного конструктора
    // В дополнительном конструкторе нельзя описывать поля класса, при попытке описать параметр в качестве поля класса,
    // возникнет ошибка. Данную операцию моно делать только в основном классе.

    /*Конструктор - это функция и точно так же они могут иметь тело и выполнять какие-то операции. Для основного конструктора
    нельзя объявить тело в явном виде поэтому для этого используют специальные блоки init. В них можно размещять код который
    должен выполниться основным конструктором во время создания экземпляра класса. Например, мы можем вывести в консоль сообщение
    о том что наш объект создается.
    */

    init { // код в блоках init становится частью основного конструктора
        println("Car init")
    }
    // таких блоков инициализации может быть несколько и все они выполняются в описанном порядке и могут чередоваться
    // с объявлением полей
    // Дополнительный конструктор вызывает основной с помощью this. Поэтому код во всех блоках Init, а также инициализация
    // свойств выполняется до кода который указан в теле дополнительного конструктора

    val currentSpeed = 0.0

    init {
        println("Second init")
    }

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
