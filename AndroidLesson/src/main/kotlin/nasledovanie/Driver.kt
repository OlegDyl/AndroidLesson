package nasledovanie

class Driver(nameArg: String, ageArg: Int, val experience: Int) /*Конструктор принимает два арумента имя и возраст */ : Person (nameArg, ageArg) /*передали значение из Driver*/{
  // в классе Driver не нужно указывать var или val, так как эти параметры уже есть в классе Person И класс драйвер
  // при наследовании автоматически получит к себе все доступные поля родительского класса со всеми геттерами и
  // сеттрерами.
  // Поля можно указать через конструктор и в теле класса. Функции только в теле класса

    fun drive() = println("driving")
}