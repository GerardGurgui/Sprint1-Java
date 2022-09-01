package Backend.Sprint1.S1_06_Generics.n2Exercici1;


public class GenericMethods {
    
    
    public static <T> void metodeGeneric(T persona, String nom, T edat){
        
        System.out.println(persona.toString());
        System.out.println(nom);
        System.out.println(edat);
        
    }
    
}