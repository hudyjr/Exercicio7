package Quest1;

public class Teste {
    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Jorge", "Av Serra,232 - Centro Valinhos - SP", "36 3880-5500");
        Fornecedor f1 = new Fornecedor("Ouro Verde", "Zona Rural, 355, Zona Rural - Pirapora-MG", "3741-8877", 320.00, 270.00);
        Empregado e1 = new Empregado("Lucas Cardoso", "Rua E, 471, Industrial - Pirapora - MG", "38 3742-4763", "c1", 1300, 20);
        
        e1.Mostrar();

    }
}
