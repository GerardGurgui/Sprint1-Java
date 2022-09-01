package Backend.Sprint1.S1_08_Lambdas.n2Ex3;

public class App {
    
    public static void main(String[] args) {
        
        float a = 8;
        float b = 4;
        
        //SUMA
        Operacio opSuma = ()->{return a+b;};
        System.out.println("Suma = "+opSuma.Operacio());
        
        //RESTA
        Operacio opResta = ()->{return a-b;};
        System.out.println("Resta = "+ opResta.Operacio());
        
        //Multiplicacio
        Operacio opMultip = ()->{return a*b;};
        System.out.println("Multiplicació = " +opMultip.Operacio());
        
        
        //Divisio
        Operacio opDivisio = ()->{return a/b;};
        System.out.println("Divisió = " +opDivisio.Operacio());
        
    }
    
}
