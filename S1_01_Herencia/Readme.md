
# S1.01 Herencia y polimorfismo

## Nivel 1:

  * Ejercicio 1:


En un grupo de música existen diferentes tipos de instrumentos musicales. Hay instrumentos de viento, cuerda y percusión.

Todos los instrumentos tienen como atributos su nombre y precio. Además, tienen un método llamado tocar(). Éste es abstracto en la clase instrumento y, por tanto, debe implementarse en las clases hijas. Si se está tocando un instrumento de viento, el método debe mostrar por consola: "Está sonando un instrumento de viento", si se está tocando un instrumento de cuerda: "Está sonando un instrumento de cuerda" y si se está tocando un instrumento de percusión: "Está sonando un instrumento de percusión".


El proceso de carga de una clase sólo tiene lugar una vez. Demuestra que la carga puede ser provocada por la creación de la primera instancia de esta clase o por el acceso a un miembro estático de ésta.

Buscar información sobre los blogs de inicialización y blogs estáticos en Java.
  
  
  
  * Ejercicio 2: 

Crea una clase "Coche" con los atributos: marca, modelo y potencia. La marca debe ser estático final, el modelo estático y la potencia final. Demuestra la diferencia entre los tres. ¿Hay alguno que pueda inicializarse al constructor de la clase?

Añade dos métodos a la clase "Coche". Un método estático llamado frenar() y otro no estático llamado acelerar(). El método acelerar debe mostrar por consola: "El vehículo está acelerando" y el método frenar() debe mostrar: "El vehículo está frenando".

Demuestra cómo invocar el método estático y el no estático desde el main() de la clase principal.


## Nivel 2:

* Ejercicio 1: 

Crea una clase llamada "Teléfono" con los atributos marca y modelo, y el método llamar(). Este método debe recibir un String con un número de teléfono. El método debe mostrar por consola un mensaje diciendo que se está llamando al número recibido por parámetro.

Crea una interfaz llamada "Cámara" con el método fotografiar(), y otra interfaz llamada Reloj con el método alarma().

Crea una clase llamada "Smartphone" que sea subclase de "Teléfono" y que a su vez implemente las interfaces "Camera" y "Reloj".

El método fotografiar() debe mostrar por consola: "Se está haciendo una foto" y el método alarma() debe mostrar: "Está sonando la alarma".

Desde el main() de la aplicación, crea un objeto Smartphone y llama a los métodos anteriores.

## Nivel 3: 

* Ejercicio 1: 

En una redacció de notícies esportives tenen les notícies classificades per esports: futbol, bàsquet, tenis, F1 i motociclisme.

La redacció pot tenir més d’un redactor, i de cadascun d’ells volem saber el seu nom, el DNI i el sou. Un cop assignat un DNI, aquest no podrà canviar mai. Tots els redactors tenen el mateix sou, i si en un futur l’empresa pot incrementar-lo, ho farà a tothom per igual. De moment el sou actual és de 1500 €.

Cada redactor pot treballar en més d’una notícia. Les notícies han de tenir un titular, un text, una puntuació i un preu. En el moment de crear-se, el text ha d’estar buit.

A més, de les notícies de futbol s’ha de saber a quina competició fa referència(String), a quin club(String) i a quin jugador(String).

De les notícies de bàsquet s’ha d’indicar a quina competició fa referència(String) i a quin club(String).

De les notícies de tenis s’ha de saber de quina competició(String) parlen i de quins tenistes(String).

De les notícies d'F1 hem de saber a quina escuderia(String) fan referència.

De les notícies de motociclisme s’ha d’indicar de quin equip(String) són.

Les notícies es venen a diferents mitjans. Per saber el preu de cada notícia hem d'implementar un mètode que es diu calcularPreuNoticia(). 

A continuació s’explica com calcular el preu de cada notícia:

Notícies de futbol: 

Preu inicial: 300 €

Lliga de Campions: 100 €

Barça o Madrid: 100 €

Ferran Torres o Benzema: 50 €


Exemple: Una notícia que parla d’un gol de Ferran Torres del Barça a la Lliga de Campions, té un preu de 550 €.

Notícies de bàsquet:

Preu inicial: 250 €

Eurolliga: 75 €

Barça o Madrid: 75 €


Notícies de tenis:

Preu inicial: 150 € 

Federer, Nadal o Djokovic: 100 €


Notícies d'F1:

Preu inicial: 100 €

Ferrari o Mercedes: 50 €


Notícies de motociclisme:

Preu inicial: 100 €

Honda o Yamaha: 50 €


Per calcular les puntuacions de les notícies se segueixen els següents criteris:

Notícies de futbol:

5 Punts.

Lliga de Campions: 3 punts

Lliga: 2 punts

Barça o Madrid: 1 punt

Ferran Torres o Benzema: 1 punt

Exemple: Una notícia que parla d’un gol de Ferran Torres del Barça a la Lliga de Campions, té una puntuació de 10 punts.


Notícies de bàsquet:

4 punts

Eurolliga: 3 punts

ACB: 2 punts

Barça o Madrid: 1 punt


Notícies de Tenis:

4 punts

Federer, Nadal o Djokovic: 3 punts


Notícies F1:

4 punts

Ferrari o Mercedes: 2 punts


Notícies de Motociclisme:

3 punts

Honda o Yamaha: 3 punts


A la classe principal s’ha de fer un menú amb les següents opcions:

1.- Introduir redactor.

2.- Eliminar redactor.

3.- Introduir notícia a un redactor.

4.- Eliminar notícia (ha de demanar redactor i titular de la notícia).

5.- Mostrar totes les notícies per redactor.

6.- Calcular puntuació de la notícia.

7.- Calcular preu-notícia.

