package Backend.Sprint1.S1_07_Anotations.n1Exercici1;




public class TreballadorPresencial extends Treballador{
    
    private static double preuBenzina;
    
    public TreballadorPresencial(String nom, String cognom, double preuHora){
        
        super(nom,cognom,preuHora);
        TreballadorPresencial.preuBenzina = 50;
        
    }

    
    
    @Override
    public double calcularSou(double hores) {
        
        double resultat = super.calcularSou(hores);
        
        return resultat += preuBenzina;
        
    }
    
    ///////NIVELL 1 - EXERCICI 2 ///////
    
    @Deprecated
    @SuppressWarnings("Desfasat") public double souSensePlusBenzina(double hores){
        
        double resultat = super.calcularSou(hores);
        
        return resultat;
        
    }
    
}