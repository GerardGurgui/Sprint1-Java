package Backend.Sprint1.S1_03_Collections.n2exercici2;

import java.util.Set;
import java.util.TreeSet;

public class App {
    
    public static void main(String[] args) {
        
        
        
        //TreeSet de la classe Restaurant, té implementada la interfaz Comparable
        TreeSet<Restaurant> llistaRestaurantsPunt = new TreeSet<>();
        
        
        Restaurant restaurant1 = new Restaurant("zRestaurant", 5);
        Restaurant restaurant2 = new Restaurant("frankfurt", 4);
        Restaurant restaurant3 = new Restaurant("sushi", 6);
        Restaurant restaurant4 = new Restaurant("sushi", 7);
        Restaurant restaurant5 = new Restaurant("sushi", 6);
        Restaurant restaurant7 = new Restaurant("frankfurt", 2);
        Restaurant restaurant8 = new Restaurant("burguers", 6);
        
        ///////ORDRE PER PUNTUACIÓ
        
        //Afegin els restaurants al treeSet desordenats
        llistaRestaurantsPunt.add(restaurant4);
        llistaRestaurantsPunt.add(restaurant2);
        llistaRestaurantsPunt.add(restaurant1);
        llistaRestaurantsPunt.add(restaurant7);
        llistaRestaurantsPunt.add(restaurant8);
        llistaRestaurantsPunt.add(restaurant5);
        llistaRestaurantsPunt.add(restaurant3);
        
        
        System.out.println("---prova for each----");
        
        
       
        
        //No accepta duplicats per nom i puntuació, només per nom (7 elements agregats, tamany 5)
        
        System.out.println("llista restaurants total " +llistaRestaurantsPunt.size());
        
        
        System.out.println("------------ORDRE PUNTUACIO---------------------");
        
        
         /*
        Podem veure com ordena per puntuacio en ordre ascendent, gràcies a la implementació
        de la interfaz Comparable amb el metode sobreescrit compareTo, a la nostre classe Restaurant
        També podem observar, igual que pasava amb hashet, no admet duplicats de nom i puntuació, nomeés de nom
        */
         
        mostrarRestaurantsOrdrePunt(llistaRestaurantsPunt);
        
        
        
        ////////ORDRE PER NOM
        
        Restaurant ordenarRestaurantsNom = new Restaurant();
        
        /*
        Li passem com a parametre al treeSet una variable de tipo Restaurant
        que és on tenim definit el metode Compare i així creará el ordre segons aquest metode
        */
        
        TreeSet<Restaurant> llistaRestaurantsNom = new TreeSet<>(ordenarRestaurantsNom);
        
        llistaRestaurantsNom.add(restaurant8);
        llistaRestaurantsNom.add(restaurant4);
        llistaRestaurantsNom.add(restaurant7);
        llistaRestaurantsNom.add(restaurant2);
        llistaRestaurantsNom.add(restaurant1);
        llistaRestaurantsNom.add(restaurant3);
        llistaRestaurantsNom.add(restaurant5);
        
        
        System.out.println("---------------ORDRE PER NOM-----------------");
        
        
        mostrarRestaurantsOrdreNom(llistaRestaurantsNom);
     
        
    }
    
    
    static void mostrarRestaurantsOrdrePunt(Set<Restaurant> llistaRestaurantsPunt){


        for (Restaurant llistaRestaurant : llistaRestaurantsPunt) {

            System.out.println(llistaRestaurant);
        }

    }


    static void mostrarRestaurantsOrdreNom(Set<Restaurant> llistaRestaurantsNom){

        for (Restaurant llistaRestaurant : llistaRestaurantsNom) {

            System.out.println(llistaRestaurant);
        }

    }
       
       
    
}
