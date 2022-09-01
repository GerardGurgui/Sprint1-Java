package Backend.Sprint1.S1_08_Lambdas.n1Ex3;

import java.util.ArrayList;
import java.util.List;

public class Calendari {
    
    
    private List<String> llistaMesos;
    
    
    ////CONSTRUCTOR
    public Calendari(){
        
        llistaMesos = new ArrayList<>();
        
    }

    
    ////GETTERS SETTERS
    public List<String> getLlistaMesos() {
        return llistaMesos;
    }

    public void setLlistaMesos(List<String> llistaMesos) {
        this.llistaMesos = llistaMesos;
    }
    
    
    
    ////METODES
    public void afegirMesos(){
        
        
        llistaMesos.add("Gener");
        llistaMesos.add("Febrer");
        llistaMesos.add("Març");
        llistaMesos.add("Abril");
        llistaMesos.add("Maig");
        llistaMesos.add("Juny");
        llistaMesos.add("Juliol");
        llistaMesos.add("Agost");
        llistaMesos.add("Setembre");
        llistaMesos.add("Octubre");
        llistaMesos.add("Novembre");
        llistaMesos.add("Decembre");
        
    }
    
}
