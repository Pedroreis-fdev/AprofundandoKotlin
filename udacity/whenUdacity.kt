/*Crie uma declaração when com três comparações:
Se o comprimento do fishName for 0, imprima uma mensagem de erro.
Se o comprimento estiver no intervalo entre 3 ... 12, imprima "Good fish name”
Se for qualquer outra coisa, imprima “OK fish name”. */

fun main(){
    val fishName = "merluza"
    
    when(fishName.length){
    
    0 -> println("error")
    in 3..12 -> println("Good fish name")
    else -> println("OK fish name")
    }
}