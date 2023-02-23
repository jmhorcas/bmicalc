package bmicalc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BMICalcTest {
	
	private BMICalcImpl c = new BMICalcImpl();;
	private final double epsilon = 0.000001;
	// bmi() tests
	@Test
	@DisplayName("Negative Weight")
	// If the weight is a negative value, it has to throw an error
	public void bmiNegativeWeight() {
		assertThrows(RuntimeException.class, ()->c.bmi(-1, 160));
	}
	@Test
	@DisplayName("Weight = 0")
	// If the weight is equal to zero, it has to throw an error
	public void bmiZeroWeight() {
		assertThrows(RuntimeException.class, ()->c.bmi(0, 160));
	}
	@Test
	@DisplayName("Negative Height")
	// If the height is a negative value, it has to throw an error
	public void bmiNegativeHeight() {
		assertThrows(RuntimeException.class, ()->c.bmi(70, -1));
	}
	@Test
	@DisplayName("Height = 0")
	// If the height is equal to zero, it has to throw an error
	public void bmiZeroHeight() {
		assertThrows(RuntimeException.class, ()->c.bmi(70, 0));
	}
	@Test
	@DisplayName("Valid values")
	// If the weight is 65 kg and the height is 1.6 m, it has to return 25.390625
	// The third parameter is delta, we accept a difference of 0.000001 between the expected value and the real value 
	public void bmiBothCorrect() {
		assertEquals(25.390625, c.bmi(65, 1.6), epsilon);
	}
	@Test
	@DisplayName("Valid values 2")
	// If the weight is 70 kg and the height is 1.85 m, it has to return 20.45288532
	// We accept a difference of 0.000001 between the expected value and the real value 
	public void bmiBothCorrectBis() {
		assertEquals( 20.4528853, c.bmi(70, 1.85), epsilon);
	}
	@Test
	@DisplayName("Weight > 800 kg")
	// If the weight is greater than 8000 kg, it is considered invalid and the method throws an error
	public void weightGreater() {
		assertThrows(RuntimeException.class, ()->c.bmi(900, 1.89));
	}
	@Test
	@DisplayName("Height > 3 m")
	// If the height is greater than 3 m, it is considered invalid and the method throws an error
	public void heightGreater() {
		assertThrows(RuntimeException.class, ()->c.bmi(70, 3.3));
	}
	
	
	// category() tests
	
	@Test
	@DisplayName("Negative bmi")
	// If the bmi is a negative value, it has to return an error message
	public void negativeBmi() {
		assertEquals("Invalid bmi value", c.category(-1));
	}
	@Test
	@DisplayName("bmi = 0")
	// If the bmi is equal to zero, it has to return an error message
	public void ZeroBmi() {
		assertEquals("Invalid bmi value", c.category(0));
	}
	
	@Test
	@DisplayName("Return UNDERWEIGHT")
	// If the bmi is below 18.5, it has to return UNERWEIGHT
	public void underweightCheck() {
		assertEquals("UNDERWEIGHT", c.category(15.87));
	}
	@Test
	@DisplayName("Return UNDERWEIGHT (boundary case)")
	// If the bmi is below 18.5, it has to return UNERWEIGHT, we try with a bmi = 18.49
	public void underweightBoundCheck() {
		assertEquals("UNDERWEIGHT", c.category(18.49));
	}
	@Test
	@DisplayName("Return NORMAL")
	// If the bmi is between 18.5 and 24.9, it has to return NORMAL
	public void normalCheck() {
		assertEquals("NORMAL", c.category(20.64));
	}
	@Test
	@DisplayName("Return NORMAL (lower bound case)")
	// If the bmi is 18.5, it has to return NORMAL
	public void normalLBoundCheck() {
		assertEquals("NORMAL", c.category(18.5));
	}
	@Test
	@DisplayName("Return NORMAL (upper bound case)")
	// If the bmi is 24.9, it has to return NORMAL
	public void normalUBoundCheck() {
		assertEquals("NORMAL", c.category(24.9));
	}
	@Test
	@DisplayName("Return OVERWEIGHT")
	// If the bmi is between 25 and 29.9, it has to return OVERWEIGHT
	public void overweightCheck() {
		assertEquals("OVERWEIGHT", c.category(27.34));
	}
	@Test
	@DisplayName("Return OVERWEIGHT (lower bound case)")
	// If the bmi is 25, it has to return OVERWEIGHT
	public void overweightLBoundCheck() {
		assertEquals("OVERWEIGHT", c.category(25));
	}
	@Test
	@DisplayName("Return OVERWEIGHT (upper bound case)")
	// If the bmi is 29.9, it has to return OVERWEIGHT
	public void overweightUBoundCheck() {
		assertEquals("OVERWEIGHT", c.category(29.9));
	}
	@Test
	@DisplayName("Return OBESE")
	// If the bmi is above or equal 30.0, it has to return OBESE
	public void OBESECheck() {
		assertEquals("OBESE", c.category(45.98));
	}
	@Test
	@DisplayName("Return OBESE (boundary case)")
	// If the bmi is 30.0, it has to return OBESE
	public void obeseBoundCheck() {
		assertEquals("OBESE", c.category(30.0));
	}

	// abdominalObesity()
	@Test
	@DisplayName("Negative waist circumference male")
	// If the waist circumference is a negative value, it has to throw an error
	public void negativeMale(){
		assertThrows(RuntimeException.class, ()->c.abdominalObesity(-1, 'M'));
		}
	@Test
	@DisplayName("Negative waist circumference female")
	// If the waist circumference is a negative value, it has to throw an error 
	public void negativeFemale(){
		assertThrows(RuntimeException.class, ()->c.abdominalObesity(-1, 'F'));
		}
	@Test
	@DisplayName("waist circumference = 0, male")
	// If the waist circumference is zero, it has to throw an error 
	public void ZeroMale(){
		assertThrows(RuntimeException.class, ()->c.abdominalObesity(0, 'M'));
		}
	@Test
	@DisplayName("waist circumference = 0, female")
	// If the waist circumference is zero, it has to throw an error
	public void ZeroFemale(){
		assertThrows(RuntimeException.class,  ()->c.abdominalObesity(0, 'M'));
		}
	@Test
	@DisplayName("waist circumference > 1000, female")
	// If the waist circumference is greater than 1000 cm, it has to throw an error
	public void wcGreaterFemale(){
		assertThrows(RuntimeException.class,  ()->c.abdominalObesity(1200, 'F'));
		}
	@Test
	@DisplayName("waist circumference > 0, male")
	// If the waist circumference is greater than 1000 cm, it has to throw an error 
	public void wcGreaterMale(){
		assertThrows(RuntimeException.class, ()->c.abdominalObesity(1200, 'M'));
		}
	@Test
	@DisplayName("Invalid gender character")
	// If the gender is not an "m" or "f" (without discriminating lowercase and uppercase), it has to throw an error
	public void invalidCharacter(){
		assertThrows(RuntimeException.class, ()->c.abdominalObesity(170, 'g'));

		}
	@Test
	@DisplayName("Lowercase Male")
	// If the gender is a lowercase "m", it has to return the correct result for men. In this case it has to return TRUE
	public void lowercaseMale(){
		assertEquals(true, c.abdominalObesity(170, 'm'));
		}
	@Test
	@DisplayName("Lowercase Female")
	// If the gender is a lowercase "f", it has to return the correct result for female. In this case it has to return FALSE
	public void lowercaseFemale(){
		assertEquals(false, c.abdominalObesity(60, 'f'));
		}
	@Test
	@DisplayName("Female with abdominal obesity")
	// If the waist circumference value is greater than 80 cm, and the gender is 'F', it has to return TRUE
	public void abdObesityF() {
		assertEquals(true, c.abdominalObesity(90, 'F'));
	}
	@Test
	@DisplayName("Female without abdominal obesity, on the limit")
	// If the waist circumference value is 80 cm, and the gender is 'F', it has to return FALSE
	public void boundaryF() {
		assertEquals(false, c.abdominalObesity(80, 'F'));
	}
	@Test
	@DisplayName("Female without abdominal obesity")
	// If the waist circumference value is 80 cm or less, and the gender is 'F', it has to return FALSE
	public void noAbdObesityF() {
		assertEquals(false, c.abdominalObesity(70, 'F'));
	}
	@Test
	@DisplayName("Male with abdominal obesity")
	// If the waist circumference value is greater than 90 cm, and the gender is 'M', it has to return TRUE
	public void abdObesityM() {
		assertEquals(true, c.abdominalObesity(100, 'M'));
	}
	@Test
	@DisplayName("Male without abdominal obesity, on the limit")
	// If the waist circumference value is 90 cm, and the gender is 'M', it has to return FALSE
	public void boundaryM() {
		assertEquals(false, c.abdominalObesity(90, 'M'));
	}
	@Test
	@DisplayName("Male without abdominal obesity")
	// If the waist circumference value is 90 cm or less, and the gender is 'F', it has to return FALSE
	public void noAbdObesityM() {
		assertEquals(false, c.abdominalObesity(76, 'M'));
	}
	
}
