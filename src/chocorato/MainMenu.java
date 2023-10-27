package chocorato;

public class MainMenu {
    public static void main(String[] args) throws Exception {
        Tela.limpar();
        menu();
    }

    public static void menu() {

        //comentario de alicia

        Carrinho carro = new Carrinho();

        byte opcao = Global.mostrarMenu(
        
        "---------------------------------------------\n" +
        "Bem-vindo(a) à ChocoSweets! Como podemos ajudar?\n\n" +

        "1 - Comprar Doces e/ou Chocolates\n" +
        "2 - Criar Cadastro na loja\n" +
        "3 - Encomendar doces e/ou chocolates\n"+
        "4 - Sair\n\n" +
        
        "------------------------\n"+
        "Digite a opção desejada:\n"+
        "------------------------\n"

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
