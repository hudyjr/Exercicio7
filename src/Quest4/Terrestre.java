package Quest4;

public class Terrestre extends Transporte{
    
    private int numerodeRodas;

    public Terrestre(int numerodeRodas, int capacidade) {
        super(capacidade);
        setNumeroDeRodas(numerodeRodas);
    }
    
    
    public int getNumeroDeRodas() {
        return numerodeRodas;
    }

    public void setNumeroDeRodas(int numerodeRodas) {
        this.numerodeRodas = numerodeRodas;
    }
}
