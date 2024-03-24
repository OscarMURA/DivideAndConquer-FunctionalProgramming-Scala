En el Método de Particionamiento Balanceado, se emplea el algoritmo de ordenación Quicksort de tres particiones. En este enfoque, la lista se divide en tres secciones distintas: una que contiene elementos menores que el pivote, otra con elementos iguales al pivote y la última con elementos mayores que el pivote. El análisis de la complejidad temporal para el Quicksort de tres particiones guarda similitudes con el Quicksort de dos particiones. En ambos casos, se emplean recurrencias para describir el tiempo de ejecución del algoritmo. Se debe tener en cuenta que cuando no hay elementos iguales al pivote, o cuando la gran mayoría de ellos son exactamente iguales al pivote, la lista de iguales resulta trivial de manejar. En tales casos, solo será necesario ordenar la lista de elementos mayores y/o menores. Por lo tanto, el análisis de la complejidad será similar al del Quicksort de dos particiones, con un tiempo promedio y balanceado de ejecución de $O(n \log n)$.


<a href="https://ibb.co/sj7xcb5"><img src="https://i.ibb.co/jht0qbV/Quick-Sort-Time-Complexity-Image.jpg" alt="Quick-Sort-Time-Complexity-Image" border="0"></a>


