![example workflow](https://github.com/jmhorcas/bmicalc/actions/workflows/maven.yml/badge.svg)

# BMI calculator
A biomedical calculator for the body mass index (BMI) and other parameters.

For method bmi(mass, height) we will have these different tests:
- mass with a negative value and height with a negative value: "EXCEPTION: Invalid arguments"
- mass with a negative value and height equal to zero: "EXCEPTION: Invalid arguments"
- mass with a negative value and height equal to 1.81: "EXCEPTION: Invalid arguments"
- mass equal to zero height with a negative value: "EXCEPTION: Invalid arguments"
- mass equal to 62 and height with a negative value: "EXCEPTION: Invalid arguments"
- mass equal to 62 and height equal to 1.81: we expect 18.92
- mass equal to 75 and height equal to 1.90: we expect 20.73

For method category(bmi) we will have these different tests:
- bmi equal to -2: "EXCEPTION: Invalid arguments"
- bmi equal to zero: "EXCEPTION: Invalid arguments"
- bmi equal to 10: we expect "UNDERWEIGHT"
- bmi equal to 18.4: we expect "UNDERWEIGHT"
- bmi equal to 18.5: we expect "NORMAL"
- bmi equal to 20: we expect "NORMAL"
- bmi equal to 24.9: we expect "NORMAL"
- bmi equal to 25: we expect "OVERWEIGHT"
- bmi equal to 27: we expect "OVERWEIGHT"
- bmi equal to 29.9: we expect "OVERWEIGHT"
- bmi equal to 30: we expect "OBSESE"
- bmi equal to 35: we expect "OBESE"

For method abdominalObesity(waistCircunference, gender) we will have these different tests:
- waistCircunference with a negative value and gender equal to 'M': "EXCEPTION: Invalid arguments"
- waistCircunference equal to zero and gender equal to 'F': "EXCEPTION: Invalid arguments"
- waistCircunference equal to 56 and gender equal to 'P': "EXCEPTION: Invalid arguments"
- waistCircunference equal to 2 and gender equal to 'Q': "EXCEPTION: Invalid arguments"
- waistCircunference equal to 43 and gender equal to 'K': "EXCEPTION: Invalid arguments"
- waistCircunference with a negative value and gender equal to 'F': "EXCEPTION: Invalid arguments"
- waistCircunference equal to zero and gender equal to 'M': "EXCEPTION: Invalid arguments"
- waistCircunference equal to 10 and gender equal to 'M': we expect FALSE
- waistCircunference equal to 70 and gender equal to 'M': we expect FALSE
- waistCircunference equal to 90 and gender equal to 'M': we expect FALSE
- waistCircunference equal to 91 and gender equal to 'M': we expect TRUE
- waistCircunference equal to 100 and gender equal to 'M': we expect TRUE
- waistCircunference equal to 15 and gender equal to 'F': we expect FALSE
- waistCircunference equal to 27 and gender equal to 'F': we expect FALSE
- waistCircunference equal to 79 and gender equal to 'F': we expect FALSE
- waistCircunference equal to 80 and gender equal to 'F': we expect FALSE
- waistCircunference equal to 81 and gender equal to 'F': we expect TRUE
- waistCircunference equal to 90 and gender equal to 'F': we expect TRUE

![Use Cases Diagram](https://github.com/pmgespina/bmicalc/blob/main/doc/P2_new_function.png)

## Use Case Specification

- Name: Calculate the Body Mass Index of a Person
- Primary actor: the user of the calculator
- Scope: the body mass index (BMI) calculator
- Goal: the user wnats to calculate its body mass index
- Level: user objective
- Stakeholders and interests:
    · User: calculate its body mass index
    · Developers of the calculator: to provide a suitable solution for the request of the user
- Precondition: the user has to introduce its mass and heigth
- Minimal guarantee: the calculator returns a value of body mass index
- Success guarantee: the user receives an suitable value of BMI value according to its mass and heigth
- Trigger: the user selects the option "Calculate Body Mass Index" between the different options of the calculator
- Main scenario:
    1. User opens the calculator
    2. User provides its mass and heigth (this point should be underlined because there is an use case that refers to this)
    3. The calculator accepts the values which have been introduced
    4. The calculator obtains the result of body mass index for the user
    5. The calculator shows the result to the user
- Alternative scenario:
    2a. The mass value introduced by the user is invalid
    2b. The heigth value introduced by the user is invalid