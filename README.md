![example workflow](https://github.com/jmhorcas/bmicalc/actions/workflows/maven.yml/badge.svg)

# BMI calculator
A biomedical calculator for the body mass index (BMI) and other parameters.


These test cases were written on paper before implementing the tests.

· Test cases for the method bmi():
We are going to try with valid and invalid values for both parameters.
weight < 0, it has to throw an error
weight > 800, it has to throw an error
weight = 0, it has to throw an error
height < 0, it has to throw an error
height > 3, it has to throw an error
height = 0, it has to throw an error
weight = 65, height = 1.6, it has to return 25.390625 
weight = 70, height = 1.85, it has to return 20.4528853

· Test cases for the method category():
Here we want to try with bmi values that are in the bounds of each category, values that are not in the bounds, and invalid values.
bmi < 0, it has to throw an error
bmi = 0, it has to throw an error
bmi = 15.87, it has to return UNDERWEIGHT
bmi = 18.49, it has to return UNDERWEIGHT
bmi = 20.64, it has to return NORMAL
bmi = 18.5, it has to return NORMAL
bmi = 24.9, it has to return NORMAL
bmi = 27.34, it has to return OVERWEIGHT
bmi = 25, it has to return OVERWEIGHT
bmi = 29.9, it has to return OVERWEIGHT
Bmi = 45.98, it has to return OBESE
bmi = 30.0, it has to return OBESE

· Test cases for method abdominalObesity():
We are going to try with valid and invalid values of both parameters, checking also that the method does not discriminate between lower case and upper case. We are also testing what happens when the waistCircumference for each gender takes the limit value (80 for females, 90 for males).
waistCircumference = -1, gender = 'M', it has to throw an error
waistCircumference = -1, gender = 'F', it has to throw an error
waistCircumference = 0, gender = 'M', it has to throw an error
waistCircumference = 0, gender = 'F', it has to throw an error
waistCircumference > 1000, gender = 'M', it has to throw an error
waistCircumference > 1000, gender = 'F', it has to throw an error
waistCircumference = 170, gender = 'g', it has to throw an error
waistCircumference = 170, gender = 'm', it has to return TRUE
waistCircumference = 60, gender = 'f', it has to return FALSE
waistCircumference = 90, gender = 'F', it has to return TRUE
waistCircumference = 80, gender = 'F', it has to return FALSE
waistCircumference = 70, gender = 'F', it has to return FALSE
waistCircumference = 100, gender = 'M', it has to return TRUE
waistCircumference = 90, gender = 'M', it has to return FALSE
waistCircumference = 76, gender = 'M', it has to return FALSE

![Use Cases Diagram](https://github.com/susanfg/bmicalc/blob/main/Doc/CasosDeUso.png)



