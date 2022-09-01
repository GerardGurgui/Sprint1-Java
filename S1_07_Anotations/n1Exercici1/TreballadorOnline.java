package Backend.Sprint1.S1_07_Anotations.n1Exercici1;


public class TreballadorOnline extends Treballador {
    
    
    private final double TARIFA_PLANA;
    
    
    public TreballadorOnline(String nom, String cognom, double preuHora, double TARIFA_PLANA){
        
        super(nom, cognom, preuHora);
        this.TARIFA_PLANA = TARIFA_PLANA;
        
    }

    
    @Override
    public double calcularSou(double hores) {
        
        double resultat = super.calcularSou(hores);
        
        return resultat += TARIFA_PLANA;
    }
    
    
    ///////NIVELL 1 - EXERCICI 2 ///////
    //Metodes deprecated eliminant warnings amb SuppresWarning
    
    @Deprecated
    @SuppressWarnings("Desfasat") public int horasDia(){
        
        int horasDia = 6;
        
        return horasDia;
        
    }
      
    
}