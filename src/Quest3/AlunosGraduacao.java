package Quest3;

public class AlunosGraduacao extends Aluno{
    
    private String disciplinasGraduacao;

    public AlunosGraduacao(String nome, int idade, String numeroMatricula, String disciplinasGraduacao) {
        super(nome, idade, numeroMatricula);
        setDisciplinasGraduacao(disciplinasGraduacao);
    }

    public String getDisciplinasGraduacao() {
        return disciplinasGraduacao;
    }

    public void setDisciplinasGraduacao(String disciplinasGraduacao) {
        this.disciplinasGraduacao = disciplinasGraduacao;
    }
}
