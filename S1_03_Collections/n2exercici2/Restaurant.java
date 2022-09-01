package Backend.Sprint1.S1_03_Collections.n2exercici2;


import java.util.Comparator;


/*Implementem la interfaz de java Comparable que conté el metode compareTo(Objecte objecte)
L'utilizarem per comparar i ordenar els objectes per puntuació, ja que el metode d'aquesta interfaz
només treballa amb integers i amb un mateix objecte. Ens servirá per ordenar per puntuació
Si volem ordenar també per nom, tindrem que implementar la interfaz Comparator amb un metode semblant al compareTo
pero aquest ens permet comparar entre dos objectes i podrem ordenar per nom
*/

public class Restaurant implements Comparable<Restaurant>, Comparator<Restaurant> {
    
    
    private String nom;
    private int puntuacio;
    
    
    
    public Restaurant(){
        
        
    }
    
    
    public Restaurant(String nom, int puntuacio){
        
        this.nom = nom;
        this.puntuacio = puntuacio;
        
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(int puntuacio) {
        this.puntuacio = puntuacio;
    }
    
    
  
    

    @Override
    public String toString() {
        return "Restaurant{" + "nom=" + nom + ", puntuacio=" + puntuacio + '}';
    }

    /*
    Metode que sobreescribim de la interfaz de Comparable 
    l'adaptem als atributs de la nostre classe, ens compara dels objectes de la llista
    per ordenar per puntuació
    */
    
    @Override
    public int compareTo(Restaurant restaurant) {
        
        return this.puntuacio - restaurant.puntuacio;
        
    }
    
    
    /*
    Metode que sobreescribim de la interfaz Comparator
    Ens compara els atributs de dos objectes de la classe (en aquet cas Strings)
    També ens retorna un integer, pot ser un negatiu, 0 o un positiu si el primer argument es menor
    són iguals o el primer es major que el segon
    */
    
    
    @Override
    public int compare(Restaurant restaurant1, Restaurant restaurant2){
        
        String comparar1 = restaurant1.getNom();
        String comparar2 = restaurant2.getNom();
        
        
        //Metode propi de la interfaz Comparator, diferent del de Comparable
        return comparar1.compareTo(comparar2);         
    }
    
    
    
    
}