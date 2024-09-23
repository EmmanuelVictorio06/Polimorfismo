import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Spotify!");
        System.out.println("Escolha o tipo de conta que deseja criar:");
        System.out.println("1. Conta Free");
        System.out.println("2. Conta Premium");
        System.out.println("3. Conta Estudante");
        System.out.print("Digite o número da opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o número

        Conta contaEscolhida = null;

        // Coletando dados comuns
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o email: ");
        String email = scanner.nextLine();

        // Criando a conta com base na escolha do usuário
        switch (opcao) {
            case 1:
                System.out.print("Qual o limite de músicas por hora? ");
                int limiteMusicas = scanner.nextInt();
                contaEscolhida = new ContaFree(nome, email, limiteMusicas);
                break;

            case 2:
                System.out.print("Deseja acesso offline (true/false)? ");
                boolean acessoOffline = scanner.nextBoolean();
                contaEscolhida = new ContaPremium(nome, email, acessoOffline);
                break;

            case 3:
                System.out.print("Digite o nome da instituição de ensino: ");
                String instituicao = scanner.nextLine();
                contaEscolhida = new ContaEstudante(nome, email, instituicao);
                break;

            default:
                System.out.println("Opção inválida.");
                System.exit(0);
        }

        // Mostrando informações da conta criada
        System.out.println("\nConta criada com sucesso!");
        contaEscolhida.mostrarInformacoes();

        // Chamando o método polimórfico
        realizarAcessoOffline(contaEscolhida);

        // Chamando métodos específicos com instanceof
        if (contaEscolhida instanceof ContaFree) {
            ((ContaFree) contaEscolhida).exibirLimiteMusicas();
        } else if (contaEscolhida instanceof ContaPremium) {
            ((ContaPremium) contaEscolhida).baixarMusica();
        } else if (contaEscolhida instanceof ContaEstudante) {
            ((ContaEstudante) contaEscolhida).exibirInstituicao();
        }

        scanner.close();
    }

    // Método polimórfico
    public static void realizarAcessoOffline(Conta conta) {
        conta.acessarMusicasOffline();
    }
}

