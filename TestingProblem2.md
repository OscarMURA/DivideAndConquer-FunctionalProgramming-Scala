# Problema 3 Quick Sort con 3 particiones


Las implementaciones de las funciones equalList, greaterList y lowerList se combinan en la función updatedQuickSort
para ofrecer una versión modificada y eficiente del algoritmo de ordenación rápida (QuickSort). 
Cada una de estas funciones desempeña un papel crucial en el proceso de partición de la lista original. 
equalList identifica y extrae todos los elementos iguales a un valor de pivote dado, greaterList selecciona 
los elementos mayores que el pivote, mientras que lowerList extrae aquellos que son menores que el pivote. 
Estas tres funciones, utilizadas en conjunto, permiten dividir eficientemente la lista en tres secciones: 
elementos menores que el pivote, elementos iguales al pivote y elementos mayores que el pivote. 
Posteriormente, estas secciones se ordenan recursivamente utilizando el algoritmo QuickSort y 
se concatenan para formar la lista final ordenada. Este enfoque de dividir y conquistar 
es fundamental para lograr una ordenación eficiente de la lista original.


1. **equalList**:
   - Este algoritmo implementa una función recursiva que recorre una lista de enteros y
devuelve una nueva lista que contiene solo los elementos iguales al valor de pivote dado. 
Esencialmente, la función filtra los elementos de la lista original que coinciden con el valor de pivote y los coloca en una nueva lista.
La función sigue este proceso de filtrado de forma recursiva hasta que se agota la lista original.

#### Prueba 1
*Nombre de prueba:* equalList - Positive Test 1
*Entrada:* List(1, 2, 3), 2
*Salida esperada:* List(2)
*Objetivo:* Verificar si la función equalList devuelve correctamente el elemento 2 en una lista dada.

#### Prueba 2
*Nombre de prueba:* equalList - Positive Test 2
*Entrada:* List(5, 5, 5, 5), 5
*Salida esperada:* List(5, 5, 5, 5)
*Objetivo:* Confirmar que la función equalList devuelve correctamente todos los elementos coincidentes con 5 en una lista dada.

#### Prueba 3
*Nombre de prueba:* equalList - Positive Test 3
*Entrada:* List(1, 2, 3), 4
*Salida esperada:* Nil
*Objetivo:* Comprobar si la función equalList devuelve una lista vacía cuando no se encuentra ningún elemento coincidente.

#### Prueba 4
*Nombre de prueba:* equalList - Positive Test 4
*Entrada:* List(), 5
*Salida esperada:* Nil
*Objetivo:* Verificar si la función equalList devuelve una lista vacía cuando se le pasa una lista vacía como entrada.

#### Prueba 5
*Nombre de prueba:* equalList - Positive Test 5
*Entrada:* List(5, 6, 7, 8), 1
*Salida esperada:* Nil
*Objetivo:* Asegurar que la función equalList devuelve una lista vacía cuando el elemento buscado no está presente en la lista dada.

#### Prueba 6
*Nombre de prueba:* equalList - Positive Test 6
*Entrada:* List(-1, -2, -3), -2
*Salida esperada:* List(-2)
*Objetivo:* Verificar si la función equalList maneja correctamente números negativos devolviendo el elemento -2 de la lista dada.

#### Prueba 7
*Nombre de prueba:* equalList - Positive Test 7
*Entrada:* List(-5, -5, -5, -5), -5
*Salida esperada:* List(-5, -5, -5, -5)
*Objetivo:* Confirmar que la función equalList devuelve correctamente todos los elementos coincidentes con -5 en una lista de números negativos.

#### Prueba 8
*Nombre de prueba:* equalList - Positive Test 8
*Entrada:* List(-1, -2, -3), -4
*Salida esperada:* Nil
*Objetivo:* Verificar si la función equalList devuelve una lista vacía cuando no se encuentra ningún elemento coincidente en una lista de números negativos.

#### Prueba 9
*Nombre de prueba:* equalList - Positive Test 9
*Entrada:* List(), -5
*Salida esperada:* Nil
*Objetivo:* Confirmar que la función equalList devuelve una lista vacía cuando se le pasa una lista vacía como entrada en una lista de números negativos.

#### Prueba 10
*Nombre de prueba:* equalList - Positive Test 10
*Entrada:* List(-5, -6, -7, -8), -1
*Salida esperada:* Nil
*Objetivo:* Verificar si la función equalList devuelve una lista vacía cuando el elemento buscado no está presente en una lista de números negativos.

