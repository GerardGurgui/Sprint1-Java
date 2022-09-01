package S1_Herencia_Polimorfismo.n3ex1.factory;

import S1_Herencia_Polimorfismo.n3ex1.clases.NoticiaEsportiva;
import S1_Herencia_Polimorfismo.n3ex1.clasesFilles.NoticiaBasket;
import S1_Herencia_Polimorfismo.n3ex1.clasesFilles.NoticiaFutbol;
import S1_Herencia_Polimorfismo.n3ex1.clasesFilles.NoticiaTenis;

public class FabricaNoticias {

    private String categoriaNoticia;

    public FabricaNoticias(String categoriaNoticia) {
        this.categoriaNoticia = categoriaNoticia;
    }

    public NoticiaEsportiva crearTipoNoticia(){

        NoticiaEsportiva noticiaEsportiva = null;

        if (categoriaNoticia.equalsIgnoreCase("basket")){

            noticiaEsportiva = new NoticiaBasket();

        } else if (categoriaNoticia.equalsIgnoreCase("tenis")) {

            noticiaEsportiva = new NoticiaTenis();

        } else if (categoriaNoticia.equalsIgnoreCase("futbol")) {

            noticiaEsportiva = new NoticiaFutbol();

        }

        return noticiaEsportiva;

    }
}
