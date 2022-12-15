
# S1.02 Exceptions

## Nivel 1: 

* Ejercicio 1:

Crea una clase llamada "Producto" con los atributos nombre y precio, y otra clase llamada "Venta". Esta clase tiene por atributos una colección de productos y el precio total de la venta.

La clase "Venta", tiene un método llamado calcularTotal() que lanza la excepción personalizada VentaBuidaException y muestra por pantalla "Para hacer una venta primero debes añadir productos" si la colección de productos está vacía. Si la colección tiene productos, entonces debe recorrer la colección y guardar la suma de todos los precios de los productos en el atributo precio total de la venta.

La excepción personalizada VendaBuidaException debe ser hija de la clase Exception. A su constructor debemos pasarle el mensaje “Para hacer una venta primero debes añadir productos” y cuando capturamos la excepción, debemos mostrarlo por pantalla con el método getMessage() de la excepción.

Escribe el código necesario para generar y capturar una excepción de tipo ArrayIndexOutOfBoundsException.

## Nivel 2: 

* Ejercicio 1: 

Crea una clase llamada "Entrada". Esta clase debe servir para controlar las distintas excepciones que pueden aparecer en Java a la hora de introducir datos por teclado utilizando la clase Scanner.

Lo primero que debe hacerse es instanciar un objeto de la clase Scanner ya partir de ahí, crear métodos estáticos para leer los diferentes tipos de datos desde el teclado.

 Importante

Es importante que si en algún método salta una excepción, la tratamos y volvemos a pedir el dato al usuario hasta que éste esté bien introducido. Por ejemplo: Si introduce un float con un punto en lugar de con una coma, debe mostrar “Error de formato”. Hasta que el usuario/a no introduce un float bien formado debe seguir pidiendo el dato.

Todos los métodos reciben un String con el mensaje que se quiere mostrar al usuario, por ejemplo: “Introduce tu edad”, y devuelven el dato oportuno introducido por el usuario en cada método, por ejemplo: uno byte con la edad del usuario/a.

Métodos a implantar capturando la excepción de la clase InputMismatchException:

public static byte leerByte(String mensaje);

public static int leerInt(String mensaje);

public static float leerFloat(String mensaje);

public static double leerDouble(String mensaje);

Métodos a implantar capturando la excepción de la clase Exception:

public static char leerChar(String mensaje);

public static String leerString(String mensaje);

public static boolean leerSiNo(String mensaje), si el usuario introduce “s”, devuelve “true”, si el usuario introduce “n”, devuelve “false”.


## Nivel 3:

* Ejercicio 1:

Una famosa empresa de cines nos ha pedido que desarrollemos una aplicación para la reserva de asientos en sus cines. La aplicación será utilizada por los vendedores/as a la hora de vender las entradas.

Funcionamiento
La aplicación una vez se haya iniciado, preguntará al usuario cuántas filas y cuántos asientos por fila tiene la sala de cine. Una vez introducidos estos datos, se mostrará el siguiente menú:

1.- Mostrar todas las butacas reservadas.

2.- Mostrar las butacas reservadas por una persona.

3.- Reservar un sillón.

4.- Anular la reserva de un sillón.

5.- Anular todas las reservas de una persona.

0.- Salir.


La aplicación tendrá las siguientes clases:

Clase Principal

Tendrá el main de la aplicación donde se instanciará un objeto de la clase Cine y llamará a su método iniciar.


Clase Butaca

Tendrá los datos de un sillón:

Atributos:

Número de fila.

Número de asiento.

Persona que reserva el sillón.

Métodos:

Constructor con todos sus parámetros.

Getters por todos los atributos.

Equals: devolverá que dos butacas son iguales si la fila y el asiento son iguales.

toString: devolverá un String con el siguiente formato: “Fila: 5, Asiento: 20, Persona: Maria Febrer”


Clase Cine

Contendrá todos los métodos que permiten interactuar al usuario con la aplicación.

Atributos:

Número de filas del cine.

Número de asientos por cada fila.

Un objeto de la clase GestioButaques

Métodos:

Constructor: no recibirá parámetros. Creará el objeto de la clase GestiónButacas. Y llamará al método pedir Datos Iniciales que inicializará el número de filas y de asientos.

iniciar: empezará la aplicación. Llamará al método menú y en función del número devuelto, llamará al método correspondiente.

menu: mostrará las opciones del menú principal al usuario, le pedirá el número de la opción escogida y lo devolverá.

mostrarButacas: Muestra todas las butacas reservadas.

mostrarButacasPersona: Pide el nombre de la persona que ha hecho la reserva y muestra todas las butacas reservadas por esa persona.

reservarButaca: Pide al usuario un número de fila (llamada al método introducirFila), un número de asiento (llamada al método introducirAsiento), el nombre de la persona que hace la reserva (llamada al método introducirPersona) y reserva el sillón .

anularReserva: Pide al usuario un número de fila (llamada al método introducirFila), un número de asiento (llamada al método introducirAsiento) y elimina la reserva del sillón.

anularReservaPersona: Pide al usuario el nombre de la persona (llamada al método introducirPersona) y elimina las butacas reservadas por la persona introducida.

introducirPersona: pide al usuario el nombre de la persona y lo devuelve si es correcto. Si contiene números, lanza una excepción personalizada ExcepcionNomPersonaIncorrecte.

pedirDatosIniciales: Pide al usuario el número de filas y asientos y los guarda en los atributos correspondientes.

introducirFila: Pide el número de fila, si éste está entre 1 y el número de filas totales, lo devuelve. Si no, devuelve una excepción personalizada ExcepcioFilaIncorrecta.

introducirAsiento: Pide el asiento, si el número está entre 1 y el número total de asientos, lo devuelve. Si no, devuelve una excepción del tipo ExcepcioSeientIncorrecte.


Clase GestioButacas

Contendrá un ArrayList de butacas y los métodos necesarios para añadir, eliminar y buscar las butacas en ArrayList.

Atributos:

sillones: ArrayList de sillones.

Métodos:

Constructor: No recibirá parámetros e inicializará el ArrayList de butacas.

getButacas: Devolverá el atributo sillones.

añadirButaca: será el encargado de añadir un sillón al vector de sillones. Recibirá como parámetro un objeto de la clase Butaca y lo añadirá a ArrayList. Si la fila y el asiento de la butaca recibida como parámetro coinciden con el de una butaca que ya se encuentre en ArrayList (se utilizará el método buscarButaca), se lanzará la excepción personalizada ExcepcioButacaOcupada.

eliminarButaca: será el encargado de eliminar una butaca del ArrayList de butacas. Recibirá como parámetros el número de fila y el asiento y lo eliminará del ArrayList. Si la fila y el asiento no coinciden con el de una butaca reservada (se utilizará el método buscarButaca), lanzará una excepción personalizada ExcepcioButacaLliure.

buscarButaca: Buscar en el ArrayList de butacas, la butaca que coincida con los datos recibidos como parámetro (fila y asiento). Si la encuentra devolverá la posición de la butaca en ArrayList y si no la encuentra devolverá -1.

