package Backend.Sprint1.S1_06_Generics.n2Exercici2;

import Backend.Sprint1.S1_06_Generics.n1Exercici2.Persona;
import static Backend.Sprint1.S1_06_Generics.n2Exercici2.MetodeGeneric.metodeGeneric;
import java.util.ArrayList;
import java.util.Collection;



public class App  {
    
    
     public static void main(String[] args) {
        
        /////PERSONAS
        Persona persona1 = new Persona("Gerard", "Gurgui", 30);
        Persona persona2 = new Persona("Lionel", "Messi", 40);
        Persona persona3 = new Persona("Mister", "Random", 45);
        
        Collection llistaPersonas = new ArrayList<>();
        
        llistaPersonas.add(persona1);
        llistaPersonas.add(persona2);
        llistaPersonas.add(persona3);
        
        
        /////NOMS
        Collection llistaNoms = new ArrayList<>();
        
        llistaNoms.add(persona1.getNom());
        llistaNoms.add(persona2.getNom());
        llistaNoms.add(persona3.getNom());
        
        
        
        ////EDATS
        Collection llistaEdats = new ArrayList<>();
        
        llistaEdats.add(persona1.getEdat());
        llistaEdats.add(persona2.getEdat());
        llistaEdats.add(persona3.getEdat());
        
        
        metodeGeneric(llistaPersonas, llistaNoms, llistaEdats);
        
        System.out.println("------ORDRE PARAMATRES CANVIAT------");
        
        metodeGeneric(llistaNoms, llistaEdats, llistaPersonas);
          
    }


    
}