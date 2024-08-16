package mensagem;

public abstract class ServicoMensagemInstantanea {
    public void enviarMensagem() {

    }

    public void receberMensagem() {
    }

    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }
}
