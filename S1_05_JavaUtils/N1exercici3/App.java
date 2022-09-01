package Backend.Sprint1.S1_05.N1exercici3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    
    
    public static void main(String[] args) {
        
        
        StringBuffer stringBuffer = new StringBuffer();
        
             
        try {
            
            
            File directori = new File("C:\\Users\\gerri\\OneDrive\\Escritorio\\webGrauSupProgramacio");
            File nouArxiu = new File("C:\\Users\\gerri\\OneDrive\\Escritorio\\webGrauSupProgramacio\\resultat.txt");
            FileWriter fileWriter = new FileWriter(nouArxiu);
            
            llistarRecursivamentWrite(directori, stringBuffer);
            
            fileWriter.append(stringBuffer);
            fileWriter.close();      
                
                
        } catch (FileNotFoundException e) {
            
            System.out.println("No existeix el fitxer");
            
        }catch(IOException e2){
            
            System.out.println("Error de entrada/sortida");
            
        }catch(Exception e3){
            
            System.out.println("Error");
        }
        
    }
    
    
    
    static void llistarRecursivamentWrite(File directori, StringBuffer stringBuffer) {
        
        System.out.println("-------D: " +directori.getName()+ "----------");

        File[] arxius = directori.listFiles();
        stringBuffer.append("D ").append(directori).append("\n");
        
        
        for (File llistaArxius : arxius) {
            
            if (llistaArxius.isDirectory()) {
                
                llistarRecursivamentWrite(llistaArxius,stringBuffer);
                stringBuffer.append("D: ").append(llistaArxius.getName()).append("\n");
                
            } else {
                
                stringBuffer.append("F: ").append(" - ").append(llistaArxius.getName()).append("\n");
                
            }
            
        }

    } 
    
}

    

    
    
    
    
    
    
    
    

