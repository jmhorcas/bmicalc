
![UML diagram](https://github.com/claudiavegarodriguez/bmicalc/blob/main/doc/DiagramaUML.png)

# BMI calculator
A biomedical calculator for the body mass index (BMI) and other parameters.

# Test 1
Check the funcionality of the method bmi().

# Test 2
Check the funcionality of the method bmi() by evaluating that are not equals the results and the input. 

# Test 3
It throws an exception when there is one value which is negative or zero. In this case, a Arithmetic Exception throws when the height is 0, because we can't divide by zero.

# Test 4
Check that it takes less than a second to calculate the BMI.

# Test 5
Check the funcionality of the category() method.

# Test 6
Check the funcionality of the category() method by evaluating that are not equals the results and the input.

# Test 7
It throws a RuntimeException when the category is zero or a negative number. because everyone must have a BMI.

# Test 8
Check the funcionality of the abdominalObesity() method by using AssertTrue()

# Test 9
Check the funcionality of the abdominalObesity() method by using AssertFalse()

# Test 10
Check the funcionality of the abdominalObesity() method by using AssertTrue()

# Test 11
Check the funcionality of the abdominalObesity() method by using AssertFalse()

# Test 12
It throws an IllegalArgumentException when the gender is different to M or F.

# Especificación Caso de Uso
Nombre: Cálculo de BMI 


Actor primario: Sistema
Ámbito: El usuario usa la aplicación del sistema para calcular el BMI. No incluye imprimir los datos.
Nivel: Subfunción
Stakeholders e intereses: el Usuario.
Precondiciones: El Usuario debe proporcionar cierta información previa al Sistema como peso y altura (hablando en concreto del cáclulo de BMI). Si los datos son incorrectos, el sistema lanzará un error.
Garantías mínimas: El sistema hará el cálculo de BMI, y si lo datos son incorrectos, mostrará un error al usuario.
Garantía de éxito: Se hará correctamente el cálculo de BMI.

Escenario principal: 
1. Usuario: Inicia el programa
2. Usuario: introduce los datos que se le pide (para este caso, solo no es necesario peso y altura).
3. Sistema: comprueba que los datos sean válidos
4. Sistema: procede a realizar el cálculo de BMI.
5. Usuario: visualiza el resultado.

Escenarios Alternativos: 
1. Usuario: Inicia el programa
2. Usuario: introduce los datos que se le pide (para este caso, solo no es necesario peso y altura).
3. Sistema: comprueba que los datos sean válidos.
4. Sistema: detecta un error de un número negativo. Lanza el error al usuario
5. Usuario: visualiza por pantalla el error y comienza de nuevo
6. Usuario: introduce los datos que se le pide (para este caso, solo no es necesario peso y altura).
7. Sistema: comprueba que los datos sean válidos
8. Sistema: procede a realizar el cálculo de BMI.
9. Usuario: visualiza el resultado.

Extensiones: 
1. El sistema puede tardar más de lo esperado en realizar el cálculo.
