package mensagem;

public class Telegram extends ServicoMensagemInstantanea {

    public void enviarMensagem() {

        validarConectadoInternet();
        System.out.println("Enviando mensagem Telegram");
        // salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem Telegram");

    }

}
