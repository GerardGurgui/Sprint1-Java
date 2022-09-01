package Backend.Sprint1.S1_01.n3ex1;

public class Basket extends Esport implements IcalcularPuntuacio {
    
    private String competicio;
    private String club;
    

    public Basket() {
        
        super();
    }

    public Basket(String competicio, String club, String titular, String text, int puntuacio, double preu) {
        super(titular, text, puntuacio, preu);
        this.competicio = competicio;
        this.club = club;
    }

    
    public String getCompeticio() {
        return competicio;
    }

    public void setCompeticio(String competicio) {
        this.competicio = competicio;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }
    
    //METODES IMPLEMENTATS (ABSTRACTE CLASE PARE I INTERFACE, ELS 2 PODRIAN SER INTERFACE)
    
    @Override
    public double calcularPreuNoticia(){
        
        double preu = 250;
        
        if (competicio.equals("Eurolliga")) {
            
            preu += 75;
            
            
        }  else if (club.equals("Barça") || club.equals("Madrid")) {
            
            preu += 75;
        }
        
       
        
        return preu;
    }
    
    
     @Override
    public int calcularPuntuacio(){
        
        int puntuacio = 4;
        
         if (competicio.equals("Eurolliga")) {
             
             puntuacio += 3;
             
         } else if (competicio.equals("Acb")) {
             
             puntuacio += 2;
             
         }
        
        
        return puntuacio;
        
    }
    

    @Override
    public String toString() {
        return "Basket{" + "competicio=" + competicio + ", club=" + club + '}';
    } 
    
    
}
