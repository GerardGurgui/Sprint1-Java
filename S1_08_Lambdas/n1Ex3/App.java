package Backend.Sprint1.S1_08_Lambdas.n1Ex3;



public class App {
    
    public static void main(String[] args) {
        
        
        Calendari mesos = new Calendari();
        
        mesos.afegirMesos();
        
        mesos.getLlistaMesos().forEach(n-> System.out.println(n));
        
        
    }
    
    
}
