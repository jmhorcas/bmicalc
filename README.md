![example workflow](https://github.com/jmhorcas/bmicalc/actions/workflows/maven.yml/badge.svg)

# BMI calculator
A biomedical calculator for the body mass index (BMI) and other parameters.

# Tests
- underweightCategoryTest: comprueba con valores en rango que el resultado es correcto.
- underweightNegativeCategoryTest: comprueba que con valores negativos se lanza una excepción.
- normalCategoryTest: comprueba con valores en rango que el resultado es correcto.
- overweightCategoryTest: comprueba con valores en rango que el resultado es correcto.
- obeseCategoryTest: comprueba con valores en rango que el resultado es correcto.
- 
- positiveMaleAbdominalObesityTest: comprueba que para valores por encima de 90 el resultado es positivo en hombres.
- negativeMaleAbdominalObesity: comprueba que para valores por debajo de 90 el resultado es negativo en hombres.
- positiveFemaleAbdominalObesityTest: comprueba que para valores por encima de 80 el resultado es positivo en mujeres.
- negativeFemaleAbdominalObesity: comprueba que para valores por debajo de 80 el resultado es negativo en mujeres.
- zeroAbdominalTest: comprueba que se lanza una excepción con una circunferencia igual a 0.
- negativeInputAbdominalTest: comprueba que se lanza una excepción con una circunferencia menor que 0.
- wrongGenderAbdominalTest: comprueba que se lanza una excepción con un género mal indicado.
- 
- bmiTest: comprueba que la ecuación se realiza de forma correcta.
- bmiNegativeMassTest: comprueba que se lanza una excepción con masa negativa.
- bmiNegativeHeightTest: comprueba que se lanza una excepción con altura negativa.
- bmiHeightEqualsToZeroTest: comprueba que en caso de dividir por cero se lanza una excepción.
- bmiIrrealTest: comprueba que se lanza una excepción con una relación de peso altura irreal.

![Alt text](https://github.com/ElArquitectorgo/bmicalc/blob/main/doc/prueba.drawio.png)
