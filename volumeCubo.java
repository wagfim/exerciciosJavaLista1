import java.util.Scanner;
/**
 * @author Wagner Bonfim <wagfim.com>
 */
public class volumeCubo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Bem vindo ao calculador de volume de um cubo");
        System.out.print("Informe o valor de uma aresta do cubo: ");
        int lado = Integer.parseInt(scan.nextLine());
        
        int volume = calculaVolumeCubo(lado);
        
        System.out.println("Volume do cubo: " + volume + " unidades cúbicas.");
    }

    public static int calculaVolumeCubo(int lado) {
        return (lado * lado * lado);
    }
}
