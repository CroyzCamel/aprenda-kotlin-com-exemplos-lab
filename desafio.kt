@file:Suppress("UNREACHABLE_CODE")
// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

enum class nomeCounteudoEducaional { Kotlin, Python, Html5, Css3 , JavaScript }
enum class nomeFormacao { web, mobile }

class Usuario


data class ConteudoEducacional(var nome: nomeCounteudoEducaional, val duracao: Int = 120, val nivel: Nivel)

data class Formacao(val nome: nomeFormacao, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)


    }
}

fun main() {
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    val usuario1 = Usuario()
    val conteudo1 = ConteudoEducacional(nomeCounteudoEducaional.Kotlin, nivel = Nivel.BASICO)
    val formacao1 = Formacao(nomeFormacao.mobile, listOf(conteudo1))

    formacao1.matricular(usuario1)

}
