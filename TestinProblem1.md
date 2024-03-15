# Pruebas del algoritmo 1 - Cantidad de Inversiones
Este algoritmo cuenta la cantidad de inversiones necesarias para ordenar de forma ascendente una lista. Para hacer esto el algoritmo cuenta que elementos de la cola son menores que la cabeza, y se repite recursivamente con la cola de la lista. Se detiene una vez llega a la cola de la lista.

#### Prueba 1

**Nombre de prueba: Inversiones en lista no ordenada 1**

**Entrada:** List(4, 2, 1, 3, 5, 7)

**Salida esperada:** 4

**Objetivo:** Verificar el correcto funcionamiento en una lista no ordenada.

#### Prueba 2

**Nombre de prueba: Inversiones en lista no ordenada 2**

**Entrada:** List(2, 3, 9, 2, 9)

**Salida esperada:** 2

**Objetivo:** Verificar el correcto funcionamiento en una lista no ordenada.

#### Prueba 3

**Nombre de prueba: Inversiones en lista ordenada de manera descendente**

**Entrada:** List(5, 4, 3, 2, 1)

**Salida esperada:** 10

**Objetivo:** Verificar el correcto funcionamiento en una lista ordenada de manera descendente.

#### Prueba 4

**Nombre de prueba: Inversiones en lista ordenada de manera ascendente*

**Entrada:** List(0, 1, 2, 3, 4, 5)

**Salida esperada:** 0

**Objetivo:** Verificar el correcto funcionamiento en una lista ordenada.

#### Prueba 5
**Nombre de prueba: Inversiones en lista ordenada de manera descendente**

**Entrada:** List(4, 3, 2, 1)

**Salida esperada:** 6

**Objetivo:** Verificar el correcto funcionamiento en una lista ordenada de manera descendente.

#### Prueba 6

**Nombre de prueba: Inversiones en lista vacía*

**Entrada:** List()

**Salida esperada:** 0

**Objetivo:** Verificar el correcto funcionamiento en una lista vacía.

#### Prueba 7

**Nombre de prueba: Inversiones en lista de un elemento**

**Entrada:** List(1)

**Salida esperada:** 0

**Objetivo:** Verificar el correcto funcionamiento en una lista de un solo elemento.

#### Prueba 8

**Nombre de prueba: Inversiones en lista de dos elementos**

**Entrada:** List(2, 1)

**Salida esperada:** 1

**Objetivo:** Verificar el correcto funcionamiento en una lista de dos elementos.

#### Prueba 9

**Nombre de prueba: Inversiones en lista de elementos repetidos descendentes**

**Entrada:** List(2, 2, 1, 1)

**Salida esperada:** 4

**Objetivo:** Verificar el correcto funcionamiento en una lista de elementos repetidos descendentes

#### Prueba 10

**Nombre de prueba: Inversiones en lista de elementos repetidos ascendentes**

**Entrada:** List(1, 1, 2, 2)

**Salida esperada:** 0

**Objetivo:** Verificar el correcto funcionamiento en una lista de elementos repetidos ordenados
