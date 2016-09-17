# Bodega_Solucionado

Solucion al problema de la bodega. Autor: Nicolas Machado Saenz 13207014 Curso de Sistemas Operativos 2016-2

Para la solución se utilizaron constantes que identifican los valores clave:

Capacidad máxima de la bodega.
Tipo de articulo almacenable en la bodega
Volumen del artículo almacenable, según sea el tipo.
Para descargar un artículo, según sea el tipo, así mismo es el límite de capacidad para que pueda ser descargado.

Si el articulo es tipo 1, la bodega debe tener 10m3 menos de la capacidad máxima.
Si el articulo es tipo 2, la bodega debe tener 15m3 menos de la capacidad máxima.
Para crear un paquete, debe verificarse que la bodega tenga como mínimo 90m3 guardados, calculados así:

Tipo 1 son 3 artículos, luego 3 * 10m3 = 30m3.
Tipo 2 son 4 artículos, luego 4 * 15m3 = 60m3.
La suma da 90m3.
