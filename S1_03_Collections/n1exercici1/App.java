package Backend.Sprint1.S1_03_Collections.n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class App {
    
    public static void main(String[] args) {
        
        
        ArrayList<Month> mesos = new ArrayList<Month>();
        
        Month month1 = new Month("Gener");
        Month month2 = new Month("Febrer");
        Month month3 = new Month("Març");
        Month month4 = new Month("Abril");
        Month month5 = new Month("Maig");
        Month month6 = new Month("Juny");
        Month month7 = new Month("Juliol");
        Month month8 = new Month("Agost");
        Month month9 = new Month("Setembre");
        Month month10 = new Month("Octubre");
        Month month11 = new Month("Novembre");
        Month month12 = new Month("Decembre");
        Month month13 = new Month("Decembre");
        
        
        
        mesos.add(month1);
        mesos.add(month2);
        mesos.add(month3);
        mesos.add(month4);
        mesos.add(month5);
        mesos.add(month6);
        mesos.add(month7);
        mesos.add(month9);
        mesos.add(month10);
        mesos.add(month11);
        mesos.add(month12);
        
        
        
        //Introduim el mes 8 (agost) a la posicio 7 del array
        mesos.add(7, month8);
        
        
        System.out.println(mesos.size());
        
        //Comprobem que el array mante el ordre correcte 
        
        for (int i = 0; i < mesos.size(); i++) {
            
            System.out.println(mesos.get(i).getName());
            
        }
        
        
        System.out.println("-------------------------");
        
        /*convertim d'arrayList a hashset amb el constructor
        Al convertir a hashset, no permet elements duplicats i no ordena els elements
        */
        
       HashSet<Month> mesosSet = new HashSet<>(mesos);
       
       //Podem comprobar que encara que afegin el mateix element 2 vegades nomes imprimeix un

       mesosSet.add(month8);
       mesosSet.add(month8);
       mesosSet.add(month12);
       mesosSet.add(month12);
       mesosSet.add(month13);
       mesosSet.add(month13);
      
       
       
       System.out.println("total mesos despres del hashet " +mesosSet.size()); 
       
       
       
       Iterator iterator = mesosSet.iterator();
     
       
        for (int i = 0; i < mesosSet.size(); i++) {
            
            
            System.out.println(iterator.next().toString());
            
           
        }
        
          
        
    }
    
}
