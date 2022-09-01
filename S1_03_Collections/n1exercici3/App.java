package Backend.Sprint1.S1_03_Collections.n1exercici3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;


public class App {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        
        Map <String, String> textFitxerLlista = new HashMap<>();
    
    
        ////////PART 1 LLEGIR I MOSTRAR FITXER, GUARDAR A HASHMAP

        lecturaGuardarFitxer(textFitxerLlista);
        
        mostrarLlista(textFitxerLlista);

        //////////////////////
        //PART 2 - NOM USUARI I CONVERSIO
        
        String nom = demanarString("Introdueixi el seu nom ");
       
        
           /////////////
        //CONVERSIOOO
        //Obtenim els keys (paisos) amb keySet
        Set<String> paisosSet = textFitxerLlista.keySet();
        
        //Creem arrayList amb aquets paisos
        ArrayList<String> llistaPaisos = new ArrayList<>(paisosSet);
        
        //Obtenim els values (capitals) amb value (PRIMER A COLLECTION) 
        Collection<String> capitalsSet = textFitxerLlista.values();
       
        ArrayList<String> llistaCapitals = new ArrayList<>(capitalsSet);
       
       
        /////////  PART 3 -RANDOM I ACERTAR PAIS
        
        int puntuacio;
        int totalPuntuacio = 0;
        String paisRandom;
       
        for (int i = 0; i < 10; i++) {
         
            paisRandom = mostrarPaisRandom(textFitxerLlista);
            puntuacio = endavinarCapital(paisRandom,llistaPaisos,llistaCapitals);
            totalPuntuacio += puntuacio;
                
        }
        
        System.out.println("Puntuació total " +totalPuntuacio);
        
        /////////// PART 4 GUARDAR EN FITXER

        guardarArxiu(nom,totalPuntuacio);
        
          
    
    }
    
    
    ///////METODES
        //PART 1- LECTURA FITXER I MOSTRAR HAHSMAP 
    
    
    static void lecturaGuardarFitxer(Map <String, String> textFitxerLlista){
        
        //LECTURA DEL FITXER
        File archivo;
        FileReader fr = null;
        BufferedReader br;
        String textoFichero;
        String paisos;
        String capitals;
        StringTokenizer siguiente;
        
        try {
            
          //archivo = new File("C:\\Users\\formacio\\Desktop\\Gerard\\Sprint1\\S01.03_Collections\\N1Exercici3\\countries.txt");   
            archivo = new File("C:\\Users\\gerri\\OneDrive\\Escritorio\\countries.txt");   
            fr = new FileReader(archivo); 
            br = new BufferedReader(fr); // Creem un BfReader per poder llegir líneas completas 

            while ((textoFichero = br.readLine()) != null) {

               siguiente = new StringTokenizer(textoFichero); 

                if (siguiente.hasMoreTokens()) {

                   paisos = siguiente.nextToken();
                   capitals = siguiente.nextToken();

                   textFitxerLlista.put(paisos, capitals);

                }
           }
            
               
        } catch (FileNotFoundException e) {  //Obrir arxius i llegir-los pot donar errors no controlats, els hem de controlar amb try catch
           
            System.out.println("No existeix el fitxer");
            
            
        }catch (IOException e2) {
           
            System.out.println("Error de entrada / sortida");
           
        }
        finally{    //Introduim un finally que s'executará si o si, per que volem tancar el arxiu després d'utilitzar-lo
            
            try {
                
                if (null != fr) {
                    
                    fr.close();
                }
                
            } catch (Exception e2) {
                
                e2.printStackTrace();
            }
        } 
        
      
    }
    
    
    static void mostrarLlista(Map<String, String> textFitxerLlista){
        
         
            System.out.println("-----------PAISOS------------");
            
            for (String paisos : textFitxerLlista.keySet()) {
                
                System.out.println(paisos);
            }
            
            
            System.out.println("-----------CAPITALS----------");
            
            for (String capitals : textFitxerLlista.values()) {
                
                System.out.println(capitals);
            }
            
    }
    
    
    
    /////////////
        //PART 2-NOM USUARI I CONVERSIO
    
    static String demanarString(String missatge){
        
        Scanner input = new Scanner(System.in);
        
        String cadena = "";
        boolean capturaError = false;
        
        do {            
            
            try {
                
                System.out.println(missatge);
                cadena = input.nextLine();   
                capturaError = true;
                
            }catch (Exception e) {
                
                System.out.println("Error de format, has d'introduir un cadena de caracters");
                
            }
            
        } while (!capturaError);
        
       return cadena;
        
    }
    
    
    
  
    
    
    ////////PART 3 - PAIS RANDOM I ACERTAR
    
    static String mostrarPaisRandom(Map<String, String>textFitxerLlista){
        
      Random random = new Random();
      
      Object[] paisos = textFitxerLlista.keySet().toArray(); 
      String paisRandom = (String) paisos[random.nextInt(paisos.length)];
      
      return paisRandom;
        
    }
    
    
    static int endavinarCapital(String paisRandom, ArrayList<String> llistaPaisos, ArrayList<String> llistaCapitals){
        
        
        String capital = demanarString("Quina és la capital de " +paisRandom+ " ?");
        
        int puntuacio = 0;
        boolean encontrado = false;
        int i = 0;
        
        
            
            if (llistaPaisos.get(i).equals(paisRandom) && llistaCapitals.get(i).equals(capital)) {
                
                puntuacio += 1;
                System.out.println("Resposta correcte");
                encontrado = true;

            } else if(llistaPaisos.get(i).equals(paisRandom) != llistaCapitals.get(i).equals(capital)){
                
                System.out.println("Resposta incorrecte, La capital és " +llistaCapitals.get(i));
            
            }
        
        
        return puntuacio;
        
    }
    
    
    static void guardarArxiu(String nom, int totalPuntuacio){
        
          PrintWriter pw = null;
        
        try {
            
            pw = new PrintWriter("C:\\Users\\gerri\\OneDrive\\Escritorio\\puntuacio.txt", "UTF-8");
            pw.println(nom);
            pw.println(totalPuntuacio);
            pw.close();
            System.out.println("Arxiu creat correctament");
            
        } catch (FileNotFoundException e) {
            
            System.out.println("No existeix el fitxer");
            
        }catch(IOException e2){
            
            System.out.println("Error de Entrada/Sortida");
            
        }finally{
            
            if (pw != null) {
                
                pw.close();
            }
        }
          
    }
    

}
    
    

