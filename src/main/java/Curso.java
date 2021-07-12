public class Curso {
    private Professor coodernador;
    private TipoEnsino tipoEnsino;
    private Escola escola;

    public Professor getCoodernador() {
        return coodernador;
    }
    public Curso setCoodernador(Professor coodernador) {
        this.coodernador = coodernador;
        return this;
    }

    public TipoEnsino getTipoEnsino() {
        return tipoEnsino;
    }
    public Curso setTipoEnsino(TipoEnsino tipoEnsino) {
        this.tipoEnsino = tipoEnsino;
        return this;
    }

    public Escola getEscola() {
        return escola;
    }
    public Curso setEscola(Escola escola) {
        this.escola = escola;
        return this;
    }

    public String getEscolaridadeCoordenador(){
        if (coodernador == null){
            throw new NullPointerException("Sem coordenador");
        }
        return coodernador.getEscolaridadePessoa();
    }
}
