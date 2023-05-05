public class ValidadorCPF {

    public static boolean validaCPF(String cpf) {
        try {
            String[] cpfArray = cpf.split("");
            if (cpfArray.length != 11) {
                System.out.println("CPF deve conter 11 dígitos!");
                return false;
            }
            int[] cpfDigits = arrayStringToArrayInt(cpfArray);
            if (!isDigitoUmValida(cpfDigits) || !isDigitoDoisValido(cpfDigits)) {
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static int[] arrayStringToArrayInt(String[] cpfArray) {
        int[] intArray = new int[11];
        for (int i = 0; i < 11; i++) {
            intArray[i] = Integer.parseInt(cpfArray[i]);
        }
        return intArray;
    }

    private static boolean isDigitoUmValida(int[] cpfDigits) {
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += cpfDigits[i] * (10 - i);
        }
        int resto = soma % 11;
        int digitoUm = (resto < 2) ? 0 : (11 - resto);
        return cpfDigits[9] == digitoUm;
    }

    private static boolean isDigitoDoisValido(int[] cpfDigits) {
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += cpfDigits[i] * (11 - i);
        }
        int resto = soma % 11;
        int digitoDois = (resto < 2) ? 0 : (11 - resto);
        return cpfDigits[10] == digitoDois;
    }
}
