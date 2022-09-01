package S3_Collections.n3Ex1.comparadores;

import S3_Collections.n3Ex1.Persona;

import java.util.Comparator;

public class CompareNombreAZ implements Comparator<Persona> {

    public int compare(Persona p1, Persona p2) {
        return p1.getNombre().compareTo(p2.getNombre());

    }

}
