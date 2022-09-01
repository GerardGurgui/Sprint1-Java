package Backend.Sprint1.S1_04_JavaTesting.n1Exercici3;



public class App {
    
    int[] numeros;
    
    
    public App(){
        
        numeros = new int[3];
        
    }

    
    
    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
    
    
    
    public int[] afegirLlista(){
        
        
        for (int i = 0; i <= 3 ; i++) {
            
           numeros[i] = 34;            
        }
        
        return numeros;
    }
    
    
    //////////////
    
    public static void main(String[] args) {
        
        App app = new App();
        
        app.afegirLlista();
        
    }
}