#### Prueba 11
*Nombre de prueba:* equalList - Positive Test 11
*Entrada:* List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5), 0
*Salida esperada:* List(0)
*Objetivo:* Asegurar que la función equalList devuelve correctamente el elemento 0 en una lista que contiene tanto números positivos como negativos.

#### Prueba 12
*Nombre de prueba:* equalList - Positive Test 12
*Entrada:* List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5), 6
*Salida esperada:* Nil
*Objetivo:* Verificar si la función equalList devuelve una lista vacía cuando el elemento buscado no está presente en una lista que
contiene tanto números positivos como negativos.


2. **greaterList**:
   - Esta función realiza una operación similar al algoritmo "equalList", pero en lugar de devolver elementos iguales al pivote, 
devuelve aquellos que son mayores que el pivote. Utiliza una estructura de coincidencia de patrones para recorrer la lista y
comparar cada elemento con el pivote. Los elementos que superan al pivote se agregan a una lista nueva, y el proceso continúa
recursivamente hasta que se agota la lista original.

#### Prueba 1
*Nombre de prueba:* greaterList - Positive Test 1
*Entrada:* List(1, 2, 3), 2
*Salida esperada:* List(3)
*Objetivo:* Verificar si la función greaterList devuelve correctamente el elemento mayor que 2 en una lista dada.

#### Prueba 2
*Nombre de prueba:* greaterList - Positive Test 2
*Entrada:* List(5, 5, 5, 5), 4
*Salida esperada:* List(5, 5, 5, 5)
*Objetivo:* Confirmar que la función greaterList devuelve correctamente todos los elementos mayores o iguales a 4 en una lista dada.

#### Prueba 3
*Nombre de prueba:* greaterList - Positive Test 3
*Entrada:* List(1, 2, 3), 0
*Salida esperada:* List(1, 2, 3)
*Objetivo:* Comprobar si la función greaterList devuelve la lista completa cuando se busca un elemento mayor o igual a 0.

#### Prueba 4
*Nombre de prueba:* greaterList - Positive Test 4
*Entrada:* List(), 5
*Salida esperada:* Nil
*Objetivo:* Verificar si la función greaterList devuelve una lista vacía cuando se le pasa una lista vacía como entrada.

#### Prueba 5
*Nombre de prueba:* greaterList - Positive Test 5
*Entrada:* List(5, 6, 7, 8), 1
*Salida esperada:* List(5, 6, 7, 8)
*Objetivo:* Asegurar que la función greaterList devuelve la lista completa cuando se busca un elemento mayor o igual a 1.

#### Prueba 6
*Nombre de prueba:* greaterList - Positive Test 6
*Entrada:* List(-1, -2, -3), -2
*Salida esperada:* List(-1)
*Objetivo:* Verificar si la función greaterList maneja correctamente números negativos devolviendo el elemento mayor que -2 en la lista dada.

#### Prueba 7
*Nombre de prueba:* greaterList - Positive Test 7
*Entrada:* List(-5, -5, -5, -5), -6
*Salida esperada:* List(-5, -5, -5, -5)
*Objetivo:* Confirmar que la función greaterList devuelve correctamente todos los elementos mayores o iguales a -6 en una lista de números negativos.

#### Prueba 8
*Nombre de prueba:* greaterList - Positive Test 8
*Entrada:* List(-1, -2, -3, -4), -4
*Salida esperada:* List(-1, -2, -3)
*Objetivo:* Verificar si la función greaterList devuelve correctamente los elementos mayores que -4 en una lista de números negativos.

#### Prueba 9
*Nombre de prueba:* greaterList - Positive Test 9
*Entrada:* List(), -5
*Salida esperada:* Nil
*Objetivo:* Confirmar que la función greaterList devuelve una lista vacía cuando se le pasa una lista vacía como 
entrada en una lista de números negativos.

#### Prueba 10
*Nombre de prueba:* greaterList - Positive Test 10
*Entrada:* List(-5, -6, -7, -8), -10
*Salida esperada:* List(-5, -6, -7, -8)
*Objetivo:* Verificar si la función greaterList devuelve la lista completa cuando se busca un elemento
mayor o igual a -10 en una lista de números negativos.

#### Prueba 11
*Nombre de prueba:* greaterList - Positive Test 11
*Entrada:* List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5), 0
*Salida esperada:* List(1, 2, 3, 4, 5)
*Objetivo:* Asegurar que la función greaterList devuelve correctamente los elementos mayores que 0 en una lista que contiene 
tanto números positivos como negativos.

