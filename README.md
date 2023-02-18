![example workflow](https://github.com/jmhorcas/bmicalc/actions/workflows/maven.yml/badge.svg)

# BMI calculator
A biomedical calculator for the body mass index (BMI) and other parameters.

# Tests

underweightCategoryTest: comprueba con valores en rango que el resultado es correcto.
underweightNegativeCategoryTest: comprueba que con valores negativos el resultado es de error.
normalCategoryTest: comprueba con valores en rango que el resultado es correcto.
overweightCategoryTest: comprueba con valores en rango que el resultado es correcto.
obeseCategoryTest: comprueba con valores en rango que el resultado es correcto.

positiveMaleAbdominalObesityTest: comprueba que para valores por encima de 90 el resultado es positivo en hombres.
negativeMaleAbdominalObesity: comprueba que para valores por debajo de 90 el resultado es negativo en hombres.
positiveFemaleAbdominalObesityTest: comprueba que para valores por encima de 80 el resultado es positivo en mujeres.
negativeFemaleAbdominalObesity: comprueba que para valores por debajo de 80 el resultado es negativo en mujeres.

bmiTest: comprueba que la ecuación se realiza de forma correcta.
bmiNegativeMassTest: comprueba que se utiliza el valor absoluto de la masa.
bmiNegativeHeightTest: comprueba que no hay problema si la altura es negativa (va al cuadrado).
bmiHeightEqualsToZeroTest: comprueba que en caso de dividir por cero el resultado es infinito (función de Math.pow).

