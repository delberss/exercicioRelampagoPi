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
    void deveRetornarExcecaoAlunoSemCidade(){

        try{
            Aluno aluno = new Aluno();
            aluno.getEstadoDeNaturalidadeDoAluno();
            fail();
        }
        catch (NullPointerException e){
            assertEquals("Sem cidade", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoAlunoSemEstado(){

        try{
            Aluno aluno = new Aluno();
            Cidade cidade = new Cidade();
            aluno.setCidade(cidade);
            aluno.getEstadoDeNaturalidadeDoAluno();
            fail();
        }
        catch (NullPointerException e){
            assertEquals("Sem estado", e.getMessage());
        }
    }

    @Test
    void deveRetornarCoordenadorDoCursoDeUmAluno(){
        Aluno aluno = new Aluno();
        Professor coodernador = new Professor();
        Curso curso =  new Curso();

        coodernador.setNome("Marco Antonio");
        curso.setCoodernador(coodernador);
        aluno.setCurso(curso);

        assertEquals("Marco Antonio", aluno.getCoordenadorDoCurso());
    }

    @Test
    void deveRetornarExcecaoAlunoSemCurso(){
        try{
            Aluno aluno = new Aluno();
            aluno.getCoordenadorDoCurso();
            fail();
        }
        catch (NullPointerException e){
            assertEquals("Sem curso", e.getMessage());
        }
    }


}