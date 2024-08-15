package mensagem;

public class MSNMesseger extends ServicoMensagemInstantanea {
    public void enviarMensagem() {

        validarConectadoInternet();
        System.out.println("Enviando mensagem MSN");
        // salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem MSN");

    }

}