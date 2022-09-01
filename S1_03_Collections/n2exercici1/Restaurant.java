package Backend.Sprint1.S1_03_Collections.n2exercici1;

import java.util.Objects;

public class Restaurant {
    
    private String nom;
    private int puntuacio;
    
    
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
    
    
    //EQUALS & HASHCODE

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nom);
        hash = 59 * hash + this.puntuacio;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        boolean sonIguales = false;
       
        //comprovem si el objecte que rep el metode es una instancia de la nostre clase
        if(obj instanceof Restaurant){
            
            /*Necesitarem accedir als atributs de la clase, per tant, hem de fer
            cast del objecte per que sigui de tipo Restaurant*/
            Restaurant comprobarRestaurant = (Restaurant) obj;
            
            if (this.nom.equals(comprobarRestaurant.nom) && this.puntuacio == comprobarRestaurant.puntuacio) {
                
                sonIguales = true;
                
            } else {
                
                sonIguales = false;
            }
            
        }
        
        return sonIguales;
        
    }
    
    
    
    

    @Override
    public String toString() {
        return "Restaurant{" + "nom=" + nom + ", puntuacio=" + puntuacio + '}';
    }
    
    
    
}
