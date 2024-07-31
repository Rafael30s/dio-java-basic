public class FormatadorCepExemplo {
    public static void main(String[] args) {
        String cepFormatado;
        try {
            cepFormatado = formatarCep("1");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
           // e.printStackTrace();
        System.out.println("O cep não corresponde com as regras de negocio");
        }

    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();

        // simulando um cep formatado
        return "23.765-064";
    }
}
