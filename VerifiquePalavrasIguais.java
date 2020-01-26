import java.util.Scanner;

/**
 * @author Wagner Bonfim <wagfim.com>
 */
public class VerifiquePalavrasIguais {
    public static void main(String[] args) {
        String palavra1, palavra2;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Este programa irá verificar se duas palavras são iguais.");
        System.out.print("Informe a primeira palavra: ");
        palavra1 = scan.nextLine();
        System.out.print("Informe a segunda palavra: ");
        palavra2 = scan.nextLine();
        
        boolean palavrasSaoIguais = verificaStringEquals(palavra1, palavra2);
        
        if(palavrasSaoIguais) {
            System.out.println("As palavras são iguais!");
        } else {
            System.out.println("As palavras são diferentes!");
        }
    }

    private static boolean verificaStringEquals(String palavra1, String palavra2) {
        palavra1 = palavra1.toLowerCase();
        palavra2 = palavra2.toLowerCase();
        
        return palavra1.equals(palavra2);
    } 
}
