package Backend.Sprint1.S1_01.n1exercici2;

public class Cotxe {

    
    private static final String MARCA = "seat";
    private static String model;
    private final double POTENCIA;
    
    
    
    public Cotxe(String model, double POTENCIA){
        
        
        this.model = "deportivo";
        this.POTENCIA = POTENCIA;
        
    }
    
    
    
    
    public static String getMARCA() {
        return MARCA;
    }
    
    
    public static String getModel() {
        return model;
    }
    

    public double getPOTENCIA() {
        return POTENCIA;
    }

    
    public static void setModel(String model) {
        Cotxe.model = model;
    }
    
   
    
    
    static void frenar(){
        
        System.out.println("El vehicle está frenant");
        
    }
   
    
    void accelerar(){
        
        System.out.println("El vehicle está accelerant");
        
    }

    
    @Override
    public String toString() {
        return "Cotxe{" + "POTENCIA=" + POTENCIA + '}';
    }

    
   
    
    
}
