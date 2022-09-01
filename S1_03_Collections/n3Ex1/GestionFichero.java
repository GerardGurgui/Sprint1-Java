package S3_Collections.n3Ex1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestionFichero {

    public GestionFichero() {
    }

    public void introducirPersona(Persona persona) {


        String fileName;
        FileOutputStream file;
        OutputStreamWriter out;
        BufferedWriter buf;
        PrintWriter pw = null;

        try {

            fileName = "C:\\Users\\gerri\\OneDrive\\Escritorio\\provaCS.csv";
            file = new FileOutputStream(fileName, true);
            out = new OutputStreamWriter(file);
            buf = new BufferedWriter(out);
            pw = new PrintWriter(buf);


            pw.print(persona.getNombre());
            pw.print(",");
            pw.print(persona.getApellido());
            pw.print(",");
            pw.print(persona.getDni());
            pw.println();

            System.out.println("Datos añadidos correctamente");

        } catch (IOException e) {
            e.printStackTrace();

        } finally {

            if (pw != null) {
                pw.close();
            }

        }


    }

    public List<Persona> obtenerDatosFichero() {

        List<Persona> lista = new ArrayList<>();

        String inputFile;
        String nombre;
        String apellido;
        String dni;
        String line;
        FileReader fr = null;
        BufferedReader bfr;
        int i = 0;


        try {

            inputFile = "C:\\Users\\gerri\\OneDrive\\Escritorio\\provaCS.csv";
            fr = new FileReader(inputFile);
            bfr = new BufferedReader(fr);

            while ((line = bfr.readLine()) != null) {

                nombre = line.split(",")[0];
                apellido = line.split(",")[1];
                dni = line.split(",")[2];
                lista.add(new Persona(nombre,apellido,dni));

                i++;

            }

            System.out.println("Total de personas añadidas a la lista: " + i);

        } catch (FileNotFoundException e) {

            System.out.println(e.getMessage());

        } catch (IOException e2) {

            System.out.println(e2.getMessage());

        } finally {

            try {

                if (fr != null) {
                    fr.close();
                }

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }


        return lista;

    }

    public void leerFichero() {

        File file;
        FileReader fr = null;
        BufferedReader br;
        String texto;

        try {

            file = new File("C:\\Users\\gerri\\OneDrive\\Escritorio\\provaCS.csv");
            fr = new FileReader(file);
            br = new BufferedReader(fr);

            while ((texto = br.readLine()) != null) {

                System.out.println(texto);

            }


        } catch (FileNotFoundException e) {

            System.out.println(e.getMessage());

        } catch (IOException e) {

            throw new RuntimeException(e);

        } finally {

            try {

                if (null != fr) {

                    fr.close();
                }

            } catch (Exception e) {

                System.out.println(e.getMessage());
            }
        }
    }


}
