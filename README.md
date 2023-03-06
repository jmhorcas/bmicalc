![example workflow](https://github.com/jmhorcas/bmicalc/actions/workflows/maven.yml/badge.svg)

# BMI calculator
A biomedical calculator for the body mass index (BMI) and other parameters.

## IMAGEN DIAGRAMA DE CASO DE USO:

![This is an image](https://github.com/marioperales10/BMI/blob/main/Diagrama.drawio.png)

## ESPECIFICACIÓN CASO DE USO BMI:

USE CASE 1: BMI CALCULATOR

Primary actor: Patient.
Scope: Any user.
Level: User goal.
Stakeholders and Interests: User- Know your body mass index based on your height and weight.
Precondition: The user must know his weight and height.
Minimum guarantee: the calculator program recognizes any error in the measurement information, informing the user that there is an error, and requests to re-enter them.
Success Guarantee: The calculator receives proper weight and height and is capable of calculating Body Mass Index (BMI).
Main success scenario:
1. The user knows her weight and height and they are within the established limits.
2. The user selects the option to calculate the body mass index (BMI)
3. The calculator ask to enter the user's weight and height, updating those previously entered.
4. The calculator shows the user their BMI.
Extensions:
3.a. The data entered is incomplete.


## TEST:

1º BMITest 
2º Categorytest1 
3º Categorytest2
4º BooleanTest1
5º BooleanTest2
