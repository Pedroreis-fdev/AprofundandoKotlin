/*Crie uma variável String rainbowColor, defina seu valor de cor e altere-a.
Crie uma variável blackColor cujo valor não possa ser alterado depois de atribuído. Mesmo assim, tente alterar.
*/
fun main(){
var raimbowColor : String = "Uncolorful"
raimbowColor = "Colorful with a lot shine"

val blackColor : String = "gloomy"
//o exercicio sugere esse erro infelizmente nn posso corrigi-lo
blackColor = "dark"

print("${raimbowColor} e ${blackColor}")
}