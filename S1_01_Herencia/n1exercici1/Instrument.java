package Backend.Sprint1.S1_01.n1exercici1;

public abstract class Instrument {
    
    protected String nom;
    protected double preu;
    
    
    
    public Instrument(String nom, double preu){
        
        this.nom = nom;
        this.preu = preu;
        
    }

    
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }
    
    
    
    public abstract void tocar();
    
    

    @Override
    public String toString() {
        return "Instrument{" + "nom=" + nom + ", preu=" + preu + '}';
    }
    
}


