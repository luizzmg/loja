package chocorato;

public class Cliente {
    String nome;
    String email;

    public Cliente(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public void apresendar(){
        System.out.println("Olá, sou cliente e meu nome é " + this.nome);
        System.out.println("E o meu email é " + this.email);
        
    }
}
