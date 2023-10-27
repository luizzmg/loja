package chocorato;
import java.util.HashMap;
import java.util.Map;

public class Carrinho {
    static Map<String, Float> produtos = new HashMap<>();
    float totalCompra;

    public static void main(String[] args) {
        produtos.put("Trufas de chocolate ao leite", 2.23f);
        produtos.put("Trufas de chocolate amargo", 4.64f);

        System.out.print("Digite o produto desejado para saber o preço: ");
        String consulta = Global.scan.nextLine();

        System.out.println("O preço de "+ consulta +" é "+ produtos.get(consulta));

    }
}
