package Backend.Sprint1.S1_08_Lambdas.n2Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    
    public static void main(String[] args) {
        
        
        List<Persona> llistaNoms = new ArrayList<>();
        
        /////
        agregarPersonas(llistaNoms);
        
        ////Lambda
        List<Persona> llistaFiltrada = filtrarLlista(llistaNoms);
        
        llistaFiltrada.forEach(m-> System.out.println(m));
    }
    
    
    
    ////METODES
    static void agregarPersonas(List<Persona> llistaNoms){
        
        llistaNoms.add(new Persona("Alf"));
        llistaNoms.add(new Persona("Marta"));
        llistaNoms.add(new Persona("Albert"));
        llistaNoms.add(new Persona("Ana"));
        llistaNoms.add(new Persona("Pol"));
        llistaNoms.add(new Persona("Laura"));
    }
    
   
    
    static List<Persona> filtrarLlista(List<Persona>llistaNoms){
        
        
        List<Persona> llistaFiltrada = llistaNoms.stream()  //dins charAt no cal indircar posició, ja s'encarrega la lambda
                                                 .filter(i-> i.getNom().charAt(0) == 'A'
                                                  && i.getNom().length() == 3)   
                                                 .collect(Collectors.toList());
        
        return llistaFiltrada;
        
    }
    
}
