package S2_Exceptions.n3Ex1.CustomExceptions;

public class ExcepcioFilaIncorrecta extends Exception {


    public ExcepcioFilaIncorrecta(){

    }

    public ExcepcioFilaIncorrecta(String missatgeError){
        super(missatgeError);
    }
}
