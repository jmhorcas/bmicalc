![example workflow](https://github.com/jmhorcas/bmicalc/actions/workflows/maven.yml/badge.svg)

# BMI calculator
A biomedical calculator for the body mass index (BMI) and other parameters.

## Method bmi
1.- Check 5 positive even float numbers
2.- Check 5 positive even int numbers
3.- Check a negative mass
4.- Check a negative height
5.- Check a negative mass and height
6.- Check when mass = 0 (It should be zero)
7.- Check when height = 0 (It should be error)
8.- Check an abnormal value of Height (It should be error)
9.- Check an abnormal value of Mass (It should be error)

## Method category
1.- Check 5 bmi for UNDERWEIGHT
2.- Check 5 bmi for NORMAL
3.- Check 5 bmi for OVERWEIGHT
4.- Check 5 bmi for OBESE
5.- Check a negative bmi (It should be error)
6.- Check an abnormal value of bmi (It should be error)

## Method abdominalObesity
1.- Check 'M' with 5 waistCircumference that give TRUE     
2.- Check 'M' with 5 waistCircumference that give FALSE  
3.- Check 'F' with 5 waistCircumference that give TRUE  
4.- Check 'F' with 5 waistCircumference that give FALSE  
5.- Check 'm' (It should be error) 
6.- Check 'f' (It should be error)
7.- Check a character different that 'F' and 'M' (It should be error)
8.- Check a negative waistCircumference (It should be error)
9.- Check an abnormal value of waistCircumference (It should be error)

## Diagrama de casos de uso

![Diagrama](/doc/CasosDeUso.jpg)

## Especificación de caso de uso
Caso de uso: Calcular categoría
Actor primario: Usuario
Objetivo: El usuario recibe la categoría de su BMI
Scope: El sistema de la calculadora
Nivel: Objetivo del usuario
Stakeholders e intereses:
	- Usuario: quiere saber su categoría
Precondición: el usuario accede a la opción de calcular categoría
Garantía mínima: el usario recibe una categoría correspondiente a su BMI
Trigger: el usuario selecciona la acción de calcular categoría
Escenario principal:
1.- El usuario introduce su BMI
2.- La calculadora recibe el BMI introducido
3.- La calculadora devuelve la categoría
Escenarios alternativos:
3a. El BMI introducido no es válido
3a1. La calculadora muestra un mensaje de error.
3a2. Vuelta al paso 1

