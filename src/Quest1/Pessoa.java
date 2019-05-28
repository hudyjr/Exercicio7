package Quest1;

public class Pessoa {
   
   private String Nome;
   private String Endereço;
   private String Telefone;
      
   public String getNome(){
       return this.Nome;
   }
   
   public String getEndereço(){
       return this.Endereço;
   }
   
   public String getTelefone(){
       return this.Telefone;
   }
   
   public void setNome(String n){
       this.Nome = n;
   }
   
   public void setEndereço(String e){
       this.Endereço = e;
   }
   
   public void setTelefone(String t){
       this.Telefone = t;
   }
   
   public Pessoa(String n, String e, String t){
       this.setNome(n);
       this.setEndereço(e);
       this.setTelefone(t);
   }
   
   public void Mostrar(){
       System.out.println("Nome: " + this.getNome());
       System.out.println("Endereço: " + this.getEndereço());
       System.out.println("Telefone: " + this.getTelefone());
   } 
}
