package S1_Herencia_Polimorfismo.n3ex1.main;

import S1_Herencia_Polimorfismo.n3ex1.clases.DeptRedaccio;
import S1_Herencia_Polimorfismo.n3ex1.clases.NoticiaEsportiva;
import S1_Herencia_Polimorfismo.n3ex1.clases.Redactor;
import S1_Herencia_Polimorfismo.n3ex1.clasesFilles.NoticiaBasket;
import S1_Herencia_Polimorfismo.n3ex1.clasesFilles.NoticiaFutbol;
import S1_Herencia_Polimorfismo.n3ex1.clasesFilles.NoticiaTenis;
import S1_Herencia_Polimorfismo.n3ex1.factory.FabricaNoticias;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class App {

    public static void main(String[] args) {

        List<DeptRedaccio> listaDepts = new ArrayList<>();

        crearDeptRedaccio(listaDepts);

        Redactor redactor1 = new Redactor("100", "Gerard", "futbol");
        Redactor redactor2 = new Redactor("200", "Joan", "futbol");
        Redactor redactor3 = new Redactor("300", "Pep", "futbol");
        Redactor redactor4 = new Redactor("400", "lalu", "basket");
        Redactor redactor5 = new Redactor("500", "souls", "basket");
        Redactor redactor6 = new Redactor("600", "elden", "tenis");

        listaDepts.get(0).getLlistaRedactors().add(redactor1);
        listaDepts.get(0).getLlistaRedactors().add(redactor2);
        listaDepts.get(0).getLlistaRedactors().add(redactor3);

        listaDepts.get(1).getLlistaRedactors().add(redactor4);
        listaDepts.get(1).getLlistaRedactors().add(redactor5);

        listaDepts.get(2).getLlistaRedactors().add(redactor6);

        introducirRedactorDept(listaDepts, redactor1);
        introducirRedactorDept(listaDepts, redactor2);
        introducirRedactorDept(listaDepts, redactor3);
        introducirRedactorDept(listaDepts, redactor4);
        introducirRedactorDept(listaDepts, redactor5);
        introducirRedactorDept(listaDepts, redactor6);

        menu(listaDepts);
    }


    public static void menu(List<DeptRedaccio> listaDepartamentos) {

        int opcioUser;
        int id;
        int posicionDept;
        int posicionDni;
        String dni;

        NoticiaEsportiva noticiaEsportiva;
        Redactor redactor;


        do {

            System.out.println("0- sortir del programa");
            System.out.println("1- crear redactor y asignar a departamento");
            System.out.println("2- crear notícia para un redactor");
            System.out.println("3- eliminar noticia (dni redactor i titular noticia)");
            System.out.println("4- eliminar redactor");
            System.out.println("5- mostrar totes les noticies de un redactor");
            System.out.println("6- calcular puntuació d'una noticia");
            System.out.println("7- calcular preu noticia");
            System.out.println("8- comprobar departamentos y redactores");
            System.out.println("9- buscar redactor en departamento");
            System.out.println("10- guardar listas departamentos y redactores en un fichero");

            opcioUser = pedirEntero("Introdueixi una de les seguents opcions");

            switch (opcioUser) {

                case 1:

                    System.out.println("opción 1- crear redactor y asignar a departamento");

                    redactor = CrearRedactor();

                    introducirRedactorDept(listaDepartamentos, redactor);


                    break;


                case 2:

                    System.out.println("opción 2- crear noticia para un redactor");

                    noticiaEsportiva = crearNoticia();

                    System.out.println("Asignar notícia a un redactor: " +
                            "introduzca un id de departamento que corresponda con el deporte de la notícia");

                    posicionDni = recibePosicionRedactorSiExiste(listaDepartamentos);

                    if (posicionDni != -1) {

                        asignarNoticiaRedactor(listaDepartamentos, noticiaEsportiva, posicionDni);

                    }


                    break;

                case 3:


                    break;

                case 4:

                    System.out.println("opción 4- eliminar redactor");

                    id = pedirEntero("introduzca el id del departamento donde trabaja");

                    posicionDept = buscarDept(listaDepartamentos, id);

                    if (posicionDept != -1) {

                        dni = pedirTexto("introduzca el dni del redactor");

                        posicionDni = listaDepartamentos.get(posicionDept).buscarRedactor(dni);
                        listaDepartamentos.get(posicionDept).eliminarRedactor(posicionDni);

                    }


                    break;

                case 5:

                    System.out.println("mostrar todas las notícias de un redactor");


                    break;

                case 6:

                    System.out.println();

                    break;


                case 7:

                    System.out.println("Opción 7- calcular precio de una noticia");

                    System.out.println("Buscador de noticias");
                    id = pedirEntero("introduzca el id del departamento");

                    posicionDept = buscarDept(listaDepartamentos, id);

                    if (posicionDept != -1) {

                        dni = pedirTexto("introduzca el dni del redactor");

                        posicionDni = listaDepartamentos.get(posicionDept).buscarRedactor(dni);

                        if (posicionDni != -1) {

                            noticiaEsportiva = listaDepartamentos.get(posicionDept)
                                    .getLlistaRedactors().get(posicionDni)
                                    .getLlistaNoticies().get(0);

                            double preu = noticiaEsportiva.calcularPreuNoticia();

                            System.out.println("Preu de la noticia: " + preu);

                        }

                    }

                    break;


                case 8:

                    System.out.println("Opción 8- mostrar departamentos y redactores");

                    comprobarDeptsYredactores(listaDepartamentos);

                    break;


                case 9:

                    System.out.println("opción 9- buscar redactor en departamento");

                    posicionDni = recibePosicionRedactorSiExiste(listaDepartamentos);

                    break;

                case 10:

                    System.out.println("Opción 10- Guardar datos en fichero");

                    guardarDatosFichero(listaDepartamentos);

                    break;


            }


        } while (opcioUser != 0);


    }


    /////FUNCIONALITATS APP

    public static void crearDeptRedaccio(List<DeptRedaccio> llistaDepartaments) {


        DeptRedaccio departamentRedaccioF = new DeptRedaccio("Futbol maniacos", "futbol", 0);
        DeptRedaccio departamentRedaccioB = new DeptRedaccio("Basket maniacos", "basket", 1);
        DeptRedaccio departamentRedaccioT = new DeptRedaccio("Tenis maniacos", "tenis", 2);

        llistaDepartaments.add(departamentRedaccioF);
        llistaDepartaments.add(departamentRedaccioB);
        llistaDepartaments.add(departamentRedaccioT);

    }


    public static Redactor CrearRedactor() {


        String dni = pedirTexto("Introduzca el dni");
        String nom = pedirTexto("Introdueixi el nom");
        String sector = pedirTexto("Introdueixi el sector que es dedica");

        Redactor redactor = new Redactor(dni, nom, sector);


        return redactor;

    }


    public static void introducirRedactorDept(List<DeptRedaccio> llistaDepartaments, Redactor redactor) {

        int i = 0;
        boolean encontrado = false;


        while (i < llistaDepartaments.size() && !encontrado) {

            if (redactor.getSector().equals("futbol") && llistaDepartaments.get(i).getSector().equalsIgnoreCase("futbol")) {

                llistaDepartaments.get(i).getLlistaRedactors().add(redactor);
                encontrado = true;
                System.out.println("Redactor asignado al departamento de 'Futbol maniacos'");

            } else if (redactor.getSector().equals("basket") && llistaDepartaments.get(i).getSector().equalsIgnoreCase("basket")) {

                llistaDepartaments.get(i).getLlistaRedactors().add(redactor);
                encontrado = true;
                System.out.println("Redactor asignado al departamento de 'Basket maniacos'");

            } else if (redactor.getSector().equals("tenis") && llistaDepartaments.get(i).getSector().equalsIgnoreCase("tenis")) {

                llistaDepartaments.get(i).getLlistaRedactors().add(redactor);
                encontrado = true;
                System.out.println("Redactor asignado al departamento de 'Tenis maniacos'");
            }

            i++;
        }

        if (!encontrado) {

            System.out.println("No existe el departamento");

        }

    }


    public static NoticiaEsportiva crearNoticia() {


        NoticiaEsportiva noticiaEsportiva;
        NoticiaEsportiva noticiaEsportivaReturn = null;
        FabricaNoticias fabricaNoticias;

        System.out.println("crear noticia de futbol");
        System.out.println("crear noticia de basket");
        System.out.println("crear noticia de tenis");

        String tipoNoticia = pedirTexto("");

        switch (tipoNoticia) {


            case "futbol":

            case "basket":

            case "tenis":

                fabricaNoticias = new FabricaNoticias(tipoNoticia);
                noticiaEsportiva = fabricaNoticias.crearTipoNoticia();

                noticiaEsportivaReturn = noticiaEsportiva.crearNoticia();

                System.out.println(noticiaEsportivaReturn);

                break;


        }

        return noticiaEsportivaReturn;

    }


    public static void asignarNoticiaRedactor(List<DeptRedaccio> llistaDepartaments, NoticiaEsportiva noticiaEsportiva, int posicionDni) {


        if (noticiaEsportiva instanceof NoticiaFutbol) {

            llistaDepartaments.get(0).getLlistaRedactors().get(posicionDni).getLlistaNoticies().add(noticiaEsportiva);
            System.out.println("Noticia de futbol asignada al redactor");

        } else if (noticiaEsportiva instanceof NoticiaBasket) {

            llistaDepartaments.get(1).getLlistaRedactors().get(posicionDni).getLlistaNoticies().add(noticiaEsportiva);
            System.out.println("Noticia de basket asignada al redactor");

        } else if (noticiaEsportiva instanceof NoticiaTenis) {

            llistaDepartaments.get(2).getLlistaRedactors().get(posicionDni).getLlistaNoticies().add(noticiaEsportiva);
            System.out.println("noticia de tenis asignada al redactor");
        }

    }


//////// Busquedas

    public static int buscarDept(List<DeptRedaccio> llistaDepartaments, int id) {

        int i = 0;
        int posicion = -1;
        boolean encontrado = false;

        while (i < llistaDepartaments.size() && !encontrado) {

            if (llistaDepartaments.get(i).getId() == id) {

                posicion = i;
                encontrado = true;
                System.out.println("Departamento con id " + id + " encontrado");

            }

            i++;
        }

        if (posicion == -1) {

            System.out.println("El departamento no existe");

        }

        return posicion;

    }


    public static int recibePosicionRedactorSiExiste(List<DeptRedaccio> llistaDepartamentos) {


        int id;
        int posicionDept;
        int posicionRedactor = 0;
        String dni;

        id = pedirEntero("introduzca el id del departamento donde trabaja");

        posicionDept = buscarDept(llistaDepartamentos, id);

        if (posicionDept != -1) {

            dni = pedirTexto("introduzca el dni del redactor");

            posicionRedactor = llistaDepartamentos.get(posicionDept).buscarRedactor(dni);

        } else {

            System.out.println("El redactor no trabaja en este departamento o no existe");
        }

        return posicionRedactor;
    }


    public static void comprobarDeptsYredactores(List<DeptRedaccio> llistaDepartaments) {


        for (int i = 0; i < llistaDepartaments.size(); i++) {

            System.out.println(" ");
            System.out.println("Departament: ");
            System.out.println(llistaDepartaments.get(i).toString());
            System.out.println("Redactors: ");

            for (int j = 0; j < llistaDepartaments.get(i).getLlistaRedactors().size(); j++) {

                System.out.println(llistaDepartaments.get(i).getLlistaRedactors().get(j).toString());

            }


        }

    }

    public static void guardarDatosFichero(List<DeptRedaccio> llistaDepartaments) {

        PrintWriter pw = null;

        try {

            pw = new PrintWriter("C:\\Users\\gerri\\OneDrive\\Escritorio\\DepartamentosRedaccion.csv", "UTF-8");

            for (int i = 0; i < llistaDepartaments.size(); i++) {

                pw.println(" ");
                pw.println(llistaDepartaments.get(i).toString());

                for (int j = 0; j < llistaDepartaments.get(i).getLlistaRedactors().size(); j++) {

                    pw.println(" -" + llistaDepartaments.get(i).getLlistaRedactors().get(j).toString());

                }

            }


            pw.close();
            System.out.println("Archivo creado correctamente");

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            if (pw != null)

                pw.close();
        }

    }


    //DADES USER

    public static int pedirEntero(String missatge) {

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

