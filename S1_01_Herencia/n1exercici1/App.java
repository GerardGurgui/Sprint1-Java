package Backend.Sprint1.S1_01.n1exercici1;

public class App {

    public static void main(String[] args) {

        Vent instrumentVent = new Vent("Flauta", 20);
        Vent instrumentVent2 = new Vent("Flauta", 20);

        System.out.println("instrument vent 1: " + instrumentVent.toString());
        instrumentVent.tocar();
        instrumentVent2.tocar();

        instrumentVent2.getNom();

    }

}
