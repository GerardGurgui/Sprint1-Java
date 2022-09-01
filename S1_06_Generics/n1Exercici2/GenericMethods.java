package Backend.Sprint1.S1_06_Generics.n1Exercici2;


public class GenericMethods {
    
    
    //Li indiquem al metode que accepti cualsevol tipos de argument amb <T> (T per convenció)
    //Abans del tipo de retorn, void en aquest cas
    
    public static <T> void metodeGeneric(T persona, T nom, T edat){
        
        System.out.println(persona.toString());
        System.out.println(nom);
        System.out.println(edat);
        
    }
    
    
}