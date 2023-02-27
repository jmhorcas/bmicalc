![example workflow](https://github.com/jmhorcas/bmicalc/actions/workflows/maven.yml/badge.svg)

# BMI calculator
A biomedical calculator for the body mass index (BMI) and other parameters.
1.Comprobacion del calculo correcto del bmi
2.COmprobacion con un peso=0 salga un error
3. Comprobacion si la masa es negativa salga un error
4.Comprobacion   en 18.4 que salga UNDERWEIGHT
5.Comprobacion en 18.5 que salga NORMAL
Comprobación en 24.9 que salga NORMAL
COmprobación en 25 salga OVERWEIGHT
6.Comprobacion en 29.9 que salga OVERWEIGHT
7.Comprobacion en 30 que salga OBESE
8.Comprobacion de con un BMI negativo salga un error
9.Comprobacion que con gender=M y waistCIrcumference=1 nos devuelva true
10.Comprobacion que con gender=F y waistCIrcumference=0.9 nos devuelva true
11.Comprobacion que con gender=M y waistCIrcumference=0.8 nos devuelva false
12.Comprobacion que con gender=F y waistCIrcumference=0.7 nos devuelva false
13.Comprobacion que con gender distinto de M y F nos devuelva un error
14.Comprobacion que con un waistCircumference negativo nos devuelva un error

#Diagrama UML

<image src="C:\Users\raul\Desktop\Diagrama1.png" alt="Diagrama UML del modelo">
El caso de uso que hemos añadido es un cálculo según la altura de la persona y su género de su IBM ideal.

#Especificación de caso de uso
Calcular categoría
-Actor primario: Médico
-Objetivo: Calcular la categoría que es un paciente(obeso, delgado...) a través 
de una serie de valores.
-Scope: Software informático para calcularlo
-Level: Informar al paciente sobre a que categoría pertenece
-Stakeholder e intereses:
1. Médico: Infomar al paciente que categoría es
2. Paciente: Saber a que categoría pertenece
-Precondición: Que el médico conozca los parametros necesario(bmi) o los parámetros para 
calcularlos para poder realizar el cálculo.
-Garantía mínima: El médico recibe la información a partir del software para poder informar
al paciente
-Trigger: El médico selecciona la opción calcular categoría
-Escenario principal:
1. El médico inicia el software
2. El médico selecciona la opción calcular categoría
3. El médico introduce los parámetros(bmi)
4. El sowtware le devuelve al médico el resultado
-Escenarios alternativos:
2a. El médico no conoce el bmi
2b. El software da la opción de calcular bmi
2c. El software calcula bmi.
2d. El software calcula y devuelve la categoría
3a. El médico introduce parámetros no reales(muy altos o muy bajos)
3b. El software devuelve un error y vuelve a preguntar los parámetros


