**Prueba por Inducción de QuickSort de 3 Particiones**

Llamamos a la función QuickSort de 3 Particiones: $QSThree(A,n)$, donde $n$ es el tamaño de $A$, una lista de números enteros.

**Caso Base**:

$QSThree(A,0)$

$QSThree(B,1)$

funciona para listas de 1 o 0 elementos ya que son soluciones triviales: listas que no necesitan ser ordenadas

**Paso Inductivo**

Para todo $n \geq 2$ se debe probar que pruebe que

Si $QSThree(A,k)$ es válido para para todo k menores que n, entonces se comprueba la verdacidad de $QSThree(A,k)$.

**Hipótesis Inductiva**: $QSThree(A,k)$ es valido para para todo k menores que n y $n\geq 2$

Conociendo que $QSThree(A,k)$ partirá a $A$ en tres sublistas $L$ (todos los elementos menores que el pivote), $E$ (todos los elementos iguales que el pivote), $G$ (todos los elementos mayores que el pivote)

Tomando en cuenta lo anterior, sean $k_1$, $k_2$, $k_3$ el tamaño de estas particiones respectivamente $L$, $E$, $G$. Conocemos que $k_1, k_2, k_3 \leq n$, son estrictamente menores que $n$

Por hipótesis inductiva para $k_1, k_2, k_3 \leq n$, $QSThree$ no efectúa errores, es decir que ordena correctamente por llamadas recursivas.

Sucediendo lo anterior para todas las llamadas recursivas hasta que la lista quede completamente ordenada

Quedando así demostrado por inducción que algoritmo $QSThree(A,n)$ es valido para para todo n greater than or equal to 2
