package chocorato;

import java.util.Scanner;

public class Global {

    //scanner que vai ser usado em todas as classes
    static Scanner scan = new Scanner(System.in);

    //comando pra limpar a tela, que na vdd só afasta o histórico pra cima
    public static void limpar() {
    }

    public static byte mostrarMenu(String menu, byte ultimaOp) {
        byte opcao;

        do{
        
            System.out.print(menu); 
        
            opcao = scan.nextByte();

        }
        while(opcao < 0 || opcao > ultimaOp);
        

        return opcao;
    }
}