#### Prueba 12
*Nombre de prueba:* greaterList - Positive Test 12
*Entrada:* List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5), 6
*Salida esperada:* Nil
*Objetivo:* Verificar si la función greaterList devuelve una lista vacía cuando no hay elementos mayores que 6 en una lista que contiene tanto números 
positivos como negativos.


3. **lowerList**:
   - Al igual que las anteriores, esta función trabaja sobre una lista de enteros, pero devuelve aquellos elementos que son menores 
que el pivote dado. Utiliza una lógica similar a "greaterList" pero se centra en encontrar elementos menores que el pivote. 
Opera recursivamente para examinar cada elemento de la lista original y construir una nueva lista que contenga solo los elementos menores al pivote.

#### Prueba 1
*Nombre de prueba:* lowerList - Positive Test 1
*Entrada:* List(1, 2, 3), 2
*Salida esperada:* List(1)
*Objetivo:* Verificar si la función lowerList devuelve correctamente el elemento menor que 2 en una lista dada.

#### Prueba 2
*Nombre de prueba:* lowerList - Positive Test 2
*Entrada:* List(5, 5, 5, 5), 6
*Salida esperada:* List(5, 5, 5, 5)
*Objetivo:* Confirmar que la función lowerList devuelve la lista completa cuando no hay elementos menores que 6 en una lista dada.

#### Prueba 3
*Nombre de prueba:* lowerList - Positive Test 3
*Entrada:* List(1, 2, 3), 4
*Salida esperada:* List(1, 2, 3)
*Objetivo:* Comprobar si la función lowerList devuelve la lista completa cuando no hay elementos menores que 4 en una lista dada.

#### Prueba 4
*Nombre de prueba:* lowerList - Positive Test 4
*Entrada:* List(), 5
*Salida esperada:* Nil
*Objetivo:* Verificar si la función lowerList devuelve una lista vacía cuando se le pasa una lista vacía como entrada.

#### Prueba 5
*Nombre de prueba:* lowerList - Positive Test 5
*Entrada:* List(5, 6, 7, 8), 1
*Salida esperada:* Nil
*Objetivo:* Asegurar que la función lowerList devuelve una lista vacía cuando no hay elementos menores que 1 en una lista dada.

#### Prueba 6
*Nombre de prueba:* lowerList - Positive Test 6
*Entrada:* List(-1, -2, -3), -2
*Salida esperada:* List(-3)
*Objetivo:* Verificar si la función lowerList maneja correctamente números negativos devolviendo el elemento menor que -2 en la lista dada.

#### Prueba 7
*Nombre de prueba:* lowerList - Positive Test 7
*Entrada:* List(-5, -5, -5, -5), -4
*Salida esperada:* List(-5, -5, -5, -5)
*Objetivo:* Confirmar que la función lowerList devuelve la lista completa cuando no hay elementos menores que -4 en una lista de números negativos.

#### Prueba 8
*Nombre de prueba:* lowerList - Positive Test 8
*Entrada:* List(-1, -2, -3), -4
*Salida esperada:* Nil
*Objetivo:* Verificar si la función lowerList devuelve una lista vacía cuando no hay elementos menores que -4 en una lista de números negativos.

#### Prueba 9
*Nombre de prueba:* lowerList - Positive Test 9
*Entrada:* List(), -5
*Salida esperada:* Nil
*Objetivo:* Confirmar que la función lowerList devuelve una lista vacía cuando se le pasa una lista vacía como entrada en una lista de números negativos.

#### Prueba 10
*Nombre de prueba:* lowerList - Positive Test 10
*Entrada:* List(-5, -6, -7, -8), -1
*Salida esperada:* List(-5, -6, -7, -8)
*Objetivo:* Verificar si la función lowerList devuelve la lista completa cuando se busca un elemento menor que -1 en una lista de números negativos.

#### Prueba 11
*Nombre de prueba:* lowerList - Positive Test 11
*Entrada:* List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5), 0
*Salida esperada:* List(-5, -4, -3, -2, -1)
*Objetivo:* Asegurar que la función lowerList devuelve correctamente los elementos menores que 0 en una lista 
que contiene tanto números positivos como negativos.

#### Prueba 12
*Nombre de prueba:* lowerList - Positive Test 12
*Entrada:* List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5), -6
*Salida esperada:* Nil
*Objetivo:* Verificar si la función lowerList devuelve una lista vacía cuando no hay elementos menores que -6 en una 
lista que contiene tanto números positivos como negativos.


