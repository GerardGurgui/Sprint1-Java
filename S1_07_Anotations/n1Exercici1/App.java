package Backend.Sprint1.S1_07_Anotations.n1Exercici1;



public class App {
    
    
    public static void main(String[] args) {
        
        Treballador treballadorGerard = new Treballador("Gerard", "Gurgui" , 15);
        double total = treballadorGerard.calcularSou(120);
        
        System.out.println("-Treballadors: ");
        System.out.println("Un teballador normal cobra per 120 hores " +total);
        
        
        //CLASES FILLES
        TreballadorOnline treballadorOnline = new TreballadorOnline("pepito", "pepo", 12, 49.50);
        double totalOnline = treballadorOnline.calcularSou(120);
        
        System.out.println("-Treballador online: ");
        System.out.println("Un treballador online cobra per 120 hores " +totalOnline);
        
        TreballadorPresencial treballadorPresencial = new TreballadorPresencial("treballador", "presencial", 18);
        double totalPresencial = treballadorPresencial.calcularSou(120);
        
        System.out.println("-Treballador presencial: ");
        System.out.println("Un treballador presencial cobra per 120 hores " +totalPresencial);
        
        
        //////NIVELL 1-EXERCICI 2 //////
        /*
        Al cridar els metodes amb la annotació @deprecated, automaticament quan el cridem al main
        ens surt taxat com si estigues desfasat
        */
        
        System.out.println("-------N1 EX2------");
        
        //TREBALLADOR ONLINE
        
        int hores = treballadorOnline.horasDia();
        System.out.println("metode deprecated Treballador online " +hores);
        
        //TREBALLADOR PRESENCIAL
        
        double sou = treballadorPresencial.souSensePlusBenzina(total);
        System.out.println("sou sense benzina t pres "+ sou);
        
        
        
    }
}