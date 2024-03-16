La complejidad algorítmica de $QuickSort$ será determinanda de acuerdo a la distribución inicial de los elementos en la lista a ser ordenada, y la elección del pivote. Lo anterior, tomando en cuenta que se darán los siguientes casos de acuerdo al particionamiento de la lista:

**Peor caso de Particionamiento**

El peor caso para $quicksort$ con 3 particionamientos, ocurre cuando el  algoritmo de particionamiento produce un subproblema con  $n-1$ elementos y uno con 0 elementos; esto es las dos sublistas que faltan por ser ordenadas, ya que la lista de iguales no demanda una complejidad de ordenamiento.

Asumamos que este particionamiento desbalanceado surge en cada llamada recursiva. El costo de particionamiento es $Θ(n)$. Dado que la llamada recursiva en un arreglo de tamaño 0 simplemente retorna, $T(0)=Θ(1)$, y la recurrencia para el tiempo de ejecución estara determinada por:

$T(n)=T(n-1)+T(0)+Θ(n)$

Intuitivamente, si sumamos los costos incurridos en cada nivel de la recursión, obtenemos una serie aritmética, que evalúa a $Θ(n^2)$. Es decir, que si el partiocnamiento se encuentra severamente desbalanceado en cada nivel resursivo del algoritmo, se obtendrá un complejidad de $Θ(n^2)$.

**Mejor Caso de Particionamiento - Metodo maestro**

En el mejor caso, el algoritmo produce dos subproblemas equilibrados en cada llamada recursiva, donde los elementos se distribuyen de manera uniforme entre los tres subarreglos. En este caso, tomando en cuenta que la lista de iguales ya se encuentra ordenada, y no supone un subproblema, la recurrencia para el tiempo de ejecución queda determinado por:

$T(n)=2T(n/3)+Θ(n)$

La anterior recurrencia puede resolverse por medio del método maestro en su tercer caso:

Si $f(n)=𝝮(n^{log_b a + e})$, para $e>0$ y si $af(n/b)\leq cf(n)$ para algun $c<1$

entonces $T(n)=Θ(f(n))$

Conociendo los parámetros de mi recurrencia:

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

$\frac{1}{n}2(\frac{n}{3})\leq c(n) \frac{1}{n}$


$(\frac{2}{3})\leq c$

$0.666\leq c$

Así podemos afirmar que en el mejor caso el quicksort con 3 particiones tiene una complejidad algortimica que tiende a:

$T(n)=Θ(n)$


**Particionamiento Balanceado**

En el caso promedio, QuickSort con tres particiones produciría una mezcla de particiones "balanceadas" y "desbalanceadas" en cada nivel de recursión. En una ejecución promedio del algoritmo, las particiones estarían distribuidas de manera aleatoria a lo largo del árbol de recursión. La intuición aquí es similar a la del QuickSort con dos particiones, donde la ejecución promedio se acerca más al mejor caso que al peor caso. La distribución aleatoria de las particiones equilibraría el tiempo de ejecución y llevaría a una complejidad promedio de $Θ((n)log(n))$

**Mejor Caso de Particionamiento - Arbol de recursion**

![Captura de pantalla](ruta/a/Captura de pantalla 2024-03-16 151447.png)

Primero calculamos la altura del arbol:

Podemos observar que el arbol sigue una secuencia de potencias de 3 en su denominador, entonces:

$\frac{n}{3^{i}}=1$

Pasamos la $n$ a multiplicar:

$n=3^{i}$

Y sacamos el logaritmo base 3 de ambos lados y obtenemos la altura:

$log_{3} n=i$

Ahora, obteniendo esto, calculamos la complejidad:

$Total = \sum_{i=0}^{log_3n}\left ( \frac{2}{3} \right )^{i}n = $

Sacamos la n de la sumatoria:

$n\sum_{i=0}^{log_3n}\left ( \frac{2}{3} \right )^{i}$

Y calculamos:

$Total = n\cdot \frac{1-(\frac{2}{3})^{log_{3}(n+1)}}{1-(\frac{2}{3})}$

Y su resultado es:

$T(n)=Θ(n)$

La misma que en el metodo maestro.



