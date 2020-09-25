fun main(args: Array<String>) {
	val list = listOf("Test 1", "Test 2")
   	var mutableList = mutableListOf("Test 1", "Test 2")
    
    //- No compilará puesto que no se pueden añadir objetos a una lista inmutable
    //list.add("Test 3")
    
    list.map {
        println(it)
    }

    // Con un for
    for(elem in list) {
        println(elem)
    }

    
    println("Antes de añadir un nuevo objeto")
    mutableList.map {
        println(it)
    }
    
    mutableList.add("Test 3")
    
    println("Después de añadir un nuevo objeto")
    mutableList.map {
        println(it)
    }
}