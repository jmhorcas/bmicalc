![example workflow](https://github.com/jmhorcas/bmicalc/actions/workflows/maven.yml/badge.svg)

# BMI calculator
A biomedical calculator for the body mass index (BMI) and other 

## Posibles tests
1. Comprobar que a la hora de calcular el BMI lo que pasaria si se divide entre 0
2. Comprobar que sale "UNDERWEIGHT" en los limites inferiores del intervalo
3. Comprobar que sale un peso normal en el intervalo [18.5,24.9]
4. Comprobar que al estar en el intervalo [25,29.9] sale que se tiene sobrepeso
5. Comprobar que al superar el limite superior se tiene obesidad
6. Comprobar qué pasa al introducir en genero un char que no sea 'M' o 'F'
7. Comprobar que devuelve False si eres hombre y estas por debajo de 90 cm
8. Comprobar que devuelve True si eres hombre y estas por encima de 90 cm
9. Comprobar que devuelve False si eres mujer y estas por debajo de 80 cm
10. Comprobar que devuelve True si eres mujer y estas por encima de 80 cmparameters.
11. Comprobar que pasa si en el método de categoria el valor de bmi es poco realista
12. Comprobar qué pasa en el metodo que calcula el bmi si el valor de los parámetros es negativo
13. Comprobar que el objeto creado para los tests no sea nulo
14. Comprobar que los métodos acaben sus tareas en un cierto tiempo.


