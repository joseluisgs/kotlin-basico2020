open class A(var var1: String)

// Heredamos
class B(var1: String, var var2: String) : A(var1)
class C(var1: String, var var3: String) : A(var1)

fun main(args: Array<String>) {
  // Any es como definir Object, es decir cualquier cosa. Estamos aplicando polimorfismo
	var objectA: A = B("Hola Mundo", "Test")
    
    if (objectA is A) println(objectA.var1) // Lo es :)
    if (objectA is B) println(objectA.var2) // Lo es :)
    if (objectA is C) println(objectA.var3) // ¿Que asa aqui?
    
    //- No compilará puesto que no hará el casting automático a C
    //if (objectA !is C) println(objectA.var3)
    
    //- Si no es de tipo C hará un casting forzoso a B
    if (objectA !is C) println((objectA as B).var1)
}