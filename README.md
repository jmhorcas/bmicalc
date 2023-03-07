![example workflow](https://github.com/jmhorcas/bmicalc/actions/workflows/maven.yml/badge.svg)

# BMI calculator
A biomedical calculator for the body mass index (BMI) and other parameters.

## Tests
### bmi Test
1. `assertEquals((70)/(1.75*1.75), test.bmi(70, 1.75));` Test a known problem ().
2. `assertThrows(RuntimeException.class, () ->{test.bmi(-70, 1.75);});` Test if an error message appears when height or mass is under 0.
3. `assertThrows(RuntimeException.class, () ->{test.bmi(70, 0);});` Test if an error message appears when height or mass is equal to 0.

### category Test
1. `assertThrows(RuntimeException.class, () ->{test.category(-10);});` Test if an error message appears when bmi is under 0.
2. `assertThrows(RuntimeException.class, () ->{test.category(0);});` Test if an error message appears when bmi is equal to 0.
3. `assertEquals("UNDERWEIGHT", test.category(17));` Test if value under 18.5 is UNDERWEIGHT
4. `assertEquals("NORMAL", test.category(18.5));` Test if value equal to 18.5 is NORMAL
5. `assertEquals("OVERWEIGHT", test.category(25));` Test if value equal to 25 is OVERWEIGHT
6. `assertEquals("OBESE", test.category(30));` Test if value equal to 30 is OBESE
7. `assertEquals("OBESE", test.category(34));` Test if value over 30 is OBESE

### abdominalObesity Test
1. `assertThrows(RuntimeException.class, () ->{test.abdominalObesity(-23, 'M');});` Test if an error message appears when waistCircumference is under 0.
2. `assertThrows(RuntimeException.class, () ->{test.abdominalObesity(0, 'M');});` Test if an error message appears when waistCircumference is equal to 0.
3. `assertThrows(RuntimeException.class, () ->{test.abdominalObesity(23, 'c');});` Test if gender is male or female.

## Casos de uso
knitr::include_graphics("Diagrama1.png")