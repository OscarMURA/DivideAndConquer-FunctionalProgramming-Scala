# Pruebas del algoritmo 3 - BucketSort:

El algoritmo de Bucket Sort divide la lista de entrada en una serie de "cajas" basadas en el rango de valores de los elementos. Cada caja se ordena individualmente utilizando un algoritmo de ordenación local, como el de inserción. Finalmente, las cajas ordenadas se concatenan para formar la lista de salida, resultando en una lista completamente ordenada. La eficiencia del algoritmo depende de cómo se distribuyen los elementos entre las cajas, siendo más efectivo cuando los datos están uniformemente distribuidos dentro de un rango conocido.

#### Prueba 1-BucketSort

***Nombre de prueba:*** Lista desordenada de números positivos

***Entrada:*** List(4.3, 2.1, 9.8, 1.5, 6.7)

***Salida esperada:*** List(1.5, 2.1, 4.3, 6.7, 9.8)

***Objetivo:*** Verificar el correcto funcionamiento en una lista desordenada de números positivos

#### Prueba 2-BucketSort

***Nombre de prueba:*** Lista desordenada de números positivos y negativos

***Entrada:*** List(-3.2, 5.7, -1.1, 8.9, 0.5)

***Salida esperada:*** List(-3.2, -1.1, 0.5, 5.7, 8.9)

***Objetivo:*** Verificar el correcto funcionamiento en una lista desordenada de números negativos y positivos

#### Prueba 3-BucketSort

***Nombre de prueba:*** Lista con duplicados

***Entrada:*** List(3.2, 1.5, 3.2, 2.1, 2.1)

***Salida esperada:*** List(1.5, 2.1, 2.1, 3.2, 3.2)

***Objetivo:*** Verificar el correcto funcionamiento en una lista con duplicados


#### Prueba 4-BucketSort

***Nombre de prueba:*** Lista vacía

***Entrada:*** List()

***Salida esperada:*** List()


***Objetivo:*** Verificar el correcto funcionamiento en una Lista vacía

#### Prueba 5-BucketSort

***Nombre de prueba:*** Lista con un solo elemento

***Entrada:*** List(10.0)

***Salida esperada:*** List(10.0)

***Objetivo:*** Verificar el correcto funcionamiento en una lista con un solo elemento

#### Prueba 6-BucketSort

***Nombre de prueba:*** Lista ordenada

***Entrada:*** List(1.0, 2.0, 3.0, 4.0, 5.0)

***Salida esperada:*** List(1.0, 2.0, 3.0, 4.0, 5.0)

***Objetivo:*** Verificar el correcto funcionamiento en una Lista ya ordenada

#### Prueba 7-BucketSort

***Nombre de prueba:*** Lista en orden inverso

***Entrada:*** List(5.0, 4.0, 3.0, 2.0, 1.0)

***Salida esperada:*** List(1.0, 2.0, 3.0, 4.0, 5.0)

***Objetivo:*** Verificar el correcto funcionamiento en una Lista en orden inverso

#### Prueba 8-BucketSort
**Nombre prueba:** Lista desordenada con elementos en el rango de [0,1)

**Entrada:** List(0.3, 0.8, 0.1, 0.5, 0.9)

**Salida esperada:** List(0.1, 0.3, 0.5, 0.8, 0.9)

**Objetivo:** Verifica que el algoritmo de ordenación de buckets funcione correctamente con una lista desordenada de elementos en el rango [0, 1), lo que incluye números decimales.

#### Prueba 9-BucketSort
**Nombre prueba:** Lista con elementos en orden inverso

**Entrada:** List(9.8, 7.6, 5.4, 3.2, 1.0)

**Salida esperada:** List(1.0, 3.2, 5.4, 7.6, 9.8)

**Objetivo:** Comprueba que el algoritmo ordene correctamente una lista que está en orden inverso.

#### Prueba 10-BucketSort
**Nombre prueba:** Lista con elementos repetidos

**Entrada:** List(2.3, 1.2, 4.5, 2.3, 3.4)

**Salida esperada:** List(1.2, 2.3, 2.3, 3.4, 4.5)

**Objetivo:** Asegura que el algoritmo maneje adecuadamente los elementos repetidos en la lista.


#### Prueba 11-BucketSort
**Nombre prueba:** Lista con números en punto flotante de gran tamaño

**Entrada:** List(99999.999, 12345.678, 54321.987, 98765.432, 67890.123)

**Salida:** List(12345.678, 54321.987, 67890.123, 98765.432, 99999.999)

**Objetivo:** Verifica que el algoritmo pueda ordenar números de punto flotante de gran tamaño, lo que puede poner a prueba la precisión y la capacidad del algoritmo para manejar números grandes.
