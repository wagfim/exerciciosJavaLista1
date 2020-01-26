import java.util.Scanner;
/**
 * @author Wagner Bonfim <github.com/wagfim>
 */
public class CustoPinturaGalpao {
    static int coberturaTintaA = 50;
    static int coberturaTintaB = 30;
    static int coberturaTintaC = 20;
    static double precoTintaA = 10.99;
    static double precoTintaB = 15.99;
    static double precoTintaC = 79.25;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int comprimento, largura, altura, totalMetrosQuadrados, quantidadeGaloes;
        double custoTotal;
        
        System.out.println("Este programa irá calcular os custos de pintura de um galpão.");
        System.out.println("Informe as dimensões do prédio:");
        System.out.print("Comprimento: ");
        comprimento = Integer.parseInt(scan.nextLine());
        System.out.print("Largura: ");
        largura = Integer.parseInt(scan.nextLine());
        System.out.print("Altura: ");
        altura = Integer.parseInt(scan.nextLine());
        
        totalMetrosQuadrados = ((comprimento * altura) * 4) + ((largura * altura) * 4);
        
        System.out.println("\ninfo: Área total: " + totalMetrosQuadrados + " metros quadrados.\n");
        
        System.out.println("******************************");
        System.out.println("*       Catálogo             *");
        System.out.println("*                            *");
        System.out.println("* 1. Tinta A: "+ coberturaTintaA +"m2 >> R$"+ precoTintaA +"   *");
        System.out.println("* 2. Tinta B: "+ coberturaTintaB +"m2 >> R$"+ precoTintaB +"   *");
        System.out.println("* 3. Tinta C: "+ coberturaTintaC +"m2 >> R$"+ precoTintaC +"   *");
        System.out.println("*                            *");
        System.out.println("******************************");
        
        int opcao = 0;
        do {
            System.out.println("Deseja o orçamento de qual tinta? (0 para sair)");
            System.out.print("> ");
            opcao = Integer.parseInt(scan.nextLine());
            if(opcao == 0)
                break;
            
            switch(opcao) {
                case 1:
                    quantidadeGaloes = totalMetrosQuadrados / coberturaTintaA;
                    custoTotal = quantidadeGaloes * precoTintaA;
                    System.out.println("Galões necessários: " + quantidadeGaloes + ". Custo total R$ " + custoTotal);
                    break;
                case 2:
                    quantidadeGaloes = totalMetrosQuadrados / coberturaTintaB;
                    custoTotal = quantidadeGaloes * precoTintaB;
                    System.out.println("Galões necessários: " + quantidadeGaloes + ". Custo total R$ " + custoTotal);
                    break;
                case 3:
                    quantidadeGaloes = totalMetrosQuadrados / coberturaTintaC;
                    custoTotal = quantidadeGaloes * precoTintaC;
                    System.out.println("Galões necessários: " + quantidadeGaloes + ". Custo total R$ " + custoTotal);
                    break;
                default:
                    System.out.println("Opcao inválida!");
                    break;
            }
            pressEnter();
        } while(opcao != 0);  
    }
    
    public static void pressEnter(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Press enter to continue...");
        scan.nextLine();
    }
    
}
