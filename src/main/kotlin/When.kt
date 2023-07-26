fun main() {
    val nilai = "B"
    when(nilai) {
        "A" -> {
            println("Amazing")
        }
        "B" ->{
            println("Good")
        }
        "C" -> {
            println("Not Bad")
        }
        else -> {
            println("Next Year Again")
        }
    }
    // Multiple Option

    val finalExamp = "D"
    when (finalExamp) {
        "A","B","C" -> {
            println("Selamat Anda Lulus")
        } else -> {
            println("Maaf ANda Tidak Lulus")
        }
    }

    //Expression In
    val nilaiLulus:Array<String> = arrayOf("A","B","C")
    when(nilai){
        in nilaiLulus -> println("Pass")
        !in nilaiLulus-> println("NOt")
    }

    // IS

    val name = "EKO"
    when(name) {
        is String -> println("Name IS String")
        !is String -> println("Not IS String")
    }
    // when tanda variable

    val nilaiUj = 92
    when {
        nilaiUj > 90 -> println("AMazing")
        nilaiUj > 80 -> println("Good Job")
        nilaiUj > 60 -> println("Not Bad")
        else -> println("Again Next Year")
    }
}