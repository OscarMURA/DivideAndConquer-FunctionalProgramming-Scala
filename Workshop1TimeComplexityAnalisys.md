La complejidad algorítmica para contar inversiones en el algoritmo "countInversions" implementado en Scala se basa en el algoritmo de ordenamiento por mezcla (Merge Sort). La cantidad de inversiones en una lista se determina por la cantidad de veces que se intercambian elementos durante el proceso de ordenamiento.

**Algoritmo de Ordenamiento por Mezcla (Merge Sort)**

El algoritmo de ordenamiento por mezcla divide repetidamente la lista en sublistas más pequeñas, las ordena y luego las fusiona para obtener la lista ordenada. En cada fusión, se cuenta el número de inversiones, es decir, el número de pares de elementos que están fuera de orden.

**Complejidad del Merge Sort mediante el Método Maestro**

La complejidad del Merge Sort se puede analizar mediante el Método Maestro, que proporciona una forma de analizar la recurrencia de Divide y Vencerás.

Para el Merge Sort, la recurrencia se puede expresar como:

$$[ T(n) = 2T(n/2) + Θ(n) ]$$

Donde:

- ( T(n) ) es el tiempo de ejecución para ordenar una lista de tamaño \( n ).
- ( 2T(n/2) ) es el tiempo de ejecución para ordenar las dos mitades de la lista.
- ( Θ(n) ) es el tiempo de fusión, que depende linealmente del tamaño de la lista.

Aplicando el Método Maestro, identificamos que ( a = 2 ) (dos llamadas recursivas), ( b = 2 ) (la lista se divide en dos partes iguales) y ( f(n) = Θ(n) ) (tiempo de fusión).

Entonces, según el Método Maestro, la complejidad del Merge Sort es ( Θ(n log n) ).

Por lo tanto, el algoritmo "countInversions" implementado con Merge Sort tiene una complejidad algorítmica de Θ(n log (n)), donde ( n ) es el tamaño de la lista.

**Complejidad del Merge Sort mediante el arbol de recursión**

En el árbol de recursión se puede ver como en el primer nivel hay una complejidad de $n$, en el segundo nivel hay dos ramas, cada una con complejidad $\frac{n}{2}$ y en el tercer nivel hay 4 ramas de complejidad $\frac{n}{4}$.

Nivel 0: $$n$$

Nivel 1: $$\frac{n}{2} \frac{n}{2}$$

Nivel 2: $$\frac{n}{4} \frac{n}{4} \frac{n}{4} \frac{n}{4}$$

$$...$$

Elemento en el nivel i: $$\frac{n}{2^i}$$

igualamos este elemento a 1 para obtener la altura

$$\frac{n}{2^i}=1$$
$$n=2^i$$
$$log_2n=i$$

Luego hacemos la sumatoria

$$\sum_{i=0}^{log_2n}2^i\frac{n}{2^i}$$

$$n\sum_{i=0}^{log_2n}\frac{2^i}{2^i}$$

$$n\sum_{i=0}^{log_2n}1$$

$$nlog_2(n)$$

Por arbol de recursión la complejidad también es de $nlog_2(n)$.