package S2_Exceptions.n3Ex1;

import S2_Exceptions.n3Ex1.CustomExceptions.ExcepcioButacaOcupada;
import S2_Exceptions.n3Ex1.CustomExceptions.ExceptionButacaLlire;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestioButaques {

    private List<Butaca> llistaButaques;


    public GestioButaques() {

        llistaButaques = new ArrayList<>();

    }

    public List<Butaca> getLlistaButaques() {
        return llistaButaques;
    }

    public void setLlistaButaques(List<Butaca> llistaButaques) {
        this.llistaButaques = llistaButaques;
    }



    public void afegirButaca(Butaca butaca) throws ExcepcioButacaOcupada {

        if (buscarButaca(butaca.getNumeroFilas(), butaca.getNombreSeient()) != -1) {

            throw new ExcepcioButacaOcupada("Aquesta butaca ja está reservada");

        }

        llistaButaques.add(butaca);
        System.out.println("Butaca reservada correctament");


    }

    public void eliminarButaca(int fila, int seient) throws ExceptionButacaLlire {

        if (buscarButaca(fila,seient) == -1) {

            throw new ExceptionButacaLlire("Aquesta butaca no está reservada");

        } else {

            llistaButaques.remove(buscarButaca(fila,seient));
            System.out.println("Reserva de butaca eliminada");

        }


    }


    public int buscarButaca(int fila, int seient) {

        int i = 0;
        int posicio = -1;
        boolean encontrado = false;

        while (i < llistaButaques.size() && !encontrado) {

            if (llistaButaques.get(i).getNumeroFilas() == fila
                    && llistaButaques.get(i).getNombreSeient() == seient) {

                posicio = i;
                encontrado = true;
                System.out.println("Butaca de la fila " + fila + " y asiento " + seient + " encontrado");

            }

            i++;
        }

        return posicio;

    }


    @Override
    public String toString() {
        return "GestioButaques{" +
                "llistaButaques=" + llistaButaques +
                '}';
    }
}
