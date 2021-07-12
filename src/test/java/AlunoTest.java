import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveRetornarEstadoDeNaturalidadeDoAluno(){
        Aluno aluno = new Aluno();
        Cidade cidade = new Cidade();
        Estado estado = new Estado();

        estado.setUnidadeFederativa("MG");
        cidade.setEstado(estado);
        aluno.setCidade(cidade);

        assertEquals("MG", aluno.getEstadoDeNaturalidadeDoAluno());
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