package Quest2;

public class Integral extends Professor {
    
    private double Salario_Professor_Integral;
    
    public double getSalario_Professor_Integral(){
        return this.Salario_Professor_Integral;
    }
    
    public void setSalario_Professor_Integral(double s){
        this.Salario_Professor_Integral = s;
    }
    
    public Integral(String n, int i, int m, double s){
        super(n, i, m);
        this.setSalario_Professor_Integral(s);
    }
    
    public void Mostrar(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Salário: " + this.getSalario_Professor_Integral());
    }
}
