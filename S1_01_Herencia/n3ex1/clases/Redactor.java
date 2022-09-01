package S1_Herencia_Polimorfismo.n3ex1.clases;

import java.util.ArrayList;

public class Redactor {

    private final String dni;
    private String nom;
    private String sector;
    private static double sou;
    private ArrayList<NoticiaEsportiva> llistaNoticies;

    public Redactor(String dni, String nom, String sector){

        this.dni = dni;
        this.nom = nom;
        this.sector = sector;
        Redactor.sou = 1500;
        llistaNoticies = new ArrayList<>();
    }


    public String getDni() {
        return dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public static double getSou() {
        return sou;
    }

    public static void setSou(double sou) {
        Redactor.sou = sou;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public ArrayList<NoticiaEsportiva> getLlistaNoticies() {
        return llistaNoticies;
    }

    public void setLlistaNoticies(ArrayList<NoticiaEsportiva> llistaNoticies) {
        this.llistaNoticies = llistaNoticies;
    }

    @Override
    public String toString() {
        return "Redactor{" +
                "dni='" + dni + '\'' +
                ", nom='" + nom + '\'' +
                ", sector='" + sector + '\'' +
                ", llistaNoticies=" + llistaNoticies +
                '}';
    }
}
