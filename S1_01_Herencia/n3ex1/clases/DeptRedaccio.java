package S1_Herencia_Polimorfismo.n3ex1.clases;

import java.util.ArrayList;

public class DeptRedaccio {

    private String nomDept;
    private String sector;
    private int id;
    ArrayList<Redactor> llistaRedactors;

    public DeptRedaccio() {

    }

    public DeptRedaccio(String nomDept, String sector, int id) {
        this.nomDept = nomDept;
        this.sector = sector;
        this.id = id;
        llistaRedactors = new ArrayList<>();
    }

    public String getNomDept() {
        return nomDept;
    }

    public void setNomDept(String nomDept) {
        this.nomDept = nomDept;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Redactor> getLlistaRedactors() {
        return llistaRedactors;
    }

    public void setLlistaRedactors(ArrayList<Redactor> llistaRedactors) {
        this.llistaRedactors = llistaRedactors;
    }


    public int buscarRedactor(String dni){

        int i = 0;
        int posicion = -1;
        boolean encontrado = false;

        while (i<llistaRedactors.size() && !encontrado){

            if (llistaRedactors.get(i).getDni().equals(dni)){

                posicion = i;
                encontrado = true;
                System.out.println("Redactor con dni: " +dni+ " encontrado");

            }
            i++;
        }

        if (posicion == -1){

            System.out.println("Dni incorrecto o no existe en este departamento");
        }

        return posicion;
    }

    public void eliminarRedactor(int posicionDni){

        llistaRedactors.remove(posicionDni);

        System.out.println("Redactor eliminado");

    }


    @Override
    public String toString() {
        return "DeptRedaccio{" +
                "nomDept='" + nomDept + '\'' +
                ", sector='" + sector + '\'' +
                ", id=" + id +
                ", llistaRedactors=" + llistaRedactors +
                '}';
    }
}
