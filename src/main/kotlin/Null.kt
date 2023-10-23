fun main() {
    //Kotlin handles null point exception by not allowing us to assign variables name to null.
    //to be able to have variables to have null values we use a ? with the variable name.

    var brand: String? = null;
    print(brand?.uppercase()) // we need ? with the variable name inorder to use string methods with the null safe variable.
}