package Backend.Sprint1.S1_08_Lambdas.n2Ex1;



public class Persona {
    
    
    private String nom;
    
    
    public Persona(String nom){
        
        this.nom = nom;
        
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    

    @Override
    public String toString() {
        return "Persona{" + "nom=" + nom + '}';
    }
    
}
