public class MinhaClasse {

    public static void main(String[] args) {
        // imutável
        final String BR = "Brasil";

        // variaveis

        int anoFabricacao = 2024;
        boolean verdadeira = true;
        anoFabricacao = 2023;

        // nomes
        String primeiroNome = "Rafael";
        String segundoNome = "Santos";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
