public class Escola {
    private Professor diretor;
    private Cidade cidade;

    public Professor getDiretor() {
        return diretor;
    }
    public Escola setDiretor(Professor diretor) {
        this.diretor = diretor;
        return this;
    }

    public Cidade getCidade() {
        return cidade;
    }
    public Escola setCidade(Cidade cidade) {
        this.cidade = cidade;
        return this;
    }

    public String getEstadoDoAluno(){
        if (cidade == null){
            throw new NullPointerException("Sem cidade");
        }
        else{
            if (cidade.getEstado() == null){
                throw new NullPointerException("Sem estado");
            }
        }
        return cidade.getEstado().getUnidadeFederativa();
    }

    public String getEscolaridadeDiretor(){
        if (diretor == null){
            throw new NullPointerException("Sem diretor");
        }
        return diretor.getEscolaridadePessoa();
    }
}
