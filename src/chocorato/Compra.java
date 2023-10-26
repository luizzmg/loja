package chocorato;
public class Compra {
    public static void main(String[] args) {
        menu();
    }

    public static void comprar() {
        
    }

    public static void menu() {
        byte opcao;

        do{

        System.out.print(

              "------------------------\n" +
            "Menu da compra:\n\n" +

            "1 Chocolates\n" +
            "2 Doces\n" +
            "3 Sobremesas\n\n" +
                    "------------------------\n" +
            "Digite a opção desejada:\n" +
                "------------------------\n"

        );

        opcao = Global.scan.nextByte();

        Tela.limpar();
        
        switch (opcao) {
            case 1:
                Produto.menu(Chocolate.nomes);
                break;
            case 2:
                Produto.menu(Doce.nomes);
                break;
            case 3:
                Produto.menu(Sobremesa.nomes);
                break;
        
            default:
                System.out.println("Ops! Opção errada\n Tente novamente.");
                break;
        }

        }while(opcao >= 0);
    }
    
    private static void pagar() {
        
    }
}
