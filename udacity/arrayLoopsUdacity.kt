/*Crie um array integer de números chamado numbers, de 11 a 15.
Crie uma lista imutável vazia para Strings.
Escreva um loop for que faça um loop sobre o array e adicione a representação de string de cada número da lista.
Exemplo de desafio
Como você pode usar um loop for para criar (uma lista de) números entre 1 e 100 que sejam divisíveis por 7?
 */

 fun main(){
    var numbers : List<Int> = listOf(11, 12, 13, 14, 15)
    //val texts : List<String> = mutableListOf()
    val texts = mutableListOf<String>()
    var divPorSete = mutableListOf<Int>()


    for(i in numbers){
        var conversao = i.toString()
        texts.add(conversao)
    }
    println(texts)

    for(i in 0..100 step 7){
        divPorSete.add(i)
    }
    println(divPorSete)
 }