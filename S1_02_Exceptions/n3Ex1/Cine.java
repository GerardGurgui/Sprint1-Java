package S2_Exceptions.n3Ex1;

import S2_Exceptions.n3Ex1.CustomExceptions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cine {

    private int numeroFiles;
    private int numeroSeientsFila;
    private GestioButaques gestioButaques;

    public Cine() {

        gestioButaques = new GestioButaques();
        demanarDadesInicials();

    }

    ///GETTERS SETTERS

    public int getNumeroFiles() {
        return numeroFiles;
    }

    public void setNumeroFiles(int numeroFiles) {
        this.numeroFiles = numeroFiles;
    }

    public int getNumeroSeientsFila() {
        return numeroSeientsFila;
    }

    public void setNumeroSeientsFila(int numeroSeientsFila) {
        this.numeroSeientsFila = numeroSeientsFila;
    }

    public GestioButaques getGestioButaques() {
        return gestioButaques;
    }

    public void setGestioButaques(GestioButaques gestioButaques) {
        this.gestioButaques = gestioButaques;
    }


    public void demanarDadesInicials() {

        Scanner input = new Scanner(System.in);

        System.out.println("Benvingut a la app del cinema");

        System.out.println("Introdueixi el numero de files");
        numeroFiles = input.nextInt();

        System.out.println("Introdueixi el numero de seients per fila");
        numeroSeientsFila = input.nextInt();

        System.out.println("Dades inicials introduides");


    }


    ////METODES CLASSE

    ////RESERVAS

    public void reservarButaca() throws ExcepcioButacaOcupada {

        boolean dadesIncorrectes;
        int fila = -1;

        do {
            dadesIncorrectes = false;

            try {

                fila = introduirFila();

            } catch (ExcepcioFilaIncorrecta e) {
                System.out.println(e.getMessage());
                dadesIncorrectes = true;
            }

        } while (dadesIncorrectes);


        int seient = -1;

        do {
            dadesIncorrectes = false;

            try {

                seient = introduirSeient();

            } catch (ExcepcioSeientIncorrecte e2) {
                System.out.println(e2.getMessage());
                dadesIncorrectes = true;
            }

        } while (dadesIncorrectes);

        if (gestioButaques.buscarButaca(fila, seient) != -1) {

            throw new ExcepcioButacaOcupada("Aquesta butaca ja está reservada");

        } else {

            Client client = null;

            do {

                dadesIncorrectes = false;

                try {

                    client = introduirPersona();

                } catch (ExcepcioNomPersona e3) {
                    System.out.println(e3.getMessage());
                    dadesIncorrectes = true;

                }

            } while (dadesIncorrectes);

            Butaca butaca = new Butaca(fila, seient, client);

            try {

                gestioButaques.afegirButaca(butaca);
                System.out.println("Butaca de la fila " + fila + " num seient " + seient + " Reservada per " + client.getNom());

            } catch (ExcepcioButacaOcupada e) {

                System.out.println(e.getMessage());
            }


        }


    }

    public void anularReserva() {

        boolean dadesIncorrectes;
        int fila = -1;

        do {
            dadesIncorrectes = false;

            try {

                fila = introduirFila();

            } catch (ExcepcioFilaIncorrecta e) {
                System.out.println(e.getMessage());
                dadesIncorrectes = true;
            }

        } while (dadesIncorrectes);


        int seient = -1;

        do {
            dadesIncorrectes = false;

            try {

                seient = introduirSeient();

            } catch (ExcepcioSeientIncorrecte e2) {
                System.out.println(e2.getMessage());
                dadesIncorrectes = true;
            }

        } while (dadesIncorrectes);

        try {

            gestioButaques.eliminarButaca(fila, seient);

        } catch (ExceptionButacaLlire e) {

            System.out.println(e.getMessage());

        }


    }

    public void anularReservasPersona() throws ExcepcioNomPersona {

        Scanner input = new Scanner(System.in);

        List<String> noms = new ArrayList<>();
        String nom;

        System.out.println("Introdueixi el nom de la persona");
        nom = input.nextLine();

        if (nom.matches(".*\\d.*")) {

            throw new ExcepcioNomPersona("El nom no pot contenir numeros");

        } else {

            noms.add(nom);

        }

        List<Butaca> trobadres = new ArrayList<>(gestioButaques.getLlistaButaques());

        for (int i = 0; i < trobadres.size(); i++) {

            if (trobadres.get(i).getClient().getNom().equalsIgnoreCase(nom)) {

                try {

                    gestioButaques.eliminarButaca(trobadres.get(i).getNumeroFilas(),
                                                  trobadres.get(i).getNombreSeient());

                    System.out.println("Les reservas de " +nom+ " han sigut eliminades");


                } catch (ExceptionButacaLlire e) {

                    System.out.println(e.getMessage());

                }

            }

        }


    }

    ////MOSTRAR

    public void mostrarButaques() {

        for (Butaca llistaButaque : gestioButaques.getLlistaButaques()) {

            System.out.println(llistaButaque);

        }

    }

    public void mostrarButaquesPersona() {

        Scanner input = new Scanner(System.in);

        System.out.println("Introdueixi el nom de la persona per veure les seves butaques");
        String nom = input.nextLine();
        String nomLlista;

        for (Butaca llista : gestioButaques.getLlistaButaques()) {

            nomLlista = llista.getClient().getNom();

            if (nom.equalsIgnoreCase(nomLlista)) {

                System.out.println(llista);
            }

        }

    }

    ////INTRODUIR

    public Client introduirPersona() throws ExcepcioNomPersona {

        Scanner input = new Scanner(System.in);

        System.out.println("Introdueixi el nom de la persona");
        String nom = input.nextLine();

        if (nom.matches(".*\\d.*")) {

            throw new ExcepcioNomPersona("El nom no pot contenir numeros");
        }

        System.out.println("Introdueixi el dni de la persona");
        String dni = input.nextLine();

        System.out.println("Introdueixi la edad de la persona");
        int edad = input.nextInt();

        Client client = new Client(nom, edad, dni);

        return client;

    }


    public int introduirFila() throws ExcepcioFilaIncorrecta {

        Scanner input = new Scanner(System.in);

        System.out.println("Introdueixi el numero de la fila");
        int fila = input.nextInt();

        int novaFila = 0;

        if (fila >= 1 && fila <= numeroFiles) {

            novaFila = fila;

        } else {

            throw new ExcepcioFilaIncorrecta("La fila és incorrecta");

        }

        return novaFila;

    }

    public int introduirSeient() throws ExcepcioSeientIncorrecte {

        Scanner input = new Scanner(System.in);

        System.out.println("Introdueixi el numero de seient");
        int seient = input.nextInt();

        int nouSeient = 0;

        if (seient >= 1 && seient <= numeroSeientsFila) {

            nouSeient = seient;

        } else {

            throw new ExcepcioSeientIncorrecte("El seient és incorrecta");

        }

        return nouSeient;

    }


    @Override
    public String toString() {
        return "Cine{" +
                "numeroFiles=" + numeroFiles +
                ", numeroSeientsFila=" + numeroSeientsFila +
                ", gestioButaques=" + gestioButaques +
                '}';
    }
}
