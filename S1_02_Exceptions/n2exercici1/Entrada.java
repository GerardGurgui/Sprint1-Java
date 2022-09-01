package Backend.Sprint1.S1_02_Exceptions.n2exercici1;



import java.util.InputMismatchException;
import java.util.Scanner;


public class Entrada {
    
    static Scanner input = new Scanner(System.in);
    
    //METODES-InputMismatchException:
        //BYTE
    
    public static byte llegirByte(String missatge){
        
        byte valor = 0;
        boolean encontrado = false;
        
        do {            
            
            try {
                
                System.out.println(missatge);
                valor = input.nextByte();
                encontrado = true;
                
            } catch (InputMismatchException e) {
                
                System.out.println("Error de format, has d'introduir un número byte");
            }
            
           input.nextLine();
              
        } while (encontrado == false);
        
        return valor;
        
    }
    
    
        //INT
    
    public static int llegirInt(String missatge){
        
        int valor = 0;
        boolean capturaError = false;
        
        do {            
            
            try {
                
                System.out.println(missatge);
                valor = input.nextInt();
                capturaError = true;
                
            } catch (InputMismatchException e) {
                
                System.out.println("Error de format, has d'introduir un número enter");
                
            }
            
            input.nextLine();
              
        } while (capturaError == false);
        
        return valor;
        
    }
    
    
    
        //FLOAT
    
    public static float llegirFloat(String missatge) {
        
        float valor = 0;
        boolean capturaError = false;
        
        do {            
            
            try {
                
                System.out.println(missatge);
                valor = input.nextFloat();
                capturaError = true;
                
            } catch (InputMismatchException e) {
                
                System.out.println("Error de format, has d'introduir un número amb coma (flotant)");
                
            }
            
            input.nextLine();
              
        } while (capturaError == false);
        
        return valor;
        
    }
    
    
    
        //DOUBLE

    public static double llegirDouble(String missatge){

        
        double valor = 0;
        boolean capturaError = false;
        
        do {            
            
            try {
                
                System.out.println(missatge);
                valor =  input.nextDouble();
                capturaError = true;
                
                
            } catch (InputMismatchException e) {
                
                System.out.println("Error de format, has d'introduir un número decimal"); 
                
            }
            
            input.nextLine();
              
        } while (capturaError == false);
        
        return valor;
        
    }
    
    
    
    
    //METODES-Exception
        //Char
    
    public static char llegirChar(String missatge){
        
        
        char caracter = ' ';
        boolean capturaError = false;
        
        do {            
            
            try {
                
                System.out.println(missatge);
                caracter = input.next().charAt(0); 
                capturaError = true;

                   
            }catch (Exception e) {
                
                System.out.println("Error de format, has d'introduir un sol caracter");
                
            }
            
            input.nextLine(); 
            
        } while (capturaError == false);
        
       return caracter;
        
    }
    
    
        //String
    
    public static String llegirString(String missatge){

        
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
            
            input.nextLine();
            
        } while (!capturaError);
        
       return cadena;
        
    }
    
        //Boolean
    
    public static boolean llegirSiNo(String missatge){
        
        String lletra = "";
        boolean retorno = false;
        boolean capturaError = false;
        
        do {            
            
            try {
                
                System.out.println(missatge);
                lletra = input.nextLine();
                capturaError = true;
                
                if (lletra.equals("s") || lletra.equals("S")) {
                    
                    retorno = true;
                    
                } else if (lletra.equals("n") || lletra.equals("N")){
                    
                    retorno = false;
                }
                
            } catch (Exception e) {
                
                System.out.println("Dada incorrecte, has d'introduir o S o N");
                
            }
            
            input.nextLine();
            
        } while (capturaError == true);
        
        
         return retorno;
        
      
    }
    
    
}