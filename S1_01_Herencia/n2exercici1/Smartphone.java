package Backend.Sprint1.S1_01.n2exercici1;


public class Smartphone extends Telefon implements Rellotge, Camera {
	

    public Smartphone(String marca, String model) {

            super(marca, model);

    }


    
    public void alarmar() {

            System.out.println("Està sonant l'alarma");

    }


    
    public void fotografiar() {

            System.out.println("Està fent una foto");
    }

}