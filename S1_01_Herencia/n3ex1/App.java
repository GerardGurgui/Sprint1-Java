package Backend.Sprint1.S1_01.n3ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App {
    
   
    
    
    public static void main(String[] args) {
        
        menu();
        
    }
    
    
    
    
    public static void menu(){
        
        Scanner input = new Scanner(System.in);
        
        int opcioUsuari;
        
        ArrayList<Redactor> llistaRedactors = new ArrayList<>();
        
        
        do {    
            
        System.out.println("Benvingut a la nostre web de noticies");
        
        System.out.println("0- Sortir");
        System.out.println("1- Crear redactor");
        System.out.println("2- Mostrar redactors");
        System.out.println("3- Eliminar redactor");
        System.out.println("4- Introduir noticia a un redactor");
        System.out.println("5- Eliminar noticia");
        System.out.println("6- calcular puntuació noticia");
        System.out.println("7- calcular preu noticia");
        
        System.out.println("Introdueixi una opció: ");
        
        opcioUsuari = input.nextInt();
        
        
        switch(opcioUsuari){
            
            case 1:
                
                System.out.println("opció 1- crear un redactor");
                
                System.out.println("Introdueixi el nom del redactor");
                input.nextLine();
                String nom = input.nextLine();
                
                System.out.println("Introdueixi el Dni del redactor");
                String dni = input.nextLine();
                
                crearRedactor(nom,dni,llistaRedactors);
                
                
                break;
                
            case 2:
                
                System.out.println("Opció 2- mostrar redactors");
                
                mostrarRedactors(llistaRedactors);
                
                break;
                
            case 3:
                
                System.out.println("Opció 3- Eliminar redactor");
                
                System.out.println("introdueixi el dni del redactor a eliminar");
                input.nextLine();
                String dniEliminar = input.nextLine();
                
                
                eliminarRedactor(dniEliminar,llistaRedactors);
                
                
                break;
               
            
            case 4:
                
                System.out.println("Opció -");
                
                break;
               
            
            case 5:
                
                System.out.println("Opció -");
                
                break;
               
            
            case 6:
                
                System.out.println("Opció -");
                
                break;
               
            
        }
        
            
            
        } while (opcioUsuari != 0);
        
  
    } //FI MENU
    
    
    public static void crearRedactor(String nom, String Dni, ArrayList<Redactor> llistaRedactors){
        
        Redactor redactor = new Redactor(nom,Dni);
    
        llistaRedactors.add(redactor);
        
    }
    
    
    public static void mostrarRedactors(ArrayList<Redactor> llistaRedactors){
        
        if (llistaRedactors.isEmpty()) {
            
            System.out.println("no existeix cap redactor a la llista");
            
        } 
            
        
        for (Redactor llistaR : llistaRedactors) {

            System.out.println(llistaR.toString());
            
        }
            
    }
    
    
    public static void eliminarRedactor(String dni, ArrayList<Redactor> llistaRedactors){
        
        int i = 0;
        boolean encontrado = false;
        
        while (i<llistaRedactors.size() && encontrado == false) {            
            
            if (dni.equals(llistaRedactors.get(i).getDNI())) {
                
                llistaRedactors.remove(i);////NOOOOOOOOOOOO
                
                System.out.println("Redactor eliminat correctament");
                
                encontrado = true;
                
            }
            
            i++;
        }
        
        if (encontrado == false) {
            
            System.out.println("no existeix aquest redactor");
            
        }
        
    }
    
   
}
