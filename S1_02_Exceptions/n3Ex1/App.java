package S2_Exceptions.n3Ex1;


import S2_Exceptions.n3Ex1.CustomExceptions.ExcepcioButacaOcupada;
import S2_Exceptions.n3Ex1.CustomExceptions.ExcepcioNomPersona;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws ExcepcioButacaOcupada, ExcepcioNomPersona {

        Cine cine = new Cine();

        menu(cine);

    }

    public static void menu(Cine cine) throws ExcepcioButacaOcupada, ExcepcioNomPersona {

        Scanner input = new Scanner(System.in);

        int opcioUser;

        do {

            System.out.println("Menú principal de la App");
            System.out.println("0- sortir");
            System.out.println("1- Mostrar totes les butaques reservades");
            System.out.println("2- Mostrar butaques reservades per una persona");
            System.out.println("3- Reservar una butaca");
            System.out.println("4- Anular reserva de una butaca");
            System.out.println("5- Anular reservas de una persona");

            opcioUser = input.nextInt();


            switch (opcioUser) {

                case 1:

                    cine.mostrarButaques();

                    break;

                case 2:

                    cine.mostrarButaquesPersona();

                    break;


                case 3:

                    cine.reservarButaca();

                    break;

                case 4:

                    cine.anularReserva();

                    break;

                case 5:

                    cine.anularReservasPersona();

                    break;


            }


        } while (opcioUser != 0);


    }
}
