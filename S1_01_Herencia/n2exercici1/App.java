package Backend.Sprint1.S1_01.n2exercici1;

public class App {


    public static void main(String[]args) {


        Smartphone smartphone = new Smartphone("Samsung", "Galaxy");

        smartphone.alarmar();
        smartphone.trucar("662296666");
        smartphone.fotografiar();

        System.out.println(smartphone.toString());



    }
	
}