# Inducción estructural algoritmo 1 : método merge
**Paso Base:** Si se van a combinar dos listas y una está vacía (tamaño **0**), entonces no hay inversiones.

**P(n, 0)** = 0
**P(0, m)** = 0

siendo n y m tamaños de listas.

**Paso Inductivo:** Asumimos que el algoritmo **P(n, m)** combina correctamente hasta listas de tamaño **a** y **b** de elementos, es decir, tomamos como cierto **P(a, b)** y todos los anteriores. Además asumamos que $(a,b)\le k$.

o bien
**P(n, m):** P(n-1, m)
o bien
**P(n, m):** P(n, m-1)

Si llamamos a **P** con listas de tamaño mayor, digamos **P(n+1, m+1)** entonces podemos expresarlo como **P(n, m+1)** o **P(n+1, m)**. Si seguimos iterando eventualmente llegará a un caso base en el que una lista es 0 o que ambas listas son de tamaño menor a k. Es por esto que el algoritmo **P(n, m)** funciona correctamente. Se finaliza la demostración.
