package mensagem;

public class Computador {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;
        String appEscolhido = "msn";

        if (appEscolhido.equals("msn")) {
            smi = new MSNMesseger();
        } else if (appEscolhido.equals("fbm")) {
            smi = new FacebookMessenger();
        } else if (appEscolhido.equals("tlg")) {
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
