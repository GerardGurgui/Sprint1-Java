package Backend.Sprint1.S1_07_Anotations.n1Exercici1;


public class Treballador {
    
    protected String nom;
    protected String cognom;
    protected final double PREU_HORA;
    
    
    public Treballador(String nom, String cognom, double PREU_HORA){
        
        this.nom = nom;
        this.cognom = cognom;
        this.PREU_HORA = PREU_HORA;
        
    }
    
    
    ///////GETTERS SETTERS

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }
    
   
    
    //////METODES
    
    public double calcularSou(double hores){
        
        return PREU_HORA * hores;
    }

 
    
    
    @Override
    public String toString() {
        return "Treballador{" + "nom=" + nom + ", cognom=" + cognom + ", PREU_HORA=" + PREU_HORA + '}';
    }
    
}