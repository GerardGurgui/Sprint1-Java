package Backend.Sprint1.S1_06_Generics.n2Exercici1;

import Backend.Sprint1.S1_06_Generics.n1Exercici2.Persona;
import static Backend.Sprint1.S1_06_Generics.n2Exercici1.GenericMethods.metodeGeneric;

public class App {
    
    public static void main(String[] args) {
        
        
        Persona persona1 = new Persona("Gerard", "Gurgui", 30);
        Persona persona2 = new Persona("Lionel", "Messi", 40);
        
        
        //NIVELL 2 EX1, com hem indicat que un dels parametres no sigui generic, ens marca error directament
        //ara si que hem de respectar que aquest parametre correspongui a la posició del ordre dels parametres
        
        metodeGeneric(persona1, persona1.getCognom(), persona1.getEdat());
        
        System.out.println("---------------");
        
        metodeGeneric(persona2.getEdat(), persona2.getNom() , persona2);
        
        
    }
    
    
}