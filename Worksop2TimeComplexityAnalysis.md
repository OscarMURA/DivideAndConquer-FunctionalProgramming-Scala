La complejidad algorítmica de $QuickSort$ será determinanda de acuerdo a la distribución inicial de los elementos en la lista a ser ordenada, y la elección del pivote. Lo anterior, tomando en cuenta que se darán los siguientes casos de acuerdo al particionamiento de la lista:

**Peor caso de Particionamiento**

El peor caso para $quicksort$ con 3 particionamientos, ocurre cuando el  algoritmo de particionamiento produce un subproblema con  $n-1$ elementos y uno con 0 elementos; esto es las dos sublistas que faltan por ser ordenadas, ya que la lista de iguales no demanda una complejidad de ordenamiento.

Asumamos que este particionamiento desbalanceado surge en cada llamada recursiva. El costo de particionamiento es $Θ(n)$. Dado que la llamada recursiva en un arreglo de tamaño 0 simplemente retorna, $T(0)=O(1)$, y la recurrencia para el tiempo de ejecución estara determinada por:

$T(n)=T(n-1)+T(0)+Θ(n)$

Intuitivamente, si sumamos los costos incurridos en cada nivel de la recursión, obtenemos una serie aritmética, que evalúa a $Θ(n^2)$. Es decir, que si el partiocnamiento se encuentra severamente desbalanceado en cada nivel resursivo del algoritmo, se obtendrá un complejidad de $Θ(n^2)$.


**Mejor Caso de Particionamiento Utilizando el Método Maestro**

En el mejor caso de particionamiento para el algoritmo Quicksort de 3 particiones, cada llamada recursiva produce tres subproblemas (listas menores, iguales, y mayores en comparación con el pivote), donde la lista se divide en tres particiones de tamaño aproximadamente $ \frac{n}{3} $ cada una. Además debe tomarse en cuenta que en el mejor caso, estas listas estan parcialmente ordenadas, por lo el tiempo de ordenación de las tres listas es lo más aproximado posible. Posteriormente, se realiza un tiempo lineal de trabajo para particionar y combinar estas particiones, pudiendose expresar en la formula de recurrencia:


$T(n) = 3T(n/3) + \Theta(n)$


1. **Fórmula de Recursión**:
La fórmula de recursión describe la relación entre el tiempo de ejecución total $T(n)$ y los tiempos de ejecución de las llamadas recursivas.

2. **Identificación del Término Dominante**:
En este caso, el término dominante es $n$, ya que el tiempo de particionamiento lineal $ \Theta(n)$ en cada nivel de recursión es el factor más significativo en la complejidad temporal.


La anterior formula de recursión puede resolverse por medio del método maestro:


$T(n) = 3T(n/3) + \Theta(n)$

En donde 

* $f(n)=\theta(n)$
* $a=3$
* $b=3$

Conocemos cual condición cumple: 

Comparamos con la primera condición:

Caso 1:

Si $n= O(n^{log_{3} 3 -e})$, para e>0

Entonces: $T(n)=Θ(n^{log_{b} a})$

Para este caso no existiria ningun $e$ tal que reste $log_{3} 3$ y me de como resultado el $n$

Caso 2:

Si $n=  Θ(n^{log_{3} 3 })$, para e>0

Entonces:  $T(n)=Θ(n^{log_{b} a} log n)$

Para este caso puede observarse que la igualdad se satisface que ya $n^{log_{3} 3 }= n^{1}$, y f(n)= n, razón por lo cual la complejidad para el mejor caso es:
$T(n)=Θ(n^{log_{3} 3} log n)$= $T(n)=Θ(n^{1}log n)$ = $T(n)=Θ(n \log n)$


En el mejor caso de particionamiento para Quicksort de 3 particiones, el tiempo de ejecución es proporcional a $ n \log n $, lo que indica una complejidad temporal eficiente en condiciones ideales de particionamiento.

**Caso de Particionamiento Balanceado**

En el Caso del Particionamiento Balanceado, el algoritmo produce dos subproblemas equilibrados en cada llamada recursiva, donde los elementos se distribuyen de manera uniforme entre los tres subarreglos, es decir que la lista de menores, iguales, y mayores tiene un tamaño de $\frac{1}{3}$ en comparación con la lista en la cual se efectuo el llamado recursivo. De lo anterior puede tomarse en cuenta  que la lista de iguales al pivote supone una solución trivial -ya que una lista de iguales no necesita ser ordenada-, así como que la lista de menores y mayores comparados con el pivote contiene elementos que no pueden garantizarse ordenados. Por lo anterior, la recurrencia para el tiempo de ejecución queda determinado por:


$T(n)=2T(n/3)+Θ(n)$ 


La anterior recurrencia puede resolverse por medio del método maestro en su tercer caso:

Si $f(n)=𝝮(n^{log_b a + e})$, para $e>0$ y si $af(n/b)\leq cf(n)$ para algun $c<1$

entonces $T(n)=Θ(f(n))$

Conodicendo los parámetros de mi recurrencia:

$a=2$

$b=3$

$f(n)=Θ(n)$

Probamos las condiciones para el 3 caso:


$n=n^{log_3 2 + e}$

$1={log_3 2 + e}$

$1 -log_{3} 2 =e$

$e≈ 0.369$

Para c:

$2(\frac{n}{3})\leq c(n)$
a
$\frac{1}{n}2(\frac{n}{3})\leq c(n) \frac{1}{n}$


$(\frac{2}{3})\leq c$

$0.666\leq c$

Así pudiendose afirmar que en el mejor caso el quicksort con 3 particiones tiene una complejidad algortimica tendiente a:

$T(n)=Θ(n)$









