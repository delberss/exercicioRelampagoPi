import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveRetornarEstadoDeNaturalidadeDoAluno(){
        Aluno aluno = new Aluno();
        Cidade cidade = new Cidade();

        cidade.setNomeCidade("Juiz de Fora");
        aluno.setCidade(cidade);

        assertEquals("Juiz de Fora", aluno.getCidade().getNomeCidade());
    }

    @Test
    void deveRetornarCoordenadorDoCursoDeUmAluno(){
        Aluno aluno = new Aluno();
        Professor coodernador = new Professor();
        Curso curso =  new Curso();

        coodernador.setNome("Marco Antonio");
        curso.setProfessor(coodernador);
        aluno.setCurso(curso);

        assertEquals("Marco Antonio", aluno.getCoordenadorCurso());
    }


}