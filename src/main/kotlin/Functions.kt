fun main() {
    println(sum(10,20));
}

// lambda expression with parameters type (Int,Int) and return type -> Int
val sum: (Int,Int) -> Int = {x,y -> x + y }

//fun sum(x:Int,y:Int):Int {
//    return x+y;
//}

// named arguments allow us to be more concise with our code. Providing more details about the passing argument.
// When you don't return anything we use Unit type. It is already defined when you omit the return type.
// lambda expressions are written within the curly braces.
