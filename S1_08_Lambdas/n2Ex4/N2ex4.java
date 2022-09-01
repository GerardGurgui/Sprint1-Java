package Backend.Sprint1.S1_08_Lambdas.n2Ex4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class N2ex4 {
    
    
    List<String> stringsInumeros;
    
    
    ////CONSTRUCTOR
    public N2ex4(){
    
      stringsInumeros = new ArrayList<>();
        
    }
    
    
    ////GETTERS SETTERS
    public List<String> getStringsInumeros() {
        return stringsInumeros;
    }

    public void setStringsInumeros(List<String> stringsInumeros) {
        this.stringsInumeros = stringsInumeros;
    }
    
    
    
    
    ///METODES
    public void afegir(){
        
        stringsInumeros.add("gerard30");
        stringsInumeros.add("espagueti28");
        stringsInumeros.add("roterdam");        
        stringsInumeros.add("123456789");
        stringsInumeros.add("1991Barcelona");
        stringsInumeros.add("estiu");
        stringsInumeros.add("asturias");
        stringsInumeros.add("estonia");
        
        
    }
    
 
    public List<String> ordenarAlfabet(){
        
        
        List<String> llsitaOrdenada = stringsInumeros.stream()
                                                     .sorted(Comparator.comparing(i -> i.charAt(0)))
                                                     .collect(Collectors.toList());
        
        
        return llsitaOrdenada;
        
    }
    
    public List<String> filtrarPrimerCaracter(){
        
        
       List<String> llistaFiltrada = stringsInumeros.stream()
                                                    .sorted(Comparator.comparing(i-> i.length())) //Primer hem de ordenar per longitud
                                                    .sorted(Comparator.comparing(i-> !i.contains("e"))) //Després ordenar per diferent a E
                                                    .collect(Collectors.toList());
       
       return llistaFiltrada;
        
    }
    
    
    public List<String> reemplazarCaracters(){
        
        
        List<String> llistaRemplazada = stringsInumeros.stream()
                                                          .map(i-> i.replace('a', '4'))
                                                          .collect(Collectors.toList());
        
        
        return llistaRemplazada;
        
    }
    
    
    
    public List<String> filtrarNumeros(){
        
        
        List<String> llistaNumerica = stringsInumeros.stream()
                                                     .filter(i-> i.matches("\\d+"))
                                                     .collect(Collectors.toList());
        
        return llistaNumerica;
        
    }
    
    
}

