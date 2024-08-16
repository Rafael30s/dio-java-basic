package exemploInterface;

public class Fabrica {
    public static void main(String[] args) {

        EquipamentoMultifuncional em = new EquipamentoMultifuncional();


        em.copiar();
        em.imprimir();
        em.digitalizar();
    }
}
