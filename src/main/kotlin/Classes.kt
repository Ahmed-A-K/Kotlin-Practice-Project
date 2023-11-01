class Classes(val id: Int, val email: String) {
    fun printInfo() {
        println("User Id: ${this.id} User Email: ${this.email}")
    }
}

data class User(val name: String) {

}

fun main() {
    // this way we can create an instance of an object of the specific class.
    val obj1 = Classes(1,"anon@gmail.com")
    val obj2 = Classes(2,"Ali@gmail.com")
    obj1.printInfo()
    obj2.printInfo()

    val obj3 = User("Ahmed")
    print(obj3)
}