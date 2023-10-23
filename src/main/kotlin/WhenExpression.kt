fun main(){
    val gender:Char = 'M'

    //when statement is a replacement of switch statement in kotlin.

    when(gender) {
        'F' -> println("Female")
        'M' -> println("Male")
        else -> {
            println("Unknown Gender")
        }
    }
}