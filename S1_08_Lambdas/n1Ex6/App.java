package Backend.Sprint1.S1_08_Lambdas.n1Ex6;



public class App {
    
    public static void main(String[] args) {
        
        
        N1ex6 n1ex6 = new N1ex6();
       
        n1ex6.afegirNoms();
        
        n1ex6.ordenarNoms();
        
        
        n1ex6.getLlistaNoms().forEach(n-> System.out.println(n));
        
    }
    
    
}
