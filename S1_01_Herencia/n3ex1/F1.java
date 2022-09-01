package Backend.Sprint1.S1_01.n3ex1;

public class F1 extends Esport {
    
    private String escuderia;
    
    public F1(){
        
        super();
    }

    
    public F1(String escuderia, String titular, String text, int puntuacio, double preu) {
        super(titular, text, puntuacio, preu);
        this.escuderia = escuderia;
    }

    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }
    
    //METODES IMPLEMENTATS (ABSTRACTE CLASE PARE I INTERFACE, ELS 2 PODRIAN SER INTERFACE)
    
    @Override
    protected double calcularPreuNoticia(){
        
        double preu = 100;
        
        if (escuderia.equals("Ferrari") || escuderia.equals("Mercedes")) {
            
            preu += 50;
            
        }
        
        return preu;
    }
    

    @Override
    public String toString() {
        return "F1{" + "escuderia=" + escuderia + '}';
    }
    
    
    
    
}
