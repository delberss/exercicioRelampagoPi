import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {
    @Test
    void deveRetornarEscolaridadeCoordenadorDeUmCurso(){

        Professor coordenador = new Professor();
        Escolaridade escolaridade = new Escolaridade();
        Curso curso = new Curso();

        escolaridade.setNivelEscolaridade("Doutor");
        coordenador.setEscolaridade(escolaridade);
        curso.setCoodernador(coordenador);

        assertEquals("Doutor", curso.getEscolaridadeCoordenador());
    }

    @Test
    void deveRetornarExcecaoParaCursoSemCoordenador(){
        try{
            Curso curso = new Curso();
            curso.getEscolaridadeCoordenador();
            fail();
        }
        catch (NullPointerException e){
            assertEquals("Sem coordenador", e.getMessage());
        }
    }

}