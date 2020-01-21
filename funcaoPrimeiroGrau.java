import java.util.Scanner;
/**
 * @author Wagner Bonfim <wagfim.com>
 */
public class funcaoPrimeiroGrau {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Considerando uma função ax + b = c, informe os valores de a, b, c");
        System.out.print("a =  ");
        double a = Double.parseDouble(scan.next());
        System.out.print("b =  ");
        double b = Double.parseDouble(scan.next());
        System.out.print("c =  ");
        double c = Double.parseDouble(scan.next());
        
        double x = (double)(c - b) / a;
        
        System.out.println("Valor de x: " + x);
    }
}
