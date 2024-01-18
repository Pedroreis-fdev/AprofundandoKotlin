/*Crie uma variável inteira anulável chamada nullTest, e defina-a como null.
Use uma verificação nula que aumente o valor em um se não for nulo. 
E, caso contrário, retorne 0 e imprima o resultado. */

fun main(){
    var nullTest : Int? = null

    //operador ternario alternativo do kotlin
    var resultado = if(nullTest == null) 0 else  nullTest + 1

    print(resultado)


}