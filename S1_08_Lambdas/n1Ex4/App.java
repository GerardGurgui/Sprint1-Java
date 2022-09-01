package Backend.Sprint1.S1_08_Lambdas.n1Ex4;

import Backend.Sprint1.S1_08_Lambdas.n1Ex3.Calendari;

public class App {
    
    public static void main(String[] args) {
        
       
        
        Calendari mesos = new Calendari();
        
        mesos.afegirMesos();
        
        mesos.getLlistaMesos().forEach(System.out::println);
        
    }
    
}
