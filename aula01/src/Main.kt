fun main(){

    val nome: String = "Joao"
    val sobrenome: String? = null

    println("Nome: $nome, Sobrenome: $sobrenome")

    val ano = "2000"

    val anoEmInt = ano.toIntOrNull() ?: 2025

    val idade = 2025 - anoEmInt

    print("Idade: $idade")

}