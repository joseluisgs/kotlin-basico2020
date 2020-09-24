// Indicamos que String puede ser nulo
class A(var var1: String?, var var2: String)

fun main(args: Array<String>) {
    var objectA = A(null, "test")
    
    // Retornará un error puesto que no puede ser null
    //objectA.var2 = null

    // ?. Este método solo se ejecuta si la variable no es nula
    println("Count var1: " + objectA.var1?.count())
    
    objectA.var1 = "Hola"
    println("Count var1: " + objectA.var1?.count())
    
    // Si es nula indicamos que hacer
    objectA.var1 = null
    println("Count var1 elvis: " + (objectA.var1?.count() ?: 0))
    
    // !! forzamos a que lo ejecute
    // Nos dejará compilar pero provocará un Null Pointer Exception
    //println("Count: " + objectA.var1!!.count())
    
    var objectB: A? = null
    objectB?.var2?.let { println("Hola objectB") }
    
    // Let, si se encadenan dos nulos
    objectB = A("Var1", "Var2")
    objectB?.var2?.let { println("Hola objectB") }
    
    var objectC: A? = A("Test 1", "Test 2")
    objectC?.var2?.let { println("Hola objectC") }

    // sabemos si esta inciializaco con isInitializez
}