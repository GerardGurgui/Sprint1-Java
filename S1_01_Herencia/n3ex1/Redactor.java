package Backend.Sprint1.S1_01.n3ex1;

public class Redactor {
    
    private String nom;
    private final String DNI;
    private static double sou;
    
    
    public Redactor(String nom, String Dni){
        
        this.nom = nom;
        this.DNI = Dni;
        Redactor.sou = 1500;
         
    }

    public String getDNI() {
        return DNI;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public static double getSou() {
        return sou;
    }

    public static void setSou(double sou) {
        Redactor.sou = sou;
    }

    @Override
    public String toString() {
        return "Redactor{" + "nom=" + nom + ", DNI=" + DNI + '}';
    }
    
    
    
    
}
