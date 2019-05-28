package Quest4;

public class Automovel extends Terrestre{
    
    private String cor;
    private int numeroDePortas;
    private String placa;

    public Automovel(String cor, int numeroDePortas, String placa, int numerodeRodas, int capacidade) {
        super(numerodeRodas, capacidade);
        this.cor = cor;
        this.numeroDePortas = numeroDePortas;
        this.placa = placa;
    }
    
        
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
