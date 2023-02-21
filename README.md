![example workflow](https://github.com/jmhorcas/bmicalc/actions/workflows/maven.yml/badge.svg)

# BMI calculator
A biomedical calculator for the body mass index (BMI) and other parameters.

## Tests
### bmi Test
1. `` Test a known problem ().
2. `` Test if an error message appears when height or mass is under 0.
3. `` Test if an error message appears when height or mass is equal to 0.
4. `` Test if the height and mass are inserted as double.

### category Test
1. `` Test if an error message appears when bmi is under 0.
2. `` Test if an error message appears when bmi is equal to 0.
3. `` Test if value under 18.5 is UNDERWEIGHT
4. `` Test if value equal to 18.5 is NORMAL
5. `` Test if value under 25 is NORMAL
6. `` Test if value equal to 25 is OVERWEIGHT
7. `` Test if value under 30 is OVERWEIGHT
8. `` Test if value equal to 30 is OBESE
9. `` Test if value over 30 is OBESE

### abdominalObesity Test
1. `` Test if an error message appears when waistCircumference is under 0.
2. `` Test if an error message appears when waistCircumference is equal to 0.
3. `` Test if gender is a value of type char.
4. `` Test if gender is male or female.
