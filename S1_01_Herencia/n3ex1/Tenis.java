package Backend.Sprint1.S1_01.n3ex1;

public class Tenis extends Esport implements IcalcularPuntuacio{
    
    
    private String competicio;
    private String tenistes;
    
    public Tenis(){
        
        super();
    }
    

    public Tenis(String competicio, String tenistes, String titular, String text, int puntuacio, double preu) {
        super(titular, text, puntuacio, preu);
        this.competicio = competicio;
        this.tenistes = tenistes;
    }

    public String getCompeticio() {
        return competicio;
    }

    public void setCompeticio(String competicio) {
        this.competicio = competicio;
    }

    public String getTenistes() {
        return tenistes;
    }

    public void setTenistes(String tenistes) {
        this.tenistes = tenistes;
    }

    //METODES IMPLEMENTATS (ABSTRACTE CLASE PARE I INTERFACE, ELS 2 PODRIAN SER INTERFACE)
    
     @Override
    public double calcularPreuNoticia(){
        
        double preu = 150;
        
         if (tenistes.equals("Federer") || tenistes.equals("Nadal")) {
             
             preu += 100;
         }
        
         return preu;
    }
    
    
    @Override
    public int calcularPuntuacio(){
        
        int puntuacio = 4;
        
        if (tenistes.equals("Federer") || tenistes.equals("Nadal")) {
             
             puntuacio += 3;
         }
        
        return puntuacio;
        
    }
    
    
    
    
    
    @Override
    public String toString() {
        return "Tenis{" + "competicio=" + competicio + ", tenistes=" + tenistes + '}';
    } 
    
    
}
