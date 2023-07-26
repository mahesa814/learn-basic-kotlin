const val APP = "Belajar Kotlin"
const val VERSION = "0.01"
fun main() {
    var firstName: String? = "Mahesa"
    firstName = null
    // error karena firstName bisa null
//    println(firstName.length)
    // cara mengakses yang benar
    println(firstName?.length)
    println("Welcome $APP Version $VERSION ")
}