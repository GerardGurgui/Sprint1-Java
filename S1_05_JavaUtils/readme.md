
# S1.05 Java Utils

## Ejercicios Input/Output con ficheros, lectura y escritura vía línea de comandos

Ejecutaremos todos los ejercicios desde la línea de comandos, es decir, pasaremos como parámetro del main (String[] args)
las rutas de directorios sobre las que queremos trabajar.
En lugar de ejecutarlo desde la consola del IDE, ejecutaremos el programa desde el cmd mostrando allí los resultados.

Para pasarle argumentos al main lo haremos desde propiedades del proyecto--> run configuration--> argumentos--> "ruta"
guardaremos esta ruta en una variable de tipo File, especificando que recibe lo que contiene el main--> File ruta = new File(args[0]) por ejemplo,
y trabajaremos partiendo de aquí.


Ahora ya podemos ejecutar desde el cmd:

- abrimos el cmd (inicio o tecla windows+R y escribimos cmd)

- cd (change directory) para acceder a la carpeta donde se encuentra la clase del proyecto que queremos ejecutar

- indicaremos que queremos ejecutar un programa java (con la palabra java como primer comando)
 
- seguido de un espacio, el nombre de la clase con .java (App.java)

- seguido de otro espacio y la ruta del directorio donde se encuentra la clase del proyecto

Ejemplo: java App.java "Ruta"


-Ejercicio 1:

listar directorio

java N1ex1.java "ruta del directorio que queremos listar"


-Ejercicio 2:

listar directorio recursivamente

java N1ex2.java "ruta del directorio que queremos listar"


-Ejercicio 3:

listar directorio recursivamente y escribir el contenido en un archivo .txt

java N1ex3.java "ruta del directorio que queremos listar"



-Ejercicio 4:

preguntar al usuario qué directorio desea mostrar

java N1ex4.java --> preguntará al usuario la ruta del directorio

ruta: especificar la ruta


-Ejercicio 5:

serializar un objeto java en un archivo .ser y desarializar


java N1ex5.java "ruta donde queremos guardar el archivo .ser"


---NIVEL 2

-Ejercicio 1:

Crear un archivo properties

creamos un file en el IDE que contendrá valores tipo key = value.

java N2ex1.java "ruta donde se encuentra el archivo .properties"
