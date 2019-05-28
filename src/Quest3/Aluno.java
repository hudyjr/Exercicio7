package Quest3;

public class Aluno {
    
    private String nome;
    private int idade;
    private String numeroMatricula;
    
     public Aluno(String nome, int idade, String numeroMatricula){
    
        setNome(nome);
        setIdade(idade);
        setNumeroMatricula(numeroMatricula);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
}
