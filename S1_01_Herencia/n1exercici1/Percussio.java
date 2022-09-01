package Backend.Sprint1.S1_01.n1exercici1;

public class Percussio extends Instrument {
    
    
    
       public Percussio(String nom, double preu){
        
        super(nom, preu);
        
    }
       
       
    
    
    @Override
    public void tocar(){
        
        System.out.println("Está sonant un instrument de corda");
        
    }
    
    
}
