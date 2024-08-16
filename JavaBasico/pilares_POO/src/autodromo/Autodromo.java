package autodromo;
public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("12345678");
        jeep.ligar();

        Moto x400 = new Moto();
        x400.setChassi("4567789");

        Veiculo coringa = x400;

        coringa.ligar();
    }
}
