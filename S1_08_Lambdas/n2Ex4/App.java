package Backend.Sprint1.S1_08_Lambdas.n2Ex4;


import java.util.List;


public class App {
    
    public static void main(String[] args) {
        
        N2ex4 n2ex4 = new N2ex4();
        
        
        //AFEGIR A LLISTA
        n2ex4.afegir();
        
        //ORDENAR ALFABETICAMENT
        System.out.println("-----ALFABETICAMENT-----");
        
        List<String> llistaOrdenada = n2ex4.ordenarAlfabet();
        llistaOrdenada.forEach(n-> System.out.println(n));
        
        
        //ORDENAR PER PRIMER CARACTER
        System.out.println("-----PRIMER CARACTER-----");
        
        List<String> llistaFiltrada = n2ex4.filtrarPrimerCaracter();
        llistaFiltrada.forEach(n-> System.out.println(n));
        
        //REEMPLAZAR CARACTER
        System.out.println("-----REEMPLAZAR CARACTER------");
        
        List<String> llistaReemplazada = n2ex4.reemplazarCaracters();
        llistaReemplazada.forEach(n->System.out.println(n));
        
        
        //MOSTRAR NOMÉS NÚMEROS
        System.out.println("----LLISTA NÚMERICA------");
        
        List<String> llistaNumerica = n2ex4.filtrarNumeros();
        llistaNumerica.forEach(n->System.out.println(n));
        
        
        
    }
    
    
}