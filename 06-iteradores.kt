fun main(args: Array<String>) {
    // Defino listas con null
    val listaDeEnterosConNulos: List<Int?> = listOf(0, 1, 2, null)
    
    // Recorro con un for
    println("------ in ------")
    for (number in listaDeEnterosConNulos) {
    	// Si no es nulo lo imprimo, si es nulo pongo null, así no rebienta
         number?.let { print(it) } ?: println("nulo")
    }
    
    println("------ map ------")
    
    listaDeEnterosConNulos.map {
        println(it)
    }

    println("------ foreach ------")

    listaDeEnterosConNulos.forEach {
       println(it)
   }
    
    println("------ in ------")
    
    // 
    for (number in 1..10) {
        if (number != 10) print(number) else println(number)
    }
    
    println("------ until ------")
    
    for (number in 1 until 10) {
        print(number)
        print(it)
    }
    
    println("")
    println("------ while ------")
    
    var count = 10
    while (count > 0) {
       print(count)
       count--
    }

}