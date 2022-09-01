package S2_Exceptions.n3Ex1;

import java.util.Objects;

public class Butaca {

    private int numeroFilas;
    private int nombreSeient;
    private Client client;

    public Butaca(int numeroFilas, int nombreSeient, Client client) {
        this.numeroFilas = numeroFilas;
        this.nombreSeient = nombreSeient;
        this.client = client;
    }

    public int getNumeroFilas() {
        return numeroFilas;
    }

    public void setNumeroFilas(int numeroFilas) {
        this.numeroFilas = numeroFilas;
    }

    public int getNombreSeient() {
        return nombreSeient;
    }

    public void setNombreSeient(int nombreSeient) {
        this.nombreSeient = nombreSeient;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


    @Override
    public boolean equals(Object obj) {

        boolean sonIguales = false;

        if (obj instanceof Butaca){

            Butaca comprobarButaca = (Butaca) obj;

            if (this.nombreSeient == comprobarButaca.nombreSeient
               && this.numeroFilas == comprobarButaca.numeroFilas){

                sonIguales = true;
            }

        }

        return sonIguales;

    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroFilas, nombreSeient);
    }

    @Override
    public String toString() {
        return "Butaca{" +
                "numeroFilas=" + numeroFilas +
                ", nombreSeient=" + nombreSeient +
                ", client=" + client +
                '}';
    }
}
