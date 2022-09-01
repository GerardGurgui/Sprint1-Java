package Backend.Sprint1_Java.S1_05.N1exercici4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class N1Exercici4 {
    
    public static void main(String[] args) {
     
        
        try {
            
            llistarCualsevolFitxer();

            
        } catch (FileNotFoundException e) {
            
            System.out.println("El fitxer no existeix");
            
        }catch(IOException e2){
            
            System.out.println("Error de entrada/sortida");
            
        }catch(Exception e3){
            
            System.out.println("Error");
        }
        
        
    }
    
    //////EXERCICI 4
    //HEM D'AFEGIR EXCEPCIONS PER SI NO ES TROBA LA RUTA ESPECIFICADA EN AQUEST METODE
    
    static void llistarCualsevolFitxer() throws FileNotFoundException, IOException{
        
        
        Scanner input = new Scanner(System.in);
        
        String llista;
        String directoriUser;
        
        System.out.println("Introdueixi la ruta del fitxer a llegir");
        
        directoriUser = input.nextLine();
        File arxiu = new File(directoriUser);
        FileReader fileReader = new FileReader(arxiu);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        
        
           
            while ((llista = bufferedReader.readLine()) != null) {   
                
                
                System.out.println(llista);
                
            }
          
        //Important tancar el buffer un cop hagi llegit tots els elements
        bufferedReader.close();
    }
    
    
}
