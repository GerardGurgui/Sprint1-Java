package Backend.Sprint1.S1_08_Lambdas.n1Ex5;

public class App {
    
    public static void main(String[] args) {
        
        //Esquerra de la fletxa arguments (en aquest cas no li passem)
        
        InterfazGetPi interfaz = ()-> {return 3.1415;};
        
        System.out.println(interfaz.getPiValue());
    }
    
    
}
