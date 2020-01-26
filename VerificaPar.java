import java.util.Scanner;

/**
 * @author Wagner Bonfim <wagfim.com>
 */
public class VerificaPar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe um número: ");
        int A = scan.nextInt();
        
        if (A % 2 == 0)
            System.out.println(A + " é par!");
        else
            System.out.println(A + " é ímpar!");
    }
}
