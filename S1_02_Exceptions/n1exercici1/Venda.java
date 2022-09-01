package Backend.Sprint1.S1_02_Exceptions.n1exercici1;

import java.util.ArrayList;


import java.util.ArrayList;

public class Venda {

    private ArrayList<Producte> llistaProductes;
    private double preuTotal;



    public Venda() {

        llistaProductes = new ArrayList<>();

    }



    //GETTERS SETTERS
    public ArrayList<Producte> getLlistaProductes() {
        return llistaProductes;
    }



    public void setLlistaProductEs(ArrayList<Producte> llistaProductes) {
        this.llistaProductes = llistaProductes;
    }





    public double getPreuTotal() {
        return preuTotal;
    }




    public void setPreuTotal(double preuTotal) {
        this.preuTotal = preuTotal;
    }




    //METODES
    
    
    
    public void afegirProductes(Producte producte) {
        
        
        llistaProductes.add(producte);

        
    }


    
    /*Metode on volem comprobar si es genera un error o no,
    dins de la condició, en contes de imprimir un simple missatge, el que fem
    es crear un error del tipu que hem definit (amb el nom de la classe) i que 
    hereda de clase java Exception.
    Després dels parentesis del metode indicar-li que hi ha la posibilitat
    de que es produeixi un error (throws)
    */
    

    public double calcularTotal() throws VendaBuidaException {
        
        
        if(llistaProductes.size() == 0) {

            throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");

        } 

        
        for(int i = 0; i <llistaProductes.size(); i++) {

            preuTotal += llistaProductes.get(i).getPreu();	
        }  
     

    return preuTotal;

    }

}