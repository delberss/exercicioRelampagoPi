import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {
    @Test
    void deveRetornarEscolaridadeProfessor(){

        Professor professor = new Professor();
        Escolaridade escolaridade = new Escolaridade();

        escolaridade.setNivelEscolaridade("Doutor");
        professor.setEscolaridade(escolaridade);

        assertEquals("Doutor", professor.getEscolaridadePessoa());
    }

    @Test
    void deveRetornarExcecaoParaProfessorSemEscolaridade(){
        try{
            Professor professor = new Professor();
            professor.getEscolaridadePessoa();
            fail();
        }
        catch (NullPointerException e){
            assertEquals("Sem escolaridade", e.getMessage());
        }

    }

    @Test
    void deveRetornarCidadeDeNascimentoDeUmProfessor(){
        Professor professor = new Professor();
        Cidade cidade = new Cidade();

        cidade.setNomeCidade("Juiz de Fora");
        professor.setCidade(cidade);

        assertEquals("Juiz de Fora", professor.getCidadeDoProfessor());
    }

    @Test
    void deveRetornarExcecaoProfessorSemCidade(){

        try{
            Professor professor = new Professor();
            professor.getCidadeDoProfessor();
            fail();
        }
        catch (NullPointerException e){
            assertEquals("Sem cidade", e.getMessage());
        }
    }

    @Test
    void deveRetornarTipoDeEnsinoDoProfessor(){
        Professor professor = new Professor();
        TipoEnsino tipoEnsino = new TipoEnsino();
        Curso curso = new Curso();

        tipoEnsino.setTipoDeEnsinoProfessor("Ensino Superior");
        curso.setTipoEnsino(tipoEnsino);
        professor.setCurso(curso);

        assertEquals("Ensino Superior", professor.getTipoDeEnsinoProfessor());
    }

    @Test
    void deveRetornarExcecaoProfessorSemTipoDeEnsino(){
        try{
            Professor professor = new Professor();
            Curso curso = new Curso();

            professor.setCurso(curso);
            professor.getTipoDeEnsinoProfessor();
        }
        catch (NullPointerException e){
            assertEquals("Sem tipo de ensino", e.getMessage());
        }
    }

    @Test
    void deveRetornarODiretorDeUmProfessor() {
        Professor professor = new Professor();
        Professor diretor = new Professor();
        Escola escola = new Escola();
        Curso curso = new Curso();

        diretor.setNome("João");
        diretor.setCurso(curso);
        curso.setEscola(escola);
        escola.setDiretor(diretor);
        professor.setCurso(curso);

        assertEquals("João", professor.getDiretorDoProfessor());
    }

    @Test
    void deveRetornarExcecaoProfessorSemEscola() {
        try{
            Professor professor = new Professor();
            Curso curso = new Curso();

            professor.setCurso(curso);
            professor.getDiretorDoProfessor();
            fail();
        }
        catch (NullPointerException e){
            assertEquals("Sem escola", e.getMessage());
        }

    }

    @Test
    void deveRetornarOCoordenadorDeUmProfessor() {
        Professor professor = new Professor();
        Professor coordenador = new Professor();
        Curso curso = new Curso();

        coordenador.setNome("José");
        coordenador.setCurso(curso);
        curso.setCoodernador(coordenador);

        professor.setCurso(curso);

        assertEquals("José", professor.getCoordenadorDoProfessor());
    }

    @Test
    void deveRetornarExcecaoProfessorSemCurso() {
        try{
            Professor professor = new Professor();
            professor.getCoordenadorDoProfessor();
        }
        catch (NullPointerException e){
            assertEquals("Sem curso", e.getMessage());
        }
    }
}