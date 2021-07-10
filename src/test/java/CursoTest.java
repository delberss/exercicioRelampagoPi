import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {
    @Test
    void escolaridadeCoordenadorDeUmCurso(){

        Professor coordenador = new Professor();
        Escolaridade escolaridade = new Escolaridade();
        Curso curso = new Curso();

        escolaridade.setNivelEscolaridade("Doutor");
        coordenador.setEscolaridade(escolaridade);
        curso.setProfessor(coordenador);

        assertEquals("Doutor", curso.getProfessor().getEscolaridadeProfessor());
    }

}