package Backend.Sprint1.S1_08_Lambdas.n1Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    
    public static void main(String[] args) {
        
        
        List<Producte> llistaProductes = new ArrayList<>();
        
        
        llistaProductes.add(new Producte("mobil", 100));
        llistaProductes.add(new Producte("samarreta", 25));
        llistaProductes.add(new Producte("cadira", 30));
        llistaProductes.add(new Producte("mando", 60));
        llistaProductes.add(new Producte("tele", 200));
        llistaProductes.add(new Producte("cartera", 20));
        llistaProductes.add(new Producte("ordinador", 1000));
        
       //llistaProductes.forEach(n-> System.out.println(n));
         
        List<Producte> llistaFiltrats = filtrarProductes(llistaProductes);
        
        System.out.println("Llista Filtrats");                                
        
        llistaFiltrats.forEach(n-> System.out.println(n));
        
    }
    
    
    static List<Producte> filtrarProductes(List<Producte> llistaProductes){
        
         /*Amb les lambdas anem encadenant operacions partint del stream */
        
        List<Producte> llistaFiltrats = llistaProductes.stream()
                                        .filter(p-> p.getNom().contains("o"))   //Filtrar només el noms que continguin "o"
                                        .collect(Collectors.toList());          //Collectors.toList va recolectan els que pasan el filtro i guarda a la llista
        
        return llistaFiltrats;
         
    }
    
}
