### **Programación 2**
### Tecnicatura Universitaria en Desarrollo de Aplicaciones Informáticas
### Trabajo Práctico Especial Libres 2023

# Trabajo

En un establecimiento ganadero de producción de carne (cría/invernada), se desea establecer
el peso de la hacienda para realizar sus ventas. La hacienda se organiza en rodeos que
agrupan animales. De cada animal se guarda un identificador, edad en meses, peso, raza,
sexo, si fue capado o no, terneros paridos.

Asimismo, un establecimiento podría tener varios rodeos e incluso vacas sueltas, Asimismo
una Empresa agropecuaria podría tener varios Establecimientos, rodeos o vacas sueltas. Las
vacas se identifican a través de chip electrónico (cada chip posee un id) y cuando atraviesan
la pasada que conduce al bebedero se pesan de forma automática a través de una balanza al
paso. De esta forma en todo momento se conoce el peso de cada animal.

Servicios Básicos :
- Obtener la cantidad de animales de un rodeo/establecimiento/empresa
- Obtener el promedio de edad de los animales de un rodeo/establecimiento/empresa
- Obtener el peso total de un rodeo/establecimiento/empresa
- Obtener el promedio de peso de cada animal en un rodeo/establecimiento/empresa
 
Es posible consultar si un grupo de animales está listo para ser vendido. Existen diferentes
condiciones para saber si es posible vender un grupo de animales, por ejemplo:

- Que el promedio del peso de cada animal del grupo sea superior a 650 Kg.
- Que el promedio de edad de cada animal del grupo sea mayor a 24 meses
- Que el promedio de edad del grupo de animales sea superior a 36 meses o que el peso sea mayor a 700 Kg.
   
Asimismo se debe proveer también mecanismos que permitan armar camiones para la venta
de animales. Cada camión posee una capacidad (cantidad de animales) y ciertos requisitos
que deben cumplir los animales que se carguen al mismo. Algunos ejemplos de restricciones
son los siguientes:

- Todos los animales deben ser de la raza “aberdeen angus”
- Todos los animales deben tener un peso superior a 650 Kg. 
- Todos los animales deben tener una edad superior a 4 años.
- Todos los animales deben tener un peso superior a 500 Kg o una edad superior a 5 años.
- Todos los animales deben tener una edad superior a 3 años y ser de la raza “Hereford”.

NOTA: los anteriores son solo ejemplos de las posibles restricciones que se aplican sobre los
atributos del animal y combinaciones lógicas (AND y OR) de ellos.

Cuando a un rodeo/establecimiento/empresa se le solicita llenar un camión de venta se le
indica la capacidad del camión y las condiciones que debe cumplir cada animal, y el
rodeo/establecimiento/empresa devuelve los primeros animales que encuentra y que cumplen
el criterio hasta llegar a la capacidad solicitada. Para completar este servicio luego de armado
un camión se debe dar de baja cada uno de los animales, es decir eliminarlos del
rodeo/establecimiento/empresa al que pertenecían.

El sistema ganadero debe poder clasificar a un animal acorde a lo determinado por Ministerio
de Agricultura y Pesca, Alimentación y Medio Ambiente de España. Para esto dado un
animal se retorna su categoría acorde a la siguiente clasificación:

- Lechal. Animales con una edad inferior a los 8 meses
- Ternero. Animales con una edad comprendida entre los 8 meses y el año de edad.
- Añojo. Son los animales que tienen entre 12 y 24 meses de edad.
- Novillo. Animales con una edad comprendida entre los 2 y los 4 años.
- Cebón. Es el macho capado al año de edad que no ha llegado a cumplir los 48 meses
- Vaquillona: hembra mas de 15 meses, que nunca parió un ternero.
- Vaca. Vaquillona que ya ha parido un ternero.
- Buey. Ejemplar macho mayor de 48 meses y capado.
- Toro. Ejemplar macho que no fue capado.

Tener en cuenta que un animal puede recibir varias categorías, por ejemplo un animal macho
menor a 8 meses que no ha sido capado recibiría la categoría, Lechal-Toro
   
La anterior es solo una forma de clasificación propuesta y si bien el mecanismo de
clasificación va a ser el mismo, las categorías pueden variar en el futuro. Por ejemplo, la
categorización podría simplificarse a: Si es Macho es TORO y si es Hembra es VACA.
Implementar la solución anterior incluyendo un mail con ejemplos de cada una de las
funcionalidades que deben ser implementadas.