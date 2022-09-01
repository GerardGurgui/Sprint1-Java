package Backend.Sprint1.S1_02_Exceptions.n1exercici1;

import java.util.Scanner;


import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Venda venda = new Venda();
        
        String nomProducte;
        double preuTotal = 0;
        
        int opcioUsuari;
        

        Producte producte1 = new Producte("movil", 50);
        Producte producte2 = new Producte("tele", 150);
        Producte producte3 = new Producte("ordinador", 500);
        
        
        venda.afegirProductes(producte1);
        venda.afegirProductes(producte2);
        venda.afegirProductes(producte3);
        
        System.out.println(venda.getLlistaProductes().size());
        
        
    do {            
            
        System.out.println("0- Sortir");
        System.out.println("1- afegir producte");
        System.out.println("2- buscar un producte a la llista");
        System.out.println("3- calcular total");

        opcioUsuari = demanarNumInt(0, 3, "Introdueixi una de les opcions");

        switch (opcioUsuari) {

            case 1:

                System.out.println("Opció 1- Afegir producte");
                venda.afegirProductes(producte1);
                venda.afegirProductes(producte2);
                venda.afegirProductes(producte3);
                System.out.println("Productes afegits correctament");
                
                break;

            case 2:

                System.out.println("Opció 2- buscar un producte");
                nomProducte = demanarDadesText("Introdueixi el nom del producte a buscar");
                
                
                /*
                Si per exemple volem generar un error del tipus ArrayIndexOutOfBoundsException, sería
                suficient amb recorrer la llista on li indiquem que les iteracions siguin superios o IGUALS al tamany d'aquest array,
                ja que estem intentant accedir a un posició igual al tamany de la llista, i el primer element sempre es guarda a la 
                posició 0, per tant ens donará el error, per que intentem accedir a una posició que no existeix
                
                */
                
                int i = 0;
                boolean coincidencia = false;

                while(i <= venda.getLlistaProductes().size() && coincidencia == false){


                     if (nomProducte.equals(venda.getLlistaProductes().get(i).getNom())) {

                        
                        coincidencia = true;   
                    }

                     i++;       
                }
               
                
                break;
                

            case 3:

                System.out.println("Opció 3- Calcular el total dels productes");
                
                /*
                Dins del try validem el metode on es pot produir el error,
                si és així, el captura guardant-lo a una variable, on podem
                mostrar el missatge que hem escrit al metode 
                */
                
                try {

                   preuTotal = venda.calcularTotal();
                    System.out.println("Preu total de la llista és de " +preuTotal);
                    
                } catch (Exception e) {

                    System.out.println(e.getMessage());
                }
                
                break;

        }//FINAL SWITCH

        
    } while (opcioUsuari != 0);
        
}
    
    
    
    
    //DADES USUARI

    static int demanarNumInt(int min, int max, String texto){

      Scanner input = new Scanner(System.in);

      int numUsuari;
        
    do{
        
        System.out.println(texto);
        numUsuari = input.nextInt();
        
            if(numUsuari < min || numUsuari > max){
                
                System.out.println("Opció incorrecte, torni a escollir una opció");
            }
        
        
    }while(numUsuari < min || numUsuari > max);
        
        return numUsuari;
    }
    
       
    static String demanarDadesText(String texto){
        
        Scanner input = new Scanner(System.in);
        
        String textUsuari;
        System.out.println(texto);
        textUsuari = input.nextLine();
        
        
          
        return textUsuari;
    }

}