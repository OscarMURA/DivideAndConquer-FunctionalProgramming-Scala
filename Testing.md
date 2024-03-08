
# Pruebas del algoritmo 3 BuscketSort:

Este algoritmo lo que hace es contar la cantidad de inversiones necesarias para ordenar de forma ascendente una lista. Para hacer esto el algoritmo cuenta que elementos de la cola son menores que la cabeza de la lista, y se repite recursivamente con la cola de la lista.

#### Prueba 1-BuscketSort
***Nombre de prueba:***
***Entrada:*** List(4.3, 2.1, 9.8, 1.5, 6.7)
***Salida esperada:*** List(1.5, 2.1, 4.3, 6.7, 9.8)
***Objetivo:*** Verificar el correcto funcionamiento en una lista desordenada de números positivos
#### Prueba 2-BuscketSort
***Entrada:*** List(-3.2, 5.7, -1.1, 8.9, 0.5)
***Salida esperada:*** List(-3.2, -1.1, 0.5, 5.7, 8.9)
***Objetivo:*** Verificar el correcto funcionamiento en una lista desordenada de números negativos y positivos
#### Prueba 3-BuscketSort
***Entrada:*** List(3.2, 1.5, 3.2, 2.1, 2.1)
***Salida esperada:*** List(1.5, 2.1, 2.1, 3.2, 3.2)
***Objetivo:*** Verificar el correcto funcionamiento en una lista con duplicados

#### Prueba 4-BuscketSort
***Entrada:*** List()
***Salida esperada:*** List()
***Objetivo:*** Verificar el correcto funcionamiento en una Lista vacía
#### Prueba 5-BuscketSort
***Entrada:*** List(10.0)
***Salida esperada:*** List(10.0)
***Objetivo:*** Verificar el correcto funcionamiento en una lista con un solo elemento
#### Prueba 6-BuscketSort
***Entrada:*** List(1.0, 2.0, 3.0, 4.0, 5.0)
***Salida esperada:*** List(1.0, 2.0, 3.0, 4.0, 5.0)
***Objetivo:*** Verificar el correcto funcionamiento en una Lista ya ordenada
#### Prueba 7-BuscketSort
***Entrada:*** List(5.0, 4.0, 3.0, 2.0, 1.0)
***Salida esperada:*** List(1.0, 2.0, 3.0, 4.0, 5.0)
***Objetivo:*** Verificar el correcto funcionamiento en una Lista en orden inverso