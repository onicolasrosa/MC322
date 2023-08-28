package Exemplos;


public class Carro {
    private String cor;
    private String modelo;

    public Carro(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
    }

    public void ligar() {
        System.out.println("O carro está ligado");
    }
    
    public void desligar() {
        System.out.println("O carro está desligado");
    }

    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}