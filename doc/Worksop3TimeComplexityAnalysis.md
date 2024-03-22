**Bucket Sort (Ordenamiento por Bins o por Cubetas)**

Bucket Sort es un algoritmo de ordenamiento que clasifica los elementos de una lista dividiéndolos en varios 'buckets' o cubetas,
luego ordena individualmente cada cubeta, y finalmente concatena los resultados para obtener la lista ordenada completa. 
Es particularmente eficiente cuando se sabe que los elementos de la lista están uniformemente distribuidos dentro de un rango específico.

Abordaje en el código

Inicialización de Buckets: El código comienza inicializando una lista de buckets vacíos, donde el número de buckets es igual al tamaño de la lista de entrada.

Distribución de Elementos en los Buckets: Luego, cada elemento de la lista de entrada se asigna a un bucket correspondiente, 
de acuerdo a su valor y la distribución uniforme de los elementos en el rango.

Ordenación de los Buckets: Después de la distribución, cada bucket se ordena individualmente. En este caso, 
se utiliza el algoritmo Merge Sort para ordenar los elementos dentro de cada bucket.

Concatenación de Resultados: Finalmente, los elementos ordenados de cada bucket se concatenan para obtener la lista ordenada completa.

El análisis del algoritmo de ordenamiento de Bucket Sort se puede desglosar en cuatro componentes principales, 
que contribuyen a su tiempo de ejecución total, expresado por la fórmula $T(n) = O(n) + O(n) + O(n) + O(n * (k \log(k)))$, donde:

$O(n)$: Representa las operaciones que tienen una complejidad lineal respecto al tamaño de la entrada $(n)$. 
Estas operaciones estan determinadas en las siguientes operaciones:
* Determinar el valor máximo y mínimo en la lista de entrada
* Inicializar los buckets con listas vacías
* Distribuir los elementos en los buckets 

$O(n * (k \log(k)))$: Representa las operaciones relacionadas con la ordenación de los elementos dentro de los buckets.
Esta parte del tiempo de ejecución depende del tamaño promedio de los buckets $(k)$ y se debe a la aplicación del algoritmo de ordenación Merge Sort en cada uno de ellos.

