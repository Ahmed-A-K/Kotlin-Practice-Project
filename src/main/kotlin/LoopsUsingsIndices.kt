fun main() {
    var letters = charArrayOf('A','B','C','D','E')
    // with .indices property we can access the index values rather then value associated with those index
    for (index in letters.indices) {
        println("$index - ${letters[index]}")
    }
    print("\n")
    println("Reverse Order")
    for(index in letters.indices.reversed()) {
        println("$index - ${letters[index]}")
    }
}