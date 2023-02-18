package bmicalc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BMICalcTest {
	
	private BMICalcImpl bmi = new BMICalcImpl();
	
	
	@Test
	@DisplayName("Example")
	public void bmiCalculation() {
		assertThrows(ArithmeticException.class, () -> bmi.bmi(58, 0));
	}
	
	@Test 
	@DisplayName("Comprobar funcionamiento cálculo BMI")
	public void bmiCalculation2(){
		
		assertEquals(56/(Math.pow(1.56, 2)), bmi.bmi(56, 1.56));
	}
	
	
	@Test
	@DisplayName("Example bmi")
	public void bmiObesity() {
		assertEquals("UNDERWEIGHT", bmi.category(17));
		
	}
	
	
	
	/**
	 * double a = Math.random();
	 * double b = Math.random();
	 * Assertions.assertEquals(a+b, c.suma(a, b));
	 */
}
