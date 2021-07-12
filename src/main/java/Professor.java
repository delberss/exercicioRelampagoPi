public class Professor extends Pessoa{
    private Curso curso;

    public Curso getCurso() {
        return curso;
    }
    public Professor setCurso(Curso curso) {
        this.curso = curso;
        return this;
    }

    public String getCidadeDoProfessor(){
        if (this.getCidade() == null){
            throw new NullPointerException("Sem cidade");
        }
        return this.getCidade().getNomeCidade();
    }

    public String getTipoDeEnsinoProfessor(){
        if (curso.getTipoEnsino() == null){
            throw new NullPointerException("Sem tipo de ensino");
        }
        return curso.getTipoEnsino().getTipoDeEnsinoProfessor();
    }

    public String getDiretorDoProfessor(){
        if (this.curso.getEscola() == null){
            throw new NullPointerException("Sem escola");
        }
        return this.curso.getEscola().getDiretor().getNome();
    }

    public String getCoordenadorDoProfessor(){
        if (curso == null){
            throw new NullPointerException("Sem curso");
        }
        return curso.getCoodernador().getNome();
    }
}
