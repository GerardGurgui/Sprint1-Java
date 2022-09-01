package Backend.Sprint1.S1_02_Exceptions.n2exercici1;




public class App {
    
    public static void main(String[] args){
        
        
        //METODES-InputMismatchException
            //llegirByte
        byte valorByte = Entrada.llegirByte("Introdueixi un número byte");
        System.out.println("Valor del byte " +valorByte);
        
            //llegirInt
        int valorInt = Entrada.llegirInt("Introdueixi un número enter");
        System.out.println("valor de int " +valorInt);
        
            //llegirFloat
        float valorFloat = Entrada.llegirFloat("Introdueixi un número flotant");
        System.out.println("valor de float " +valorFloat);
       
            //llegirDouble
        double valorDouble = Entrada.llegirDouble("Introdueixi un número decimal");
        System.out.println("Valor de double " +valorDouble);
        
        

        //METODES-Exception
            //llegirChar
        char valorChar = Entrada.llegirChar("Introdueixi un sol cáracter");
        System.out.println("Valor del carácter " +valorChar);
            
            //llegirString
        
        String valorString = Entrada.llegirString("Introdueixi una cadena de carácters");
        System.out.println("Valor de la cadena " +valorString);
            
            //llegirBoolean
        
        boolean valorBoolean = Entrada.llegirSiNo("Introdueixi S (true) o N (false)");
        System.out.println("Valor de boolean " +valorBoolean);
            
    }
    
    
}
    