package Backend.Sprint1.S1_02_Exceptions.n1exercici1;

/*
Creem la classe que será el error personalitzat, hereda de la clase Exception
constructor buit i constructor amb misatge, important cridar al constructor de la clase pare amb super
*/

public class VendaBuidaException extends Exception {
    
    
    
    public VendaBuidaException(){
        
    }
    
    public VendaBuidaException(String missatgeError){
        
        super(missatgeError);
        
    }
    
    
}
