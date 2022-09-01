package S3_Collections.n3Ex1;

import S3_Collections.n3Ex1.comparadores.CompareDni1_9;
import S3_Collections.n3Ex1.comparadores.CompareDni9_1;
import S3_Collections.n3Ex1.comparadores.CompareNombreAZ;
import S3_Collections.n3Ex1.comparadores.CompareNombreZA;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {


    public static void main(String[] args) {


        menu();


    }

    public static void menu() {
        int opcioUser;
        Persona persona;
        GestionFichero gestionFichero = new GestionFichero();


        do {

            System.out.println("0- Salir");
            System.out.println("1- Introducir persona");
            System.out.println("2- Ordenar por nombre (A-Z)");
            System.out.println("3- Ordenar por nombre (Z-A)");
            System.out.println("4- Ordenar por apellido (A-Z)");
            System.out.println("5- Ordenar por apellido (Z-A)");
            System.out.println("6- Ordenar por DNI (1-9)");
            System.out.println("7- Ordenar por DNI (9-1)");
            System.out.println("8- Mostrar el archivo csv");

            opcioUser = pedirNum("Introduzca una de las opciones");

            switch (opcioUser) {

                case 1:

                    persona = perdirDatosPersona();
                    gestionFichero.introducirPersona(persona);


                    break;

                case 2:

                    ordenarNombreAZ(gestionFichero);

                    break;

                case 3:

                    ordenarNombresZA(gestionFichero);

                    break;

                case 4:


                    break;

                case 5:


                    break;

                case 6:

                    ordenarDni1_9(gestionFichero);

                    break;

                case 7:

                    ordenarDni9_1(gestionFichero);


                    break;

                case 8:

                    List<Persona> lista = gestionFichero.obtenerDatosFichero();
                    mostrarDatosOrdenados(lista);

                    break;



            }


        } while (opcioUser != 0);


    }


    public static Persona perdirDatosPersona() {

        System.out.println("Introduzca los datos del cliente");

        String nombre = pedirTexto("Introduzca el nombre");
        String apellido = pedirTexto("Introduzca el apellido");
        String dni = pedirTexto("Introduzca el dni");

        Persona persona = new Persona(nombre, apellido, dni);

        return persona;

    }

    //METODOS ORDENAR APP

    public static void mostrarDatosOrdenados(List<Persona> lista) {

        System.out.printf("%-10s %-18s \t%-10s %n", "Nom", "Cognom", "DNI");
        System.out.printf("%-10s %-18s \t%-10s %n", "________", "_________", "_________");

        for (Persona p : lista) {
            System.out.printf("%-10s %-18s \t%-10s %n", p.getNombre(), p.getApellido(), p.getDni());
        }


    }

    public static void ordenarNombresZA(GestionFichero gestionFichero){

        List<Persona> lista = gestionFichero.obtenerDatosFichero();

        CompareNombreZA nombreZA = new CompareNombreZA();

        lista.sort(nombreZA);

        mostrarDatosOrdenados(lista);



    }

    public static void ordenarNombreAZ(GestionFichero gestionFichero) {

        List<Persona> lista = gestionFichero.obtenerDatosFichero();

        CompareNombreAZ nombreAZ = new CompareNombreAZ();

        lista.sort(nombreAZ);

        mostrarDatosOrdenados(lista);


    }

    public static void ordenarDni1_9(GestionFichero gestionFichero){

        List<Persona> lista = gestionFichero.obtenerDatosFichero();

        CompareDni1_9 dni1_9 = new CompareDni1_9();

        lista.sort(dni1_9);

        mostrarDatosOrdenados(lista);


    }

    public static void ordenarDni9_1(GestionFichero gestionFichero){

        List<Persona> lista = gestionFichero.obtenerDatosFichero();

        CompareDni9_1 dni9_1 = new CompareDni9_1();

        lista.sort(dni9_1);

        mostrarDatosOrdenados(lista);
    }

    //DATOS USER


    public static int pedirNum(String missatge) {

        Scanner input = new Scanner(System.in);

        int valor = 0;
        boolean capturaError = false;

        do {

            try {

                System.out.println(missatge);
                valor = input.nextInt();
                capturaError = true;

            } catch (InputMismatchException e) {

                System.out.println("Error de format, has d'introduir un número enter");

            }

            input.nextLine();

        } while (!capturaError);

        return valor;

    }

    public static String pedirTexto(String missatge) {

        Scanner input = new Scanner(System.in);

        String cadena = "";


        System.out.println(missatge);
        cadena = input.nextLine();


        return cadena;

    }


}
