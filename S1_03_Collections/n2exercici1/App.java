package Backend.Sprint1.S1_03_Collections.n2exercici1;

import java.util.HashSet;
import java.util.Set;

public class App {
    
    public static void main(String[] args) {
        
       
        Restaurant restaurant1 = new Restaurant("burguers", 6);
        Restaurant restaurant2 = new Restaurant("frankfurt", 4);
        Restaurant restaurant3 = new Restaurant("sushi", 6);
        Restaurant restaurant4 = new Restaurant("sushi", 7);
        Restaurant restaurant5 = new Restaurant("sushi", 6);
        Restaurant restaurant6 = new Restaurant("frankfurt", 4);
        
        
        Set<Restaurant> llistaRestaurants = new HashSet<Restaurant>();
        
        
        llistaRestaurants.add(restaurant1);
        llistaRestaurants.add(restaurant2);
        llistaRestaurants.add(restaurant3);
        llistaRestaurants.add(restaurant4);
        llistaRestaurants.add(restaurant5);
        llistaRestaurants.add(restaurant6);
        
       
        
        System.out.println("llista restaurants total " +llistaRestaurants.size());
        
        
        System.out.println("------------------------------------");
        
        /*
        Metode info tots els restautants, on podem veure que només tenim repetició per nom pero 
        no per nom i puntuació
        */
        
        mostrarRestaurants(llistaRestaurants);
        
        
    }

  
    
    
    
    static void mostrarRestaurants (Set<Restaurant> llistaRestaurants){
        
        
        for (Restaurant llistaRestaurant : llistaRestaurants) {
            
            System.out.println(llistaRestaurant.toString());
        }
        
    }
    
    
    
   
    
     
}
   
         
        
    
    
    
