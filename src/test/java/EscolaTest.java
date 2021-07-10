import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {
    @Test
    void escolaridadeDiretorDeUmaEscola(){

        Professor diretor = new Professor();
        Escolaridade escolaridade = new Escolaridade();
        Escola escola = new Escola();

        escolaridade.setNivelEscolaridade("Doutor");
        diretor.setEscolaridade(escolaridade);
        escola.setProfessor(diretor);

        assertEquals("Doutor", escola.getProfessor().getEscolaridadeProfessor());
    }

    @Test
    void estadoEmQueUmAlunoEstuda(){
        Escola escola = new Escola();
        Cidade cidade = new Cidade();
        Estado estado = new Estado();

        estado.setUnidadeFederativa("MG");
        cidade.setEstado(estado);
        escola.setCidade(cidade);

        assertEquals("MG", escola.estadoDoAluno());
    }

}