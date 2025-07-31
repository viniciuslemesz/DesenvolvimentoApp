fun main(){

    val nome: String = "Joao"
    val sobrenome: String? = "Silva"
    println("Nome: $nome, Sobre: $sobrenome")

    val nomeCompleto = nome + sobrenome
    val nomeCompleto2 = "$nome + $sobrenome"

    println(nomeCompleto)
    println(nomeCompleto.length)
    println(nomeCompleto[4])
    println(nomeCompleto.substring(1, 4))

    nomeCompleto2.replace("Silva", "Pereira")
    println(nomeCompleto2)

    println(nomeCompleto2.split("2", "3"))

}