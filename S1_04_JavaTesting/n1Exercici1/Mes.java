package Backend.Sprint1.S1_04_JavaTesting.n1Exercici1;

import java.util.ArrayList;


public class Mes {
    
    
    private ArrayList<String> mesosTest;
    
    
    public Mes(){
        
        mesosTest = new ArrayList<>();
        
    }
    
    
    ///////////GETTERS SETTERS

    public ArrayList<String> getMesosTest() {
        return mesosTest;
    }

    public void setMesosTest(ArrayList<String> mesosTest) {
        this.mesosTest = mesosTest;
    }
    
    
    
    ///////////METODES CLASE
    
    public void afegirMesos(){
        
       mesosTest.add("Gener");
       mesosTest.add("Febrer");
       mesosTest.add("Març");
       mesosTest.add("Abril");
       mesosTest.add("Maig");
       mesosTest.add("Juny");
       mesosTest.add("Juliol");
       mesosTest.add("Agost");
       mesosTest.add("Setembre");
       mesosTest.add("Octubre");
       mesosTest.add("Novembre");
       mesosTest.add("Decembre");
        
       
    }
    
    
    public int totalMesos(){
        
       int total = mesosTest.size();
       
       return total;
        
    }

    
    public boolean detectarLlistaBuida() {
        
        boolean llistaBuida = false;
        
         if (mesosTest.isEmpty()) {
            
             llistaBuida = true;
             
        } else {
             
             llistaBuida = false;
         }
     
        return llistaBuida;
    }
    
    
    public int identificarPosicio(String nomBuscar){
       
        boolean encontrado = false;
        int posicio = 0;
        int i = 0;
        
        while (i<mesosTest.size() && encontrado == false) {            
            
            if (mesosTest.get(i).equals(nomBuscar)) {
                
                encontrado = true;
                posicio = i;
            }
            
            i++;
        }
        
       
         return posicio;
    }
    

    @Override
    public String toString() {
        return "Mes{" + "mesosTest=" + mesosTest + '}';
    }
    
    
    
    ////////////
    
    public static void main(String[] args) {
        
        
        Mes mes = new Mes();
        
        
        mes.afegirMesos();
        
        
        int total = mes.totalMesos();
        System.out.println("total mesos " +total);
        
        boolean resultat = mes.detectarLlistaBuida();
        System.out.println("Llista plena = " +resultat);
        
        
        int encontrado = mes.identificarPosicio("Agost");
        System.out.println("el mes d'agost existeix a la llista = " +encontrado);
        
    }
    
    
}