4. **updatedQuickSort**:
   - Este algoritmo implementa una versión actualizada del algoritmo de ordenación rápida (QuickSort). 
Utiliza las funciones "lowerList", "equalList" y "greaterList" para dividir la lista original en tres partes: 
elementos menores que el pivote, elementos iguales al pivote y elementos mayores que el pivote.
Luego, concatena recursivamente estas partes ordenadas para producir la lista final ordenada. 
Este enfoque divide y conquista permite ordenar eficientemente la lista original en lugar de reorganizarla directamente.

#### Prueba 1
*Nombre de prueba:* updatedQuickSort - Positive Test 1
*Entrada:* List(1, 4, 2, 5, 7, 23, 5, 1, 3, 5)
*Salida esperada:* List(1, 1, 2, 3, 4, 5, 5, 5, 7, 23)
*Objetivo:* Verificar si la función updatedQuickSort ordena correctamente una lista desordenada.

#### Prueba 2
*Nombre de prueba:* updatedQuickSort - Positive Test 2
*Entrada:* List(5, 4, 3, 2, 1)
*Salida esperada:* List(1, 2, 3, 4, 5)
*Objetivo:* Confirmar que la función updatedQuickSort ordena correctamente una lista ordenada de forma inversa.

#### Prueba 3
*Nombre de prueba:* updatedQuickSort - Positive Test 3
*Entrada:* List(1)
*Salida esperada:* List(1)
*Objetivo:* Comprobar si la función updatedQuickSort maneja correctamente una lista de un solo elemento.

#### Prueba 4
*Nombre de prueba:* updatedQuickSort - Positive Test 4
*Entrada:* List()
*Salida esperada:* Nil
*Objetivo:* Verificar si la función updatedQuickSort devuelve una lista vacía cuando se le pasa una lista vacía como entrada.

#### Prueba 5
*Nombre de prueba:* updatedQuickSort - Positive Test 5
*Entrada:* List(1, 1, 1, 1, 1)
*Salida esperada:* List(1, 1, 1, 1, 1)
*Objetivo:* Asegurar que la función updatedQuickSort maneja correctamente una lista con elementos repetidos.

#### Prueba 6
*Nombre de prueba:* updatedQuickSort - Positive Test 6
*Entrada:* List(-1, -4, -2, -5, -7, -23, -5, -1, -3, -5)
*Salida esperada:* List(-23, -7, -5, -5, -5, -4, -3, -2, -1, -1)
*Objetivo:* Verificar si la función updatedQuickSort ordena correctamente una lista de números negativos desordenada.

#### Prueba 7
*Nombre de prueba:* updatedQuickSort - Positive Test 7
*Entrada:* List(-5, -4, -3, -2, -1)
*Salida esperada:* List(-5, -4, -3, -2, -1)
*Objetivo:* Confirmar que la función updatedQuickSort ordena correctamente una lista de números negativos ordenada de forma inversa.

#### Prueba 8
*Nombre de prueba:* updatedQuickSort - Positive Test 8
*Entrada:* List(-1)
*Salida esperada:* List(-1)
*Objetivo:* Comprobar si la función updatedQuickSort maneja correctamente una lista de un solo elemento negativo.

#### Prueba 9
*Nombre de prueba:* updatedQuickSort - Positive Test 9
*Entrada:* List(-5, -5, -5, -5, -5)
*Salida esperada:* List(-5, -5, -5, -5, -5)
*Objetivo:* Asegurar que la función updatedQuickSort maneja correctamente una lista de números negativos repetidos.

#### Prueba 10
*Nombre de prueba:* updatedQuickSort - Positive Test 10
*Entrada:* List(-10, -5, -7, -3, -2, -1)
*Salida esperada:* List(-10, -7, -5, -3, -2, -1)
*Objetivo:* Verificar si la función updatedQuickSort ordena correctamente una lista de números negativos desordenada.

#### Prueba 11
*Nombre de prueba:* updatedQuickSort - Positive Test 11
*Entrada:* List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5)
*Salida esperada:* List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5)
*Objetivo:* Confirmar que la función updatedQuickSort ordena correctamente una lista que contiene tanto números positivos como negativos.

#### Prueba 12
*Nombre de prueba:* updatedQuickSort - Positive Test 12
*Entrada:* List(5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5)
*Salida esperada:* List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5)
*Objetivo:* Verificar si la función updatedQuickSort ordena correctamente una lista que contiene tanto números positivos como negativos en desorden.
