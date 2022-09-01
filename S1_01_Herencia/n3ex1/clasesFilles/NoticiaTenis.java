package S1_Herencia_Polimorfismo.n3ex1.clasesFilles;

import S1_Herencia_Polimorfismo.n3ex1.clases.NoticiaEsportiva;

import java.util.Scanner;

public class NoticiaTenis extends NoticiaEsportiva{

    private String jugador;

    public NoticiaTenis() {
    }

    public NoticiaTenis(String titular, String text, int puntuacio, double preu, String jugador) {
        super(titular, text, puntuacio, preu);
        this.jugador = jugador;
    }



    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }




    @Override
    public int calcularPuntuacio() {

        int puntuacio = 3;

        if (jugador.equals("gerard")){

            puntuacio += 3;
        }

        return puntuacio;

    }



    @Override
    public double calcularPreuNoticia() {

        double preu = 100;

        if (jugador.equals("gerard")){

            preu += 150;

        }

        return preu;
    }


    ///METODE FACTORY

    @Override
    public NoticiaEsportiva crearNoticia() {

        Scanner input = new Scanner(System.in);

        System.out.println("Titular de la noticia de Tenis: ");
        String titular = input.nextLine();

        System.out.println("Text: ");
        String text = input.nextLine();

        System.out.println("Puntuacio: ");
        int puntuacio = input.nextInt();

        System.out.println("Preu: ");
        double preu = input.nextDouble();

        System.out.println("Jugador: ");
        input.nextLine();
        String jugador = input.nextLine();


        NoticiaEsportiva noticiaTenis = new NoticiaTenis(titular,text,puntuacio,preu,jugador);

        return noticiaTenis;

    }


    @Override
    public String toString() {
        return "NoticiaTenis{" +
                "jugador='" + jugador + '\'' +
                ", titular='" + titular + '\'' +
                ", text='" + text + '\'' +
                ", puntuacio=" + puntuacio +
                ", preu=" + preu +
                '}';
    }
}
