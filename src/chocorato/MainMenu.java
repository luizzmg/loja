package chocorato;

public class MainMenu {
    public static void main(String[] args) throws Exception {
        Tela.limpar();
        Carrinho carrinho = new Carrinho();
        menu();
    }

    public static void menu() {

        byte opcao = Global.mostrarMenu(
        
        "Bem-vindo(a) à Chocorato! Como podemos ajudar?\n\n" +

        "1 - Comprar Doces/Chocolates\n" +
        "2 - Criar Cadastro na loja\n" +
        "3 - Encomendar doces/chocolates para data futura\n" +
        "4 - Sair\n\n" +

        "Digite a opção desejada: "

        , (byte) 4 /* opção máxima disponível */);

        Tela.limpar();

        switch (opcao) {
        case 1:
            Compra.menu();
            break;
        case 2:
            Cadastro.cadastrar();
            break;
        case 3:
            Encomenda.menu();
            break;
        case 4:
            Global.limpar();
            System.out.println("Você escolheu sair");
            break;
        default:
            break;
        }
    }
}
