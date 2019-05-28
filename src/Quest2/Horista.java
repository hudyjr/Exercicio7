package Quest2;

public class Horista extends Professor {
    
    private double SalarioBase_Professor_Horista;
    private int HorasAula;
    
    public double getSalarioBase_Professor_Integral(){
        return this.SalarioBase_Professor_Horista;
    }
    
    public int getHorasAula(){
        return this.HorasAula;
    }
    
    public void setSalarioBase_Professor_Integral(double b){
        this.SalarioBase_Professor_Horista = b;
    }
    
    public void setHorasAula(int h){
        this.HorasAula = h;
    }
    
    public double SalarioProfessor_Horista(double s){
        s = this.getHorasAula() * this.getSalarioBase_Professor_Integral();
        return s;
    }
    
    public Horista(String n, int i, int m, int h,double b){
        super(n, i, m);
        this.setHorasAula(h);
        this.setSalarioBase_Professor_Integral(b);
    }
    
    public void Mostrar(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Salário: " + this.getSalarioBase_Professor_Integral());
        System.out.println("Horas/Aula: " + this.getHorasAula());
        System.out.println("Salário: " + this.SalarioProfessor_Horista(SalarioBase_Professor_Horista));
    }
}
