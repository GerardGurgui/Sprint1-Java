package Backend.Sprint1.S1_06_Generics.n2Exercici2;
import java.util.Collection;



public class MetodeGeneric {
    
    
    //Li indiquem al mètode i als parametres que rebrán datos de tipos generics
    
    public static <T> void metodeGeneric(Collection<T> personas, Collection<T> noms, Collection<T> edats) {        
        
        
        System.out.println("-----LLISTA PERSONAS-----");
        
        
        for (T llistaPersonas : personas) {
        
            System.out.println(llistaPersonas);
        }
        
        System.out.println("-----LLISTA NOMS-----");
        
        for (T llistaNoms : noms) {
            
            System.out.println(llistaNoms);
            
        }
        
        System.out.println("-----LLISTA EDATS-----");
        
        for (T llistaEdats : edats) {
            
            System.out.println(llistaEdats);
        }
        
        
    }
}
