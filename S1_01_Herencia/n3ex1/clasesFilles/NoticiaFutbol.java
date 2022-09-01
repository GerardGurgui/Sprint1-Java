package S1_Herencia_Polimorfismo.n3ex1.clasesFilles;

import S1_Herencia_Polimorfismo.n3ex1.clases.NoticiaEsportiva;

import java.util.Scanner;

public class NoticiaFutbol extends NoticiaEsportiva  {

    private String competicio;
    private String club;
    private String jugador;

    public NoticiaFutbol() {
    }

    public NoticiaFutbol(String titular, String text, int puntuacio, double preu, String competicio, String club, String jugador){
        super(titular,text,puntuacio,preu);
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;

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

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

  /////////

    @Override
    public double calcularPreuNoticia() {

        double preu = 300;

        if (competicio.equalsIgnoreCase("champions")){

            preu += 100;
        }

        if (club.equalsIgnoreCase("barça") || club.equalsIgnoreCase("madrid")){

            preu += 50;

        }

        return preu;

    }


    @Override
    public int calcularPuntuacio() {

        int puntuacio = 5;

        if (competicio.equalsIgnoreCase("champions")){
            puntuacio += 3;

        } else if (competicio.equalsIgnoreCase("lliga")) {
            puntuacio += 2;

        } else {
            puntuacio += 1;
        }

        if (club.equals("barça") || club.equals("madrid")){

            puntuacio += 2;
        }

        return puntuacio;
    }


    ///METODE FACTORY

    @Override
    public NoticiaEsportiva crearNoticia() {

        Scanner input = new Scanner(System.in);

        System.out.println("Titular de la noticia de fútbol: ");
        String titular = input.nextLine();

        System.out.println("Text: ");
        String text = input.nextLine();

        System.out.println("Puntuacio: ");
        int puntuacio = input.nextInt();

        System.out.println("Preu: ");
        double preu = input.nextDouble();

        System.out.println("Competicio: ");
        input.nextLine();
        String competicio = input.nextLine();

        System.out.println("Club: ");
        String club = input.nextLine();

        System.out.println("Jugador: ");
        String jugador = input.nextLine();

        NoticiaEsportiva noticiaFutbol = new NoticiaFutbol(titular,text,puntuacio,preu,competicio,club,jugador);

        return noticiaFutbol;

    }


    /////////

    @Override
    public String toString() {
        return "NoticiaFutbol{" +
                "competicio='" + competicio + '\'' +
                ", club='" + club + '\'' +
                ", jugador='" + jugador + '\'' +
                ", titular='" + titular + '\'' +
                ", text='" + text + '\'' +
                ", puntuacio=" + puntuacio +
                ", preu=" + preu +
                '}';
    }

}
