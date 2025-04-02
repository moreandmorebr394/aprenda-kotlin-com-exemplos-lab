fun main() {
    data class ConteudoEducacional(val nome: String, val duracao: Int)

    class Formacao(
        val nome: String,
        val nivel: String,
        val conteudos: List<ConteudoEducacional>
    ) {
        private val alunosMatriculados = mutableListOf<String>()

        fun matricularAluno(aluno: String) {
            alunosMatriculados.add(aluno)
            println("Aluno $aluno matriculado na formação $nome")
        }
        
        fun listarAlunos() {
            println("Alunos matriculados na formação $nome: ${alunosMatriculados.joinToString(", ")}")
        }
    }

    val conteudo1 = ConteudoEducacional("Kotlin Básico", 10)
    val conteudo2 = ConteudoEducacional("Kotlin Avançado", 20)
    val formacao = Formacao("Desenvolvimento Kotlin", "Intermediário", listOf(conteudo1, conteudo2))
    
    formacao.matricularAluno("João")
    formacao.matricularAluno("Maria")
    
    formacao.listarAlunos()
}
