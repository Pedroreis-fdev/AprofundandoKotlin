/*Resolva o problema abaixo usando os métodos do operador.

Se você começar com 2 peixes e eles se reproduzirem duas vezes, produzindo 71 filhotes na primeira vez,
e 233 na segunda. 13 peixes são engolidos por uma moreia faminta.
Quantos peixes sobraram? Quantos aquários são necessários se cada um comportar 30 peixes? */
fun main(){
var peixes: Int = 2
var acasalamentos : List<Int> = listOf(71 , 233)

var totalFilhotes = acasalamentos[0] + acasalamentos[1]
var moreiaFaminta = 13
//contando os pais
var sobreviventes = (totalFilhotes + peixes - moreiaFaminta)

println("Inicialmente tinhamos " + peixes + " peixes \nQue durante um acasalamento tiveram " + totalFilhotes + "\nLogo apos uma moreia faminta comeu " +moreiaFaminta+ " peixes \nSobraram ${totalFilhotes - moreiaFaminta} Filhotes \nSe contarmos os Pais sobraram ${sobreviventes} \nSe distribuirmos equitativamente em aquarios seriam necessarios ${sobreviventes / 30} aquarios. ")

}