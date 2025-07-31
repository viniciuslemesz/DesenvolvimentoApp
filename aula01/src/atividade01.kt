fun main(){

    println("Digite um texto: ")
    val texto: String = readLine() ?: "Texto Vazio"

    println(texto)
    val tamanhoString = texto.length

    println("Digite o indice inicial: ")
    val iinicial = readLine()?.toIntOrNull()

    println("Digite o indice final: ")
    val ifinal = readLine()?.toIntOrNull()

    if(ifinal != null && iinicial != null)
    {
        if(ifinal > tamanhoString || ifinal > iinicial){

            println(texto.substring(iinicial, ifinal))
        }
    }


}