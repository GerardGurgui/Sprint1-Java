package Backend.Sprint1.S1_08_Lambdas.n1Ex7;



public class App {
    
    public static void main(String[] args) {
        
        
        N1ex7 n1ex7 = new N1ex7();
       
        n1ex7.afegirNoms();
        
        n1ex7.ordenarNoms();
        
        
        n1ex7.getLlistaNoms().forEach(n-> System.out.println(n));
        
    }
    
    
}