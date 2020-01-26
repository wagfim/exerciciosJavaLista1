import java.util.Scanner;

/**
 * @author Wagner Bonfim <wagfim.com>
 */
public class VerificaTrianguloRetangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ladoA, ladoB, ladoC;
        
        System.out.println("Informe a medida dos lados do triângulo:");
        System.out.print("Lado A: ");
        ladoA = Integer.parseInt(scan.nextLine());
        System.out.print("Lado B: ");
        ladoB = Integer.parseInt(scan.nextLine());
        System.out.print("Lado C: ");
        ladoC = Integer.parseInt(scan.nextLine());
        
        if(Math.pow(ladoC, 2) == Math.pow(ladoA, 2) + Math.pow(ladoB, 2)) {
            System.out.println("É de fato um triângulo retângulo!");
        } else {
            System.out.println("Não é um triângulo retângulo!");
        }
    }
}
