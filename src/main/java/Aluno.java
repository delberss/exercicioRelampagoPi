public class Aluno extends Pessoa{
    private Curso curso;

    public Curso getCurso() {
        return curso;
    }
    public Aluno setCurso(Curso curso) {
        this.curso = curso;
        return this;
    }

    public String getEstadoDeNaturalidadeDoAluno(){
        if (this.getCidade() == null){
            throw new NullPointerException("Sem cidade");
        }
        else{
            if (this.getCidade().getEstado() == null){
                throw new NullPointerException("Sem estado");
            }
        }
        return this.getCidade().getEstado().getUnidadeFederativa();
    }

    public String getCoordenadorDoCurso(){
        if (curso == null){
            throw new NullPointerException("Sem curso");
        }
        return curso.getCoodernador().getNome();
    }
}
