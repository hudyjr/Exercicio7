package Quest3;

public class AlunosEspeciais extends Aluno {
    
    private String disciplinasGraduacao;
    private String disciplinasPosGraduacao;

    public AlunosEspeciais(String nome, int idade, String numeroMatricula, String disciplinasGraduacao, String disciplinasPosGraduacao) {
        super(nome, idade, numeroMatricula);
        setDisciplinasGraduacao(disciplinasGraduacao);
    }

    public String getDisciplinasGraduacao() {
        return disciplinasGraduacao;
    }

    public void setDisciplinasGraduacao(String disciplinasGraduacao) {
        this.disciplinasGraduacao = disciplinasGraduacao;
    }

    public String getDisciplinasPosGraduacao() {
        return disciplinasPosGraduacao;
    }

    public void setDisciplinasPosGraduacao(String disciplinasPosGraduacao) {
        this.disciplinasPosGraduacao = disciplinasPosGraduacao;
    }
}
