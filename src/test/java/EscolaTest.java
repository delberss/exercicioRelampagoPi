import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {
    @Test
    void deveRetornarEscolaridadeDiretorDeUmaEscola(){

        Professor diretor = new Professor();
        Escolaridade escolaridade = new Escolaridade();
        Escola escola = new Escola();

        escolaridade.setNivelEscolaridade("Doutor");
        diretor.setEscolaridade(escolaridade);
        escola.setDiretor(diretor);

        assertEquals("Doutor", escola.getEscolaridadeDiretor());
    }

    @Test
    void deveRetornarExcecaoParaEscolaSemDiretor(){
        try{
            Escola escola = new Escola();
            escola.getEscolaridadeDiretor();
            fail();
        }
        catch (NullPointerException e){
            assertEquals("Sem diretor", e.getMessage());
        }
    }

    @Test
    void deveRetonarEstadoEmQueUmAlunoEstuda(){
        Escola escola = new Escola();
        Cidade cidade = new Cidade();
        Estado estado = new Estado();

        estado.setUnidadeFederativa("MG");
        cidade.setEstado(estado);
        escola.setCidade(cidade);

        assertEquals("MG", escola.getEstadoDoAluno());
    }

    @Test
    void deveRetonarExcecaoCidadeEmQueUmAlunoEstuda(){

        try{
            Escola escola = new Escola();
            escola.getEstadoDoAluno();
            fail();
        }
        catch (NullPointerException e){
            assertEquals("Sem cidade", e.getMessage());
        }
    }

    @Test
    void deveRetonarExcecaoEstadoEmQueUmAlunoEstuda(){

        try{
            Escola escola = new Escola();
            Cidade cidade = new Cidade();
            escola.setCidade(cidade);
            escola.getEstadoDoAluno();
            fail();
        }
        catch (NullPointerException e){
            assertEquals("Sem estado", e.getMessage());
        }
    }

}