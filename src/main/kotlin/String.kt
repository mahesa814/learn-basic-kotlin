fun main() {
    var firstName: String = "Mahesa"
    var lastName: String = "Fajar"
    var address: String = """
        Jalan belom ada , RT 00 RW 11
        Kabupaten Baru
        Jawa Baru
        Indobaru
    """.trimIndent()
    println(firstName)
    println(lastName)
    println(address)

    var fullname: String = firstName +" "+ lastName
    var desc:String = "total $fullname char = ${fullname.length}"
    println(desc)


}