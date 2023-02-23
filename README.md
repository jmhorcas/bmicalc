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