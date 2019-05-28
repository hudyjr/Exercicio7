package Quest2;

public class Professor {
  
    private String Nome;
    private int Idade;
    private int Matricula;
    
    public String getNome(){
        return this.Nome;
    }
    
    public int getIdade(){
        return this.Idade;
    }
    
    public int getMatricula(){
        return this.Matricula;
    }
    
    public void setNome(String n){
        this.Nome = n;
    }
    
    public void setIdade(int i){
        this.Idade = i;
    }
    
    public void setMatricula(int m){
        this.Matricula = m;
    }
    
    public Professor(String n, int i, int m){
        this.setNome(n);
        this.setIdade(i);
        this.setMatricula(m);
    }
}
