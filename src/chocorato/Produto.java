package chocorato;

public class Produto {
    public static void menu(String[] nomes){
        byte opcao = 0;

        System.out.print("Opções disponíveis:\n\n");
        
        int tamanho = nomes.length;

        for(int i = 0 ; i < tamanho ; i++){ /* mostrando todos os produtos */
            System.out.print((i+1) + " - R$xx - " + nomes[i] + "\n");
        }

        System.out.print(
            "\n0 - Voltar\n\n" +

            "Digite a opção desejada: "
        );

        do{

        opcao = Global.scan.nextByte();

        if (opcao > 0 && opcao < 10){
            System.out.printf("\n%s será adicionado ao carrinho\n", nomes[opcao-1]);
            System.out.print("Digite o que mais deseja adicionar (ou 0 para concluir): ");
        }
        else if(opcao == 0){
            Tela.limpar();
        }
        else{
            System.out.print("Digite uma opção válida: ");
        }

        } while(opcao != 0);
    }
}
