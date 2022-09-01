package Backend.Sprint1.S1_01.n2exercici1;


public class Telefon {
	
    private String marca;
    private String model;


    public Telefon(String marca, String model) {

            this.marca = marca;
            this.model = model;

    }



    public void trucar(String numero) {

            System.out.println("El número que estás trucant és: " +numero);

    }



    @Override
    public String toString() {
            return "Telefon [marca=" + marca + ", model=" + model + "]";
    }

	
	
}


