import java.util.Scanner;

/**
 * @author Wagner Bonfim <github.com/wagfim>
 */
public class RetanguloDentroDeCircunferencia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int altura, comprimento;
        double raio;
        
        System.out.println("Este programa diz se um determinado retangulo cabe ou não dentro de uma circunferência.");
        System.out.print("Informe o valor da altura do retângulo: ");
        altura = Integer.parseInt(scan.nextLine());
        System.out.print("Informe o valor do comprimento do retângulo: ");
        comprimento = Integer.parseInt(scan.nextLine());
        System.out.print("Informe o raio da circunferência: ");
        raio = Double.parseDouble(scan.nextLine());
        
        boolean check = checkRetanguloInsideCircle(altura, comprimento, raio);
        
        if(check) {
            System.out.println("Sim, o retangulo cabe dentro da circunferência!");
        } else {
            System.out.println("O retângulo não cabe na circunferência.");
        }
    }

    private static boolean  checkRetanguloInsideCircle(int altura, int comprimento, double raio) {
        return altura < raio * 2 && comprimento < raio * 2;
    }
}
