![example workflow](https://github.com/jmhorcas/bmicalc/actions/workflows/maven.yml/badge.svg)

# BMI calculator
A biomedical calculator for the body mass index (BMI) and other parameters.

TEST 1: MASA NEGATIVA --> ERROR
TEST 2: ALTURA NEGATIVA --> ERROR
TEST 3: MASA Y ALTURA POSITIVA --> CALCULA BMI
TEST 4: BMI<18.5 --> UNDERWEIGHT
TEST 5: BMI=18.5 --> NORMAL
TEST 7: 18.5<BMI<=24.9 --> NORMAL
TEST 8: BMI=25.0 --> OVERWEIGHT
TEST 9: 25.0<BMI<=29.9 --> OVERWEIGHT
TEST 10: BMI=30.0 --> OVERWEIGHT
TEST 11: BMI>30.0 --> OVERWEIGHT
TEST 12: G NERO NO M O NO F --> ERROR 
TEST 13: CIRCUNFERENCIA<0 --> ERROR
TEST 14: GENERO M O F Y CIRCUNFERENCIA > 0 --> ABDOMINALOBESITY 
*EXCEPTIONTESTING: TEST PRUEBA DE SALTO DE ERRORES


https://github.com/mariajosehidalgo/bmicalc/blob/main/PRACTICA2.jpg


Caso de uso: Calcular BMI 
Actor Primario: Paciente
Objetivo: Determinar el BMI del paciente
Scope: Sistema de la calculadora
Level: Objetivo del usuario
Stakeholders e intereses:
-	Paciente ---- obtener BMI
Precondición: introducir unos valores de masa y altura válidos
Garantía mínima: el paciente recibe el cálculo de su BMI

Escenario Principal:
1)	El paciente elige la opción de cálculo de BMI
2)	El paciente introduce su masa y altura
3)	La calculadora admite los valoees como válidos
4)	La calculadora devuelve el valor del BMI
5)	Vuelve a la pantalla de selección de opciones
	3.a) La calculadora no admite los valores como válidos
	4.a) La calculadora lanza un mensaje de error 
	5.a) Vuelta al paso 2






