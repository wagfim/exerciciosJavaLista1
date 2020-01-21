import java.util.Scanner;

/**
 * @author Wagner Bonfim <wagfim.com>
 */
public class calculaPrecoCombustivelMistura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double qtdGasolina, qtdAlcool, qtdTotal, precoGasolina, precoAlcool, precoTotal;
        
        System.out.print("Informe o preço do litro de gasolina: ");
        precoGasolina = Double.parseDouble(scan.nextLine());
        System.out.print("Informe o preço do litro de alcool: ");
        precoAlcool = Double.parseDouble(scan.nextLine());
        
        precoGasolina *= 0.75;
        precoAlcool *= 0.25;
        
        precoTotal = precoGasolina + precoAlcool;
        System.out.println("Preço da mistura: R$ " + precoTotal);
        
    }
    public void exibeTexto() {
        System.out.println("Texto");
    }
}
