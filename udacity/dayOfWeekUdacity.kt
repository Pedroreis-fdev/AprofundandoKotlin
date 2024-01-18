/*Crie um novo arquivo Kotlin.
Copie e cole a função main() de Hello World para o arquivo.
Crie uma nova função dayOfWeek().
No corpo da função, imprima "What day is it today?"
Acione dayOfWeek() a partir de main().
Execute o programa. */

//extensão do exercicio

/*No corpo da função dayOfWeek (), responda à pergunta imprimindo que dia da semana estamos. */
import java.util.Calendar

fun main(){
    helloWorld()
    dayOfWeek()

}
fun helloWorld(){
    println("Hello World!")
}

fun dayOfWeek(){
    println("what day is it today?")

    //extensão do exercicio
 val dia =  Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
 
 when(dia){
    1 -> println("today its Sunday")
    2 -> println("today its a Monday")
    3 -> println("today its a Tuesday")
    4 -> println("today its a Wednesday")
    5 -> println("today its a Thursday")
    6 -> println("today its a Friday")
    7 -> println("today its a Saturday")
    else -> println("error")
 }
}