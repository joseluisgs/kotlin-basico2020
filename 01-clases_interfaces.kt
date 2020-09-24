// Todas las clases son finales, si queremos extender de ellas se deben declarar como open o abstract
// https://play.kotlinlang.org/

// Definició de clase. 
// class Tardis {
// 	var year: Int
// 	var place: String
	
//     constructor(year: Int, place: String) {
// 		this.year = year
// 		this.place = place
// 	}
// }

// Los getter y los setter ya van incluídos simplificando las cosas, de hecho en una línea
class Tardis (var year: Int, var place: String)


// Como podemos ver se declara como open si voy a heredar de ellas.
open class A (var var1: String, var var2: Int) {
    init {
        println("Hola soy el init de A")
    }
    // Este es un constructor personalizado, que no es el por defecto
    constructor(var1: String) : this(var1, 0)
}

// Definición de interfaz
interface MyInterface {
    fun foo()
}

// Clase que extienede de A pero no implementa MyInterface
class C (var1: String, var2: Int, var var3: String) : A(var1, var2)

// Clase que no extienede de A pero implementa MyInterface
class D (var1: String, var2: Int, var var3: String) : MyInterface {
    override fun foo() {
        println("Función test")
    }
}

// Clase que extienede de A e implementa MyInterface
class B (var1: String, var2: Int, var var3: String) : A(var1, var2), MyInterface {
    // implementamos la interfaz
    override fun foo() {
        println("Función test")
    }
    
    fun concat(): String {
        return var1 + var3
    }
    
    fun sum(number: Int = 0): Int {
        return var2 + number
    }
}

// Función main
fun main(args: Array<String>) {
    val tardis1 = Tardis(2133, "Dunlop Station")
    val tardis2 = Tardis(1885, "Northhampton")
    println(tardis1.year)

    var objectA = A("variable1-A")
    println("Soy A = " + objectA.var1 + ", Var2 de A = " + objectA.var2) ;
    var objectB = B("variable1", 1, "variable3")
    println("Soy B -> Var1 de A = " + objectB.var1);
    println("Soy B -> Var2 de A = " + objectB.var2);
    println("Soy B -> Var3 de B = " + objectB.var3)
    objectB.foo()
    println("Resultado de concat = " + objectB.concat())
    println("Resultado de sum = " + objectB.sum(10))
}