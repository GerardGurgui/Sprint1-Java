package Backend.Sprint1.S1_08_Lambdas.n1Ex5;

/*La annotació functional interfaz ens permet implementar mètodes dins del codi
i aquests mètodes poden realitzar funcions diferents per cada instància de la classe*/

@FunctionalInterface
interface InterfazGetPi {
    
    double getPiValue();
    
}
