public class TesteValidador {

    public static void main(String[] args) {

        // long number = 0;
        String cpfCnpj = null;

        try {
            int opcao = 0;
            int opcao2;

            while (opcao != 3) {
                System.out.println();
                System.out.println("Digite a opção: ");
                System.out.println("(1) - Validar um CPF");
                System.out.println("(2) - Validar um CNPJ");
                System.out.println("(3) - Sair");
                opcao = Teclado.getUmInt();
                System.out.println();

                switch (opcao) {
                    case 1: {
                        System.out.println("Digite somente os numeros do CPF: ");
                        cpfCnpj = Teclado.getUmString();
                        System.out.println();
                        if (ValidadorCPF.validaCPF(cpfCnpj)) {
                            System.out.println("CPF válido!\n");
                        } else {
                            System.out.println("CPF inválido!\n");
                        }

                        break;
                    }
                    case 2: {
                        System.out.println("Digite somente os numeros do CNPJ: ");
                        cpfCnpj = Teclado.getUmString();
                        System.out.println();
                        if (ValidadorCNPJ.validaCNPJ(cpfCnpj)) {
                            System.out.println("CNPJ válido!\n");
                        } else {
                            System.out.println("CNPJ inválido!\n");
                        }

                        break;
                    }
                    case 3: {
                        System.out.println("Encerrando programa.\n");
                        opcao2 = 2;
                        break;
                    }
                    default: {
                        System.out.println("Opção inválida!\n");
                        break;
                    }
                }
                if (opcao != 3) {
                    System.out.println("Deseja validar outro documento?");
                    System.out.println("(1) - Sim");
                    System.out.println("(2) - Não");
                    opcao2 = Teclado.getUmInt();
                    while (opcao2 != 1 && opcao2 != 2) {
                        System.out.println("Opção inválida! Digite novamente.\n");
                        opcao2 = Teclado.getUmInt();
                    }
                    if (opcao2 == 2) {
                        System.out.println("Encerrando o programa!\n");
                        break;
                    }
                }
            }
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }
    }
}
