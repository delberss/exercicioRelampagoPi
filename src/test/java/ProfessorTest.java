import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {
    @Test
    void escolaridadeProfessor(){

        Professor professor = new Professor();
        Escolaridade escolaridade = new Escolaridade();

        escolaridade.setNivelEscolaridade("Doutor");
        professor.setEscolaridade(escolaridade);

        assertEquals("Doutor", professor.getEscolaridadeProfessor());
    }

    @Test
    void deveRetornarCidadeDeNascimentoDeUmProfessor(){
        Professor professor = new Professor();
        Cidade cidade = new Cidade();

        cidade.setNomeCidade("Juiz de Fora");
        professor.setCidade(cidade);

        assertEquals("Juiz de Fora", professor.getCidade().getNomeCidade());
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
    void deveRetornarODiretorDeUmProfessor() {
        Professor professor = new Professor();
        Professor diretor = new Professor();
        Escola escola = new Escola();
        Curso curso = new Curso();

        diretor.setNome("João");
        diretor.setCurso(curso);
        curso.setEscola(escola);
        escola.setProfessor(diretor);
        professor.setCurso(curso);

        assertEquals("João", professor.getCurso().getEscola().getProfessor().getNome());
    }

    @Test
    void deveRetornarOCoordenadorDeUmProfessor() {
        Professor professor = new Professor();
        Professor coordenador = new Professor();

        Curso curso = new Curso();

        coordenador.setNome("José");
        coordenador.setCurso(curso);
        curso.setProfessor(coordenador);

        professor.setCurso(curso);

        assertEquals("José", professor.getCurso().getCoordenadorDoCurso());
    }
}