package chocorato;
import java.util.Scanner;
public class Perte {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String entrada;
        
        do {
            System.out.println("\n\n\n\n");
            System.out.println("Tinham dois cachorros: Pete e Repete. Pete morreu... quem ficou?");

            entrada = scan.nextLine();

        } while (entrada.equalsIgnoreCase("repete"));

        System.out.println("Sabe nem brincar :(");

        scan.close();
    }
}
