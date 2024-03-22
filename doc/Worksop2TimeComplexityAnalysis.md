En el Método de Particionamiento Balanceado, se implementa el algoritmo de ordenación Quicksort de tres particiones, donde la lista se divide en tres secciones distintas: una conteniendo elementos menores que el pivote, otra con elementos iguales al pivote y la última con elementos mayores que el pivote. En el análisis que realizamos, nos enfocamos en lograr una división balanceada, donde la lista se divide aproximadamente en una proporción de $(100 - p)$ a $p$. Esto implica que alrededor del $(100 - p)\%$ de los elementos se distribuyen entre una de las listas (mayores o menores que el pivote), mientras que el $p\%$ restante se coloca en la lista de elementos iguales al pivote.

Aquí, $p$ representa el porcentaje de elementos que se distribuyen en una de las sublistas (mayores o menores que el pivote), mientras que $(100 - p)$ representa el porcentaje de elementos que se distribuyen en la otra sublista. Esta generalización nos permite ajustar la proporción de división de la lista según sea necesario sin comprometer la lógica del análisis.

En este contexto, consideramos que las particiones son "buenas" si la división de la lista se realiza de manera equilibrada, es decir, donde los elementos se distribuyen uniformemente entre las sublistas menores y mayores al pivote. Por otro lado, las particiones son consideradas "malas" cuando la división no es equitativa, lo que resulta en una lista muy desequilibrada, con una gran cantidad de elementos en una sublista y muy pocos en la otra.

El análisis de complejidad temporal para el Quicksort de tres particiones se asemeja al del Quicksort de dos particiones. En ambos casos, se utilizan recurrencias para describir el tiempo de ejecución del algoritmo. 


<a href="https://ibb.co/sj7xcb5"><img src="https://i.ibb.co/jht0qbV/Quick-Sort-Time-Complexity-Image.jpg" alt="Quick-Sort-Time-Complexity-Image" border="0"></a>


El análisis de complejidad temporal se aplica de manera similar al Quicksort de tres particiones debido a que la subdivisión de elementos iguales al pivote supone un subproblema trivial que no requiere reorganización. Por lo tanto, el tiempo de ejecución sigue siendo $O(n \log n)$ en promedio, incluso si algunas divisiones son desequilibradas, ya que se compensan con divisiones equilibradas en otros niveles del árbol de recursión. Esto se debe a la distribución aleatoria de las divisiones a lo largo del árbol de recursión, lo que mantiene el tiempo de ejecución promedio del algoritmo en $O(n \log n)$.
