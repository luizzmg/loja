package chocorato;

public class Cadastro {
    public static void main(String[] args) {
        cadastrar();
    }

    public static Cliente cadastrar() {

        System.out.println("Menu do cadastro\n");

        System.out.print("Digite seu nome: ");
        String nomeCliente = Global.scan.next();

        System.out.print("Digite seu email: ");
        String emailCliente = Global.scan.next();

        Cliente cliente = new Cliente(nomeCliente, emailCliente);

        System.out.println("\n\nParabéns, "+ nomeCliente +".\nVocê foi cadastrado com sucesso!\n");

        return cliente;

    }

    public static void menu() {
        
    }
}
