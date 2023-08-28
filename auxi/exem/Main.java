package auxi.exem;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Vermelho", "Sedan");

        String cor = meuCarro.getCor();
        String modelo = meuCarro.getModelo();
        
        System.out.println("Cor do carro: " + cor);
        System.out.println("Modelo do carro: " + modelo);

        meuCarro.ligar();
        meuCarro.desligar();
    }

}
