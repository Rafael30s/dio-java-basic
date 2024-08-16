package autodromo;
public class Carro extends Veiculo {

    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("Carro ligado");
    }

    public void confereCombustivel() {
        System.out.println("conferindo combustivel");
    }

    public void confereCambio() {
        System.out.println("conferindo cambio em P");
    }

}
