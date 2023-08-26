public class FormatadorCep {
    public static void main(String[] args) throws Exception {
        try {
            String cepFormatado = formatarCep ("23456789");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP não corresponde com as regras de negócio.");
        }
    }
    static String formatarCep (String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }
        return "23.456-789"; 
    }
}
