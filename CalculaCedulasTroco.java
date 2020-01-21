public class CalculaCedulasTroco {
    public static void main(String[] args) {
        //only Integers
        int valorCompra = 124;
        int[] cedulas = {100,50,10,5,2,1}; //avaiable values
        int i = 0; //array index
        
        while(valorCompra > 0) {            
            int quantiaCedulas = valorCompra/cedulas[i];
            
            if(quantiaCedulas > 0)
                System.out.println(quantiaCedulas + " cédulas de " + cedulas[i] + " reais.");
            
            valorCompra %= cedulas[i++];
        }       
    }
}
