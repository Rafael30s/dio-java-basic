package mensagem;

public class FacebookMessenger extends ServicoMensagemInstantanea {

    public void enviarMensagem() {

        validarConectadoInternet();
        System.out.println("Enviando mensagem Facebook");
        // salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem Facebook");

    }

}
