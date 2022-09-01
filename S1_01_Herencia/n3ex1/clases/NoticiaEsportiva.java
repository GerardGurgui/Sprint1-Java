package S1_Herencia_Polimorfismo.n3ex1.clases;


public abstract class NoticiaEsportiva {

    protected String titular;
    protected String text;
    protected int puntuacio;
    protected double preu;

    public NoticiaEsportiva() {
    }

    public NoticiaEsportiva(String titular, String text, int puntuacio, double preu) {
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


    public abstract double calcularPreuNoticia();

    public abstract int calcularPuntuacio();

////METODE FACTORY
    public abstract NoticiaEsportiva crearNoticia();


    @Override
    public String toString() {
        return "NoticiaEsportiva{" +
                "titular='" + titular + '\'' +
                ", text='" + text + '\'' +
                ", puntuacio=" + puntuacio +
                ", preu=" + preu +
                '}';
    }
}
