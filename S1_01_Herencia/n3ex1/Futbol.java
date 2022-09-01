package Backend.Sprint1.S1_01.n3ex1;

public class Futbol extends Esport implements IcalcularPuntuacio {
    
    private String competicio;
    private String club;
    private String jugador;
    
    public Futbol(){
        
        super();
        
    }

    
    public Futbol(String competicio, String club, String jugador, String titular, String text, int puntuacio, double preu) {
        super(titular, text, puntuacio, preu);
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;
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

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
        
    }

    //METODES IMPLEMENTATS (ABSTRACTE CLASE PARE I INTERFACE, ELS 2 PODRIAN SER INTERFACE)
    
    @Override
    public double calcularPreuNoticia() {
        
        double preu = 300;
        
        if (competicio.equals("Lliga de campions")) {
            
            preu += 100;
            
        }
        
        if(club.equals("Barça") || club.equals("Madrid")){
            
            preu += 100;
        }
        
        if (jugador.equals("Ferran torres") || jugador.equals("Benzema") ) {
            
            preu += 50;
            
        }
        
        
        return preu;
        
    }
    
   
    @Override
    public int calcularPuntuacio(){
        
        int puntuacio = 5;
        
        if (competicio.equals("Lliga de campions")) {
            
            puntuacio += 3;
            
        } else if (competicio.equals("Lliga")) {
            
            puntuacio += 2;
        }
        
        if (club.equals("Barça") || club.equals("Madrid") ) {
            
            puntuacio += 1;
        }
        
        
        return puntuacio;
        
    }
    
    
    
    
    @Override
    public String toString() {
        return "Futbol{" + "competicio=" + competicio + ", club=" + club + ", jugador=" + jugador + '}';
    }

    
    
    
    
    
}
