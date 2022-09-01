package Backend.Sprint1.S1_01.n1exercici2;

public class App {
    
    public static void main(String[] args) {
        
        
        Cotxe cotxe = new Cotxe("leon", 1300);
        Cotxe cotxe1 = new Cotxe("cupra", 1700);
        
        
        System.out.println("marca " +Cotxe.getMARCA());
        System.out.println("model " +Cotxe.getModel());
        System.out.println("potencia " +cotxe.getPOTENCIA());
        System.out.println("potencia " +cotxe1.getPOTENCIA());
        
        cotxe.frenar();
        
        cotxe.accelerar();
        
        System.out.println(cotxe.toString());
        
    }
    
}
