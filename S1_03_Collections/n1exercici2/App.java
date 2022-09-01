package Backend.Sprint1.S1_03_Collections.n1exercici2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class App {
    
    public static void main(String[] args) {
        
        
        List<Integer> numeros = new ArrayList<>();
        
        
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
        
        
        //2na List
        List<Integer> numerosInversos = new ArrayList<>();
        
        numerosInversos.addAll(numeros);
        
        
        System.out.println("Abans d'invertir el ordre: " +numerosInversos);
        
        //Invertir el ordre de la llista 
        Collections.reverse(numerosInversos);
        
        System.out.println("Despres d'invertir el ordre: " +numerosInversos);
        
        
        //ListIterator per llista 1
        ListIterator list1 = numeros.listIterator();
        
        System.out.println("Print elements llista 1 desde iterator ");
        
        while(list1.hasNext()){
            
            System.out.println(list1.next());
            
        }
        
        
        //ListIterator per Llista 2
        ListIterator list2 = numerosInversos.listIterator();
        
        list2.add(numeros);
        
        
        System.out.println("Print elements llista 2 desde iterator " +numerosInversos);
        
        
    }
    
}