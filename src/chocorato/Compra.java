package chocorato;
public class Compra {
    public static void main(String[] args) {
        menu();
    }

    public static void comprar() {
        
    }

    public static void menu() {

        byte opcao = Global.mostrarMenu(

            "Menu da compra:\n\n" +

            "1 Chocolates\n" +
            "2 Doces\n" +
            "3 Sobremesas\n\n" +

            "Digite a opção desejada: "

        , (byte) 3 /* a opção máxima possível */);
        
        switch (opcao) {
            case 1:
                Global.mostrarMenu(Chocolate.menu, Chocolate.ultimaOp);
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
        
            default:
                break;
        }
    }
    
    private static void pagar() {
        
    }
}
