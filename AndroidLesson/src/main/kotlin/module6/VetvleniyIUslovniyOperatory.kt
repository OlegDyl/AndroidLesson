package module6

fun main() {/*

                                       Ветвления и условные оперраторы

   ЦЕЛИ И ЗАДАЧИ:
   - рассмотреть условные операторы
   - научиться решать задачи выбора
   - научиться вводить данные в программу с клавиатуры
   - написать программу, которая выполняет разные действия, в зависимости от условий


                                            Ветвление

   Ветвление - это конструкция языка, обеспечивающая выполнение определенной команды (или блока кода) на основе
   значения некоторого логического выражения (условия)

   Условные  операторы:
   - if - else
   - when

   if (condition) {
        // code block if condition == true
   }  else {
        // code block if condition == false
   }

   if (condition) {
        // code block if condition == true
        // else branch is omitted
   }

   if (condition1) {
        // code block if condition1 == true
   } else if (condition2) {
        // code block if condition2 == true
   } else if (condition3) {
        // code block if condition2 == true
   } else {
        // code block if none of condition is true
   }

       В качестве простого примера напишем функцию которая находит максимальное число из двух заданных: в конце функция max */

    println(max(5, 19))

    /* Частным случаем условного оператора являться отсутствие ветки - else

    fun printIfPositive(n: Int) {
        if(n > 0)                 если n > 0, то отображается n, если нет, то программа пропускает этот блок кода и идет дальше
            println(n)

        println(n + 1000)         этот блок кода отображается при любом n
    }


    Пример с уравнением функция solveEquation */

    println("Enter a")
    val a = readLine()?.toIntOrNull() ?: return  // ?: return  - так мы обрабатываем случай если a == null
    println("Enter b")
    val b = readLine()?.toIntOrNull() ?: return
    println("Enter c")
    val c = readLine()?.toIntOrNull() ?: return

    val x = solveEquation(a, b, c)
    if (x == null)
        println("No solutions")
    else
        println(x)

}

// fun max(a: Int, b: Int): Int = if (a > b) a else b       - та же функция, но в одну строку

fun max(a: Int, b: Int): Int {
    val maxNumber: Int
    if (a > b) {
        maxNumber = a
    } else {
        maxNumber = b
    }
    return  maxNumber
}

fun solveEquation(a: Int, b: Int, c: Int): Double? {
    if (a == 0) return null
    return (c - b) / a.toDouble()
}

fun getDeveloperPosition(expirience: Int): String {
    when (expirience) {
        0 -> return "intern"   // условие стрелка и блок кода который нужно выполнить
        in 1..2 -> return "junior"
        in 3..4 -> return "middle"
        in 4..5 -> return "senior"
        else -> return "leading"
    }
}

fun getUserAccess(isAuthorized: Boolean, role: String): String {
    return when {
        !isAuthorized -> "Restricted"
        role == "Admin" -> "Full"
        role == "Moderator" -> "Limited"
        else -> "Common"
    }
}
