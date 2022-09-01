package Backend.Sprint1.S1_06_Generics.n1Exercici1;

public class Persona {
    
    private String persona1;
    private String persona2;
    private String persona3;
   
   
   public Persona(String persona2, String persona1, String persona3){
       
       
       this.persona1 = persona1;
       this.persona2 = persona2;
       this.persona3 = persona3;
       
   }

    public String getPersona1() {
        return persona1;
    }

    public void setPersona1(String persona1) {
        this.persona1 = persona1;
    }

    public String getPersona2() {
        return persona2;
    }

    public void setPersona2(String persona2) {
        this.persona2 = persona2;
    }

    public String getPersona3() {
        return persona3;
    }

    public void setPersona3(String persona3) {
        this.persona3 = persona3;
    }

    
    @Override
    public String toString() {
        return "Persona{" + "persona1=" + persona1 + ", persona2=" + persona2 + ", persona3=" + persona3 + '}';
    }
    
   
}
    
    

