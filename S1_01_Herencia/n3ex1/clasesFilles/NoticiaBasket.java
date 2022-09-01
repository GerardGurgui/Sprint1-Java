package S1_Herencia_Polimorfismo.n3ex1.clasesFilles;

import S1_Herencia_Polimorfismo.n3ex1.clases.NoticiaEsportiva;

import java.util.Scanner;

public class NoticiaBasket extends NoticiaEsportiva{

    private String competicio;
    private String club;

    public NoticiaBasket(){

    }

    public NoticiaBasket(String titular, String text, int puntuacio, double preu, String competicio, String club) {
        super(titular, text, puntuacio, preu);
        this.competicio = competicio;
        this.club = club;
    }

    /////////

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

   ////METODES CLASE PARE


    @Override
    public double calcularPreuNoticia() {

        double preu = 250;

        if (competicio.equals("eurolliga")){

            preu += 50;
        }

        if (club.equals("barça") || club.equals("madrid")){

            preu += 100;
        }

        return preu;
    }

    @Override
    public int calcularPuntuacio() {

        int puntuacio = 4;

        if (competicio.equals("eurolliga")){

            puntuacio += 3;

        } else if (competicio.equals("ACB")) {

            puntuacio += 2;
        }

        if (club.equals("barça") || club.equals("madrid")){

            puntuacio += 1;
        }

        return puntuacio;
    }

    ///METODE FACTORY

    @Override
    public NoticiaEsportiva crearNoticia() {

        Scanner input = new Scanner(System.in);

        System.out.println("Titular de la noticia de basket: ");
        String titular = input.nextLine();

        System.out.println("Text: ");
        String text = input.nextLine();

        System.out.println("Puntuacio: ");
        int puntuacio = input.nextInt();

        System.out.println("Preu: ");
        double preu = input.nextDouble();

        System.out.println("Competicio: ");
        String competicio = input.nextLine();

        System.out.println("Club: ");
        String club = input.nextLine();

        NoticiaEsportiva noticiaBasket = new NoticiaBasket(titular,text,puntuacio,preu,competicio,club);

        return noticiaBasket;

    }


    /////////

    @Override
    public String toString() {
        return "Basket{" +
                "competicio='" + competicio + '\'' +
                ", club='" + club + '\'' +
                ", titular='" + titular + '\'' +
                ", text='" + text + '\'' +
                ", puntuacio=" + puntuacio +
                ", preu=" + preu +
                '}';
    }


}
