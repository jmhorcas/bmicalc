![example workflow](https://github.com/jmhorcas/bmicalc/actions/workflows/maven.yml/badge.svg)

# BMI calculator
A biomedical calculator for the body mass index (BMI) and other parameters.

MÉTODO bmi :

1.Comprobar que cuando la masa o la altura es 0 lanza error
2.Comprobar que cuando la masa o la altura es <0 lanza error
3.Comprobación de un resultado conocido.Para 80Kg,1'8m =24.69

MÉTODO categroty :

4.Comprobar que cuando bmi es 0 devuelve error
5.Comprobar que cuando bmi es <0 devuelve error
6.Comprobar que cuando bmi es 18(<18.5) está en UNDERWEIGHT
7.Comprobar que cuando bmi es 18.5 está en NORMAL
8.Comprobar que cuando bmi es 24.9 está en NORMAL
9.Comprobar que cuando bmi es 25(>24.9) está en OVERWEIGHT
10.Comprobar que cuando bmi es 29.9 está en OVERWEIGHT
11.Comprobar que cuando bmi es 30(>29.9) está en OBESE

MÉTODO abdominalObesity:

12.Comprobar que cuando waistCircumference es 0 lanza error
13.Comprobar que cuando waistCircumference es <0 lanza error
14.Comprobar que cuando gender es un caracter no valido lanza error
15.Comprobar cuando es 89 y 'M' devuelve FALSE 
16.Comprobar cuando es 90 y 'M' devuelve FALSE
17.Comprobar cuando es 91 y 'M' devuelve TRUE  
18.Comprobar cuando es 79 y 'F' devuelve FALSE 
19.Comprobar cuando es 80 y 'F' devuelve FALSE
20.Comprobar cuando es 81 y 'F' devuelve TRUE 