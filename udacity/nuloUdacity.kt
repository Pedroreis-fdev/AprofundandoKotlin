fun main() {

    // obs: sei que para sair o erro teria que usar "?" após a String da criação do raimbowColor
    // mas to seguindo o enunciado do exercicio

    var raimbowColor: String = "Uncolorful"
    raimbowColor = null

    var greenColor: String? = null

    var blueColor: String? = "blueColor"
    blueColor = blueColor ?: null

    // bonus
    var yellowColor: String? = "yellow"
    yellowColor = returnNull()

    print(yellowColor)
}
// função usada no metodo bonus (:
fun returnNull(): String? {
    return null
}
