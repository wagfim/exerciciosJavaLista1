import java.util.Scanner;

/**
 * @author Wagner Bonfim <wagfim.com>
 */
public class AlcoolOuGasolina {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double precoAlcool, precoGasolina;
        
        System.out.println("Informe o preço dos combustíveis:");
        System.out.print("Álcool: ");
        precoAlcool = scan.nextDouble();
        System.out.print("Gasolina: ");
        precoGasolina = scan.nextDouble();
        
        if(precoAlcool < precoGasolina * 0.7) {
            System.out.println("Álcool compensa mais que a Gasolina!");
        } else {
            System.out.println("Gasolina compensa mais do que o Álcool!");
        }
    }
}
