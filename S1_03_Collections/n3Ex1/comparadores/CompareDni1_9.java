package S3_Collections.n3Ex1.comparadores;

import S3_Collections.n3Ex1.Persona;

import java.util.Comparator;

public class CompareDni1_9 implements Comparator<Persona> {

    public int compare(Persona p1, Persona p2) {
        return p1.getDni().compareTo(p2.getDni());

    }
}
