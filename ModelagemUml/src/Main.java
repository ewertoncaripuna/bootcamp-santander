import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Iphone iPhone = new Iphone();
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            System.out.println("Selecione uma funcionalidade:");
            System.out.println("1. Reprodutor Musical");
            System.out.println("2. Aparelho Telefônico");
            System.out.println("3. Navegador na Internet");
            System.out.println("4. Sair");
            System.out.println();
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    gerenciarReprodutorMusical(iPhone, scanner);
                    break;
                case 2:
                    gerenciarTelefone(iPhone, scanner);
                    break;
                case 3:
                    gerenciarNavegadorInternet(iPhone, scanner);
                    break;
                case 4:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
        System.out.println("Encerrando programa...");
    }

    private static void gerenciarReprodutorMusical(Iphone iPhone, Scanner scanner) {
        System.out.println("Reprodutor Musical:");
        System.out.println("1. Tocar");
        System.out.println("2. Pausar");
        System.out.println("3. Selecionar Música");
        System.out.println();
        int escolha = scanner.nextInt();
        scanner.nextLine();

        switch (escolha) {
            case 1:
                iPhone.tocar();
                break;
            case 2:
                iPhone.pausar();
                break;
            case 3:
                System.out.println("Digite o nome da música:");
                String musica = scanner.nextLine();
                iPhone.selecionarMusica(musica);
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static void gerenciarTelefone(Iphone iPhone, Scanner scanner) {
        System.out.println("Aparelho Telefônico:");
        System.out.println("1. Ligar");
        System.out.println("2. Atender");
        System.out.println("3. Iniciar Correio de Voz");
        System.out.println();
        int escolha = scanner.nextInt();
        scanner.nextLine();

        switch (escolha) {
            case 1:
                System.out.println("Digite o número para ligar:");
                String numero = scanner.nextLine();
                iPhone.ligar(numero);
                break;
            case 2:
                iPhone.atender();
                break;
            case 3:
                iPhone.iniciarCorreioVoz();
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static void gerenciarNavegadorInternet(Iphone iPhone, Scanner scanner) {
        System.out.println("Navegador na Internet:");
        System.out.println("1. Exibir Página");
        System.out.println("2. Adicionar Nova Aba");
        System.out.println("3. Atualizar Página");
        System.out.println();
        int escolha = scanner.nextInt();
        scanner.nextLine();

        switch (escolha) {
            case 1:
                System.out.println("Digite a URL da página:");
                String url = scanner.nextLine();
                iPhone.exibirPagina(url);
                break;
            case 2:
                iPhone.adicionarNovaAba();
                break;
            case 3:
                iPhone.atualizarPagina();
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }
}
