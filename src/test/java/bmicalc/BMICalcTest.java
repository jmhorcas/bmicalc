package bmicalc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BMICalcTest {
private BMICalcImpl calc = new BMICalcImpl();
	
	@Test
	public void bmiNormal() {
		double mass = 50;
		double height = 1.70;
		assertEquals(17.30, (double)Math.round(calc.bmi(mass, height)*100)/100);
	}
	
	@Test
	public void bmiNegativeMass() {
		double mass = -50;
		double height = 1.70;
		
		Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.bmi(mass, height));
		String expectedMessage = "Mass and height must be higher than 0";
	    String actualMessage = exception.getMessage();
	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	public void bmiNegativeHeight() {
		double mass = 50;
		double height = -1.70;
		
		Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.bmi(mass, height));
		String expectedMessage = "Mass and height must be higher than 0";
	    String actualMessage = exception.getMessage();
	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	public void bmi0MassHeight() {
		double mass = 0;
		double height = 0;
		
		Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.bmi(mass, height));
		String expectedMessage = "Mass and height must be higher than 0";
	    String actualMessage = exception.getMessage();
	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	public void bmiMaxMassHeight() {
		double mass = 641;
		double height = 1.80;
		
		Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.bmi(mass, height));
		String expectedMessage = "Mass must be lower than 640";
	    String actualMessage = exception.getMessage();
	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	public void bmiMaxHeight() {
		double mass = 58;
		double height = 276;
		
		Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.bmi(mass, height));
		String expectedMessage = "Height must be lower than 275";
	    String actualMessage = exception.getMessage();
	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	public void categoryBMI0() {
		double bmi = 0;
		
		Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.category(bmi));
		String expectedMessage = "BMI must be higher than 0";
	    String actualMessage = exception.getMessage();
	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	public void categoryUnderweight() {
		double bmi = 17;
		
		assertEquals("Underweight", calc.category(bmi));
	}
	
	@Test
	public void categoryNormal() {
		double bmi = 20;
		
		assertEquals("Normal", calc.category(bmi));
	}
	
	@Test
	public void categoryOverweight() {
		double bmi = 27;
		
		assertEquals("Overweight", calc.category(bmi));
	}
	
	@Test
	public void categoryObese() {
		double bmi = 30;
		
		assertEquals("Obese", calc.category(bmi));
	}
	
	@Test
	public void abdominalObesityMinWaist() {
		double waistCircunference = 35;
		char gender = 'F';
		
		Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.abdominalObesity(waistCircunference, gender));
		String expectedMessage = "Waist circumference must be higher than 40 centimeters";
	    String actualMessage = exception.getMessage();
	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	public void abdominalObesityMaxWaist() {
		double waistCircunference = 330;
		char gender = 'F';
		
		Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.abdominalObesity(waistCircunference, gender));
		String expectedMessage = "Waist circumference must be lower than 325 centimeters";
	    String actualMessage = exception.getMessage();
	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	public void abdominalObesityWrongGender() {
		double waistCircunference = 70;
		char gender = 'J';
		
		Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.abdominalObesity(waistCircunference, gender));
		String expectedMessage = "Gender must be M(male) or F(female)";
	    String actualMessage = exception.getMessage();
	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	public void abdominalObesityFalseMale() {
		double waistCircunference = 70;
		char gender = 'M';
		
		assertFalse(calc.abdominalObesity(waistCircunference, gender));
	}
	
	@Test
	public void abdominalObesityTrueMale() {
		double waistCircunference = 100;
		char gender = 'M';
		
		assertTrue(calc.abdominalObesity(waistCircunference, gender));
	}
	
	@Test
	public void abdominalObesityFalseFemale() {
		double waistCircunference = 70;
		char gender = 'F';
		
		assertFalse(calc.abdominalObesity(waistCircunference, gender));
	}
	
	@Test
	public void abdominalObesityTrueFemale() {
		double waistCircunference = 100;
		char gender = 'F';
		
		assertTrue(calc.abdominalObesity(waistCircunference, gender));
	}
}
