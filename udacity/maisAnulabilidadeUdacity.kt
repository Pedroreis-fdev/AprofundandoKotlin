/*Crie uma lista com dois elementos que sejam nulos, e faça isso de duas maneiras diferentes.
Agora, crie uma lista em que a lista seja nula.
 */

fun main(){

val lista1 = listOf(null, null)
val lista2 = mutableListOf<String?>().apply{
add(null)
add(null)
}
var listaNula : List<String?>? = null

println(lista1)
println(lista2)
println(listaNula)
}