fun main(args: Array<String>) {
//task1
val age1 = 42.0
val age2 = 21.0

//task2
val avg1 = (age1+age2)/2

//task3

//COMPLETE

//task4
val firstName: String = "Zarina"
val lastName: String = "Aslanova"

//task5
val fullName: String = firstName +" "+lastName

//task6
val myDetails: String = "Привет, меня зовут $fullName"

//task7
val Trip: Triple <Int, Int, Int> = Triple(9, 7, 2023)

//task8
val month = Trip.first
val day = Trip.second
val year = Trip.third

//task9
println(month)
println(year)

//task10
    val T: Triple <Int, Int, Int> = Triple(9, 7, 2023)
    val m = Trip.first + 3
    val d = Trip.second
    val y = Trip.third
    val TT = Pair(m, y)
    println(TT)
}