public class Curso {
    private Professor professor;
    private TipoEnsino tipoEnsino;

    public Professor getProfessor() {
        return professor;
    }
    public Curso setProfessor(Professor professor) {
        this.professor = professor;
        return this;
    }

    public TipoEnsino getTipoEnsino() {
        return tipoEnsino;
    }
    public Curso setTipoEnsino(TipoEnsino tipoEnsino) {
        this.tipoEnsino = tipoEnsino;
        return this;
    }

}
