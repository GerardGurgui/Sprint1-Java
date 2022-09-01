package Backend.Sprint1.S1_05.N1exercici5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class App {
    
    
     public static void main(String[] args) {
        
         
         //Creem un objecte Client per serialitzar

        Client[] llistaClients = new Client[3];
        
         ArrayList<Client> llistaClientes = new ArrayList<>();

         
        Client client1 = new Client("4565409Y", "Pepe", 40);
        Client client2 = new Client("4566409L", "Marc", 30);
        Client client3 = new Client("6753409B", "Pepi", 20);
        
        llistaClients[0] = client1;
        llistaClients[1] = client2;
        llistaClients[2] = client3;
        
        
        
        
        try {
             
            //Rutas
            File rutaDesti = new File(args[0]);
            File rutaOrigen = new File(args[0]);
            
            //Clases per exportar els objectes ( objecte i ruta de desti)
            ObjectOutputStream serialitzarFitxer = new ObjectOutputStream(new FileOutputStream(rutaDesti));
            serialitzarFitxer.writeObject(llistaClients);
            serialitzarFitxer.close();

            //Clases per importar i poder llegir (deserialitzar)
            ObjectInputStream deserialitzarFitxer = new ObjectInputStream(new FileInputStream(rutaOrigen));

            //Com estem importan un objecte el tenim que guardar a una variable d'aquest mateix tipus i fer el cast del objecte
            Client[] clientRecuperat = (Client[]) deserialitzarFitxer.readObject();
            deserialitzarFitxer.close();

            llistarFitxerRecuperat(clientRecuperat);
             
        } catch (FileNotFoundException e) {
             
             System.out.println("No existeix el fitxer");
             
        }catch(IOException e2){
             
             System.out.println("Error de entrada/sortida");
             
        }catch(Exception e3){
             
             System.out.println("Error fatal");
        }
         
    }
    
     
     static void llistarFitxerRecuperat(Client[] clientRecuperat){
         
         for (Client client : clientRecuperat) {
             
             System.out.println(client);
         }
         
         
     }
     
}
