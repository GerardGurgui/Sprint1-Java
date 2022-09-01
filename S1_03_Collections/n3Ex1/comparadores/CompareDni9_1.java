package S3_Collections.n3Ex1.comparadores;

import S3_Collections.n3Ex1.Persona;

import java.util.Comparator;

public class CompareDni9_1 implements Comparator<Persona> {

    public int compare(Persona p1, Persona p2) {
        return p2.getDni().compareTo(p1.getDni());

    }
}

