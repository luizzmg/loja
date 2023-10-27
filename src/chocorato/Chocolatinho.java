package chocorato;
public enum Chocolatinho {
    BRANCO(12.50, 0.5, "nestle"),
    AO_LEITE(11.00), 
    SETENTA_PORTCENTO(16.99), 
    MORANGO(10.70);
    
    double preco;
    float peso;
    String marca;
    Chocolatinho(double preco, float peso, String marca){
        this.preco = preco;
        this.peso = peso;
        this.marca = marca;
    }


}



