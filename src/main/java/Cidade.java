public class Cidade {
    private String nomeCidade;
    private Estado estado;

    public String getNomeCidade() {
        return nomeCidade;
    }
    public Cidade setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
        return this;
    }

    public Estado getEstado() {
        return estado;
    }
    public Cidade setEstado(Estado estado) {
        this.estado = estado;
        return this;
    }
}
