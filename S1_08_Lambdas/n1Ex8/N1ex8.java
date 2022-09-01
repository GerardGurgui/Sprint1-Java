package Backend.Sprint1.S1_08_Lambdas.n1Ex8;


public class N1ex8 {
    
    
    public static void main(String[] args) {
        
        
        InterfazReverse interfaz = (text)-> {
            
            String resultado = " ";
            
            for (String recorrer : text.split(" ")) {
                
                resultado += new StringBuilder(recorrer).reverse().toString() + " ";
            }
            
            return resultado;
            
        };
        
        
        String frase = "provant frase al reves";
        
        System.out.println(interfaz.reverse(frase));
        
        
    }
    
}