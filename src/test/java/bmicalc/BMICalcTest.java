package bmicalc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.*;

public class BMICalcTest {
	
	private BMICalcImpl number = new BMICalcImpl();
	
	
	@Test 
	@DisplayName("Test 1")
	public void bmiCalculation2(){
		
		assertEquals(56/(Math.pow(1.56, 2)), number.bmi(56, 1.56));
	}
	
	@Test 
	@DisplayName("Test 2")
	public void bmiCalculation3(){
		
		assertNotEquals(48/(Math.pow(1.52, 2)), number.bmi(56, 1.56));
	}
	
	@Test
	@DisplayName("Test 3")
	public void bmiCalculation() {
		assertThrows(ArithmeticException.class, () -> number.bmi(58, 0));
	}
	
	@Test 
	@DisplayName("Test 4")
	public void bmiCalculationtimeNotexceeded(){
		assertTimeout(Duration.ofSeconds(1), () -> number.bmi(56, 1.56));
	}
	
	@Test
	@DisplayName("Example 5")
	public void bmiObesity() {
		assertEquals("UNDERWEIGHT", number.category(17));
		
	}
	
	@Test
	@DisplayName("Example 6")
	public void bmiObesity2() {
		assertNotEquals("NORMAL", number.category(26));
		
	}
	
	@Test
	@DisplayName("Example 7")
	public void bmiObesity3() {
		assertThrows(RuntimeException.class, () -> number.category(0));
		
	}
	
	/**
	 * double a = Math.random();
	 * double b = Math.random();
	 * Assertions.assertEquals(a+b, c.suma(a, b));
	 */
}
