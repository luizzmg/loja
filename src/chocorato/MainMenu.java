package chocorato;
import java.util.Scanner;
public class MainMenu {

    static Scanner scan = new Scanner(System.in);
    static byte opcao;

    public static void main(String[] args) throws Exception {
        menu();
    }

    public static void menu() {
        do{
        System.out.print(
        
        "Bem-vindo(a) à Chocorato! Como podemos ajudar?\n\n" +

        "1 - Comprar Doces/Chocolates\n" +
        "2 - Criar Cadastro na loja\n" +
        "3 - Encomendar doces/chocolates para data futura\n" +
        "4 - Sair\n\n" +

        "Digite a opção desejada: "
        );

        opcao = scan.nextByte();

        switch (opcao) {
            case 1:
                Compra.menu();
                break;
            case 2:
                Cadastro.menu();
                break;
            case 3:
                Encomenda.menu();
                break;
            case 4:
                Tela.limpar();
                System.out.println("Você escolheu sair");
                break;
            default:
                break;
            }

        } while (opcao < 1 || opcao > 4);
    }
}
