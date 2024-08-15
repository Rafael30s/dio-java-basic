package exemploInterface;

import exemploInterface.copiadora.Copiadora;
import exemploInterface.digitalizadora.Digitalizadora;
import exemploInterface.impressora.Impressora;

public class EquipamentoMultifuncional implements Impressora, Copiadora, Digitalizadora {

    @Override
    public void imprimir() {
        System.out.println("imprimindo via multi");
    }

    @Override
    public void copiar() {
        System.out.println("copiando via multi");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via multi");
    }

}
