package Backend.Sprint1.S1_03_Collections.n1exercici1;


import java.util.Objects;

public class Month {
    
    private String name;
    
    
    
    public Month(String name){
        
        this.name = name;
        
    }

    
    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }
    
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        boolean sonIguales = false;
       
        //comprovem si el objecte que rep el metode es una instancia de la nostre clase
        if(obj instanceof Month){
            
            /*Necesitarem accedir als atributs de la clase, per tant, hem de fer
            cast del objecte per que sigui de tipo Restaurant*/
            Month comprobarMonth = (Month) obj;
            
            if (this.name.equals(comprobarMonth.name)) {
                
                sonIguales = true;
                
            } else {
                
                sonIguales = false;
            }
            
        }
        
        return sonIguales;
        
    }

    
    
    
    
    
    @Override
    public String toString() {
        return "Month{" + "name=" + name + '}';
    }
    
    
    
}
