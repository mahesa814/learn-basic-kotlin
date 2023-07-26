fun main() {
    val names: Array<String> = arrayOf("Mahesa","Yaden","Undang")
//    val mahesa: String = names[0]
//    val yaden: String = names[1]
//    val undang: String = names[2]

    names.set(0,"ujang")
    println(names[0])

    val members: Array<String?> = arrayOfNulls(2)
    members[0] = "Mahesa"
    members[1] = null

    println(members[0])
}