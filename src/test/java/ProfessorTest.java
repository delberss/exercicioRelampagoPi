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
}