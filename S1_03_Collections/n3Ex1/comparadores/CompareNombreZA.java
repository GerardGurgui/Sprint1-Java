package S3_Collections.n3Ex1.comparadores;

import S3_Collections.n3Ex1.Persona;

import java.util.Comparator;

public class CompareNombreZA implements Comparator<Persona> {

    public int compare(Persona p1, Persona p2) {
        return p2.getNombre().compareTo(p1.getNombre());

    }
}
