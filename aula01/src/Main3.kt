fun main() {
    print("Digite seu nome: ")
    val nome: String = readLine() ?: "Sem Nome"

    print("Ano: ")

    // !! = certeza que nao vai ser nulo(que vai existir)
    val ano = readLine()?.toIntOrNull()



    if(ano != null) {
        val idade = 2025 - ano
        println("Idade: $idade")
    }else{
        print("Erro...")
    }

}