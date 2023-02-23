![example workflow](https://github.com/jmhorcas/bmicalc/actions/workflows/maven.yml/badge.svg)

# BMI calculator
A biomedical calculator for the body mass index (BMI) and other parameters.

Firstly, test for the bmi method are defined. Considering the result of the function bmi it is developed the following tests:

1.	For specific inputs (mass and height) the result from the function should be equal to the actual bmi 
	and should not be for incorrect bmi (we try this adding 1 to the correct solution).
	
2.	This test check that the data (height or mass) is not null.

3.	This test check that the data (height or mass) is not negative.

4.	This test check that the data (height or mass) is in range. For the limits, it was looked for the maximum and minimum height and mass. 

5.	For different inputs the result from the function cannot be 0. I test this checking that bmi is not equal to 0.

6.	For different inputs the result from the function cannot be negative. I test that checking that bmi/bmi
	is not equal to -1. 

Secondly, test for category function are defined. In this case, parameterized test are used for each category.
With this type of test we write less code as it allows us to associate itself with parameters and pass them through a variable.

7.	For a standard value, such as 10, and the limits 18.4, the test check that the function return underweight.

8.	For a standard value, such as 20, and the limits 18.5 and 24.9, the test check that the function return normal. 

9.	For a standard value, such as 28, and the limit 25.0 and 29.9, the test check that the function return overweight.

10.	For a standard value, such as 60, and the limit 30, the test check that the function return obese. 
  
In addition, for the last 4 test it is checked that function works well when it is given an a bmi value 
which is not in the studied range.

Thirdly, test for abdominalObesity function are defined. Here, it is used parameterized test again, however, it is also checked 
that the limit is not include.

11. For standard values, such as 80.1 and 85, the test check that the woman has abdominalObesity, whereas for the limit value, 80, she does not.

12. For standard values, such as 92.0 and 95, the test check that the man has abdominalObesity, whereas for the limit value, 90, he does not.

13. This test check that the gender is correctly introduce (F or M).

