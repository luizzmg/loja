package chocorato;

public class Chocolate {
    String nome;
    float preco;
    public static void main(String[] args) {
        menu();
    }
    static String[] nomeOpcoes = 
    {
        "Trufas de chocolate ao leite",
        "Trufas de chocolate amargo",
        "Bombons recheados com creme de avelã",
        "Chocolate branco com morangos desidratados",
        "Tabletes de chocolate gourmet",
        "Chocolate quente cremoso",
        "Chocolate belga",
        "Chocolate com amêndoas ou nozes",
        "Chocolate com recheio de caramelo"
    };

    static String menu = 
    "Trufas de chocolate ao leite\n" +
    "Trufas de chocolate amargo\n" +
    "Bombons recheados com creme de avelã\n" +
    "Chocolate branco com morangos desidratados\n" +
    "Tabletes de chocolate gourmet\n" +
    "Chocolate quente cremoso\n" +
    "Chocolate belga\n" +
    "Chocolate com amêndoas ou nozes\n" +
    "Chocolate com recheio de caramelo\n";
    

    static float[] precos = 
    {
        10,
        20,
        30,
        40,
        50,
        60,
        70,
        80,
        90,
    };

    // static String menu = 
    
    // "Chocolates disponíveis:\n\n" +
    
    // "1 - " + nomeOpcoes[1] + "R$" + precos[1] + "\n" +
    // "2 - " + nomeOpcoes[2] + "R$" + precos[2] + "\n" +
    // "3 - " + nomeOpcoes[3] + "R$" + precos[3] + "\n" +
    // "4 - " + nomeOpcoes[4] + "R$" + precos[4] + "\n" +
    // "5 - " + nomeOpcoes[5] + "R$" + precos[5] + "\n" +
    // "6 - " + nomeOpcoes[6] + "R$" + precos[6] + "\n" +
    // "7 - " + nomeOpcoes[7] + "R$" + precos[7] + "\n" +
    // "8 - " + nomeOpcoes[8] + "R$" + precos[8] + "\n" +
    // "9 - " + nomeOpcoes[9] + "R$" + precos[9] + "\n" +
    // "0 - " + nomeOpcoes[0] + "\n\n" +
    
    // "Escolha a opção desejada: "
    // ;

    static byte ultimaOp;

    public static void adicionar(byte index) {
        
    }

    public static void menu() {
        // System.out.print("Chocolates disponíveis:\n\n");

        // for (int i = 1; i < 10; i++){
        //     System.out.print(i + " - " + nomeOpcoes[i] + "R$" + precos[i] + "\n");
        // }

        // System.out.print(

        // "\n0 - Voltar ao menu anterior\n" +
        // "Escolha a opção desejada: "
        // );

    }
    
}
