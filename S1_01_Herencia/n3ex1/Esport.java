package Backend.Sprint1.S1_01.n3ex1;

public abstract class Esport {
    
    
    protected String titular;
    protected String text;
    protected int puntuacio;
    protected double preu;
    
    
    public Esport(){
        
        
    }
    
    
    public Esport(String titular, String text, int puntuacio, double preu)  {

        this.titular = titular;
        this.text = text;
        this.puntuacio = puntuacio;
        this.preu = preu;
    }

  
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(int puntuacio) {
        this.puntuacio = puntuacio;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }
    
    protected abstract double calcularPreuNoticia();
    
    

    @Override
    public String toString() {
        return "Esport{" + "titular=" + titular + ", text=" + text + ", puntuacio=" + puntuacio + ", preu=" + preu + '}';
    }
  
    
    
  
    
}
