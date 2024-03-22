**Prueba por Inducción de QuickSort de 3 Particiones**


Llamamos a la función QuickSort de 3 Particiones: $QSThree($Α$,n)$, donde $n$ es el tamaño de $Α$, una lista de números enteros.

**Caso Base**: 

$QSThree($Α$,0)$

$QSThree($β$,1) $

funciona para listas de 1 o 0 elementos ya que son soluciones triviales: listas que no necesitan ser ordenadas



**Paso Inductivo** 

Para todo $n \geq 2 $ se debe probar que pruebe que

Si $QSThree(Α,k)$ es válido para $\forall k<n$, entonces se comprueba la verdacidad de $QSThree(A,k)$. 

**Hipotesis Inductiva**: $QSThree(A,k)$ es valido para $\forall k<n$ y $n\geq 2$ 


Conociendo que $QSThree(Α,k)$ partirá a $Α$ en tres sublistas $L$ (todos los elmentos menores que el pivote), $E$ (todos los elementos iguales que el pivote), $G$ (todos los elementos mayores que el pivote)

Tomando en cuenta lo anterior, sean $k_1$, $k_2$, $k_3$ el tamaño de estas particiones respectivamente $L$, $E$, $G$. Conocemos que $k_1, k_2, k_3 \leq  n$, son estrictamente menores que $n$

Por hipotesis inductiva para $k_1, k_2, k_3 \leq  n$ $QSThree$ no efectua errores, es decir que ordena correctamente por llamadas recursivas.

Sucediendo lo anterior para todas las llamadas recurivas hasta que la lista quede completamente ordenada

Quedando asi demostrado por inducción que algortimo  $QSThree(A,n)$ es valido para $\forall n\geq 2$ 

 


