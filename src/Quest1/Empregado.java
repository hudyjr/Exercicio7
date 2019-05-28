package Quest1;

public class Empregado extends Pessoa {
    
    private String CodigoSetor;
    private double SalarioBase;
    private double Imposto;
    
    public String getCodigoSetor(){
        return this.CodigoSetor;
    }
    
    public double getSalarioBase(){
        return this.SalarioBase;
    }
    
    public double getImposto(){
        return this.Imposto;
    }
    
    public void setCodigoSetor(String c){
        this.CodigoSetor = c;
    }
    
    public void setSalarioBase(double b){
        this.SalarioBase = b;
    }
    
    public void setImposto(double i){
        this.Imposto = i;
    }
    
    public double CalcularSalario(double s){
        s = this.getSalarioBase() - (this.getSalarioBase() / 100 * this.getImposto());
        return s;
    }
    
    public Empregado(String n, String e, String t, String c, double b, double i){
        super(n, e, t);
        this.setCodigoSetor(c);
        this.setSalarioBase(b);
        this.setImposto(i);
    }
    
    public void Mostrar(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Endereço: " + this.getEndereço());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Código Setor: " + this.getCodigoSetor());
        System.out.println("Salário Base: " + this.getSalarioBase());
        System.out.println("Imposto: " + this.getImposto());
        System.out.println("Salário: " + this.CalcularSalario(Imposto));
    }
}
