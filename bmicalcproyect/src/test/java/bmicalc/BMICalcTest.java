package bmicalc;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class BMICalcTest {
	
	private BMICalcImpl b;
	
	
	@BeforeEach
	public void start() {
		b = new BMICalcImpl();
	}
	
	
	@Test
	@DisplayName("bmi correct")
	void testbmi5() {
		double bmi;
		bmi = b.bmi(65, 1.70);
		double bmiround = Math.round(bmi*1000.0)/1000.0;
		assertEquals(bmiround,22.491);
		assertNotEquals(bmiround, 22.4);
	}
	
	
	@Test
	@DisplayName("bmi data not null")
	void exceptionTesting() {
	
		Exception exception1 = assertThrows(ArithmeticException.class,
				()->b.bmi(60, 0));
		Exception exception2 = assertThrows(ArithmeticException.class,
				()->b.bmi(0, 1.70));
	}
	
	
	@Test
	@DisplayName("bmi data not negative")
	void exceptionTesting2() {
		
		Exception exception1 = assertThrows(ArithmeticException.class,
				()->b.bmi(60, -1));
		Exception exception2 = assertThrows(ArithmeticException.class,
				()->b.bmi(-1, 1.70));
	}
	
	@Test
	@DisplayName("bmi data in range")
	void exceptionTesting3() {
		Exception exception1 = assertThrows(ArithmeticException.class,
											()->b.bmi(700,1.7));
		Exception exception2 = assertThrows(ArithmeticException.class,
											()->b.bmi(0.1,1.7));
		Exception exception3 = assertThrows(ArithmeticException.class,
											()->b.bmi(60,3));
		Exception exception4 = assertThrows(ArithmeticException.class,
											()->b.bmi(60,0.012));
		
	}
	
	
	@Test
	@DisplayName("bmi not null")
	void testbmi3() {
		double bmi;
		for(double m=4;m<10;m+=1.5) {
			for(double h=1.5;m<2;m+=1.1) {
				bmi = b.bmi(m, h);
				assertNotEquals(bmi,0);
			}
		}
	}
	
	@Test
	@DisplayName("bmi not negative")
	void testbmi4() {
		double bmi;
		for(double m=4;m<10;m+=1.5) {
			for(double h=1.5;m<2;m+=1.1) {
				bmi = b.bmi(m, h);
				assertNotEquals(-1,bmi/bmi);
			}
		}
	}
	
	@ParameterizedTest
	@DisplayName("category underweight correct")
	@ValueSource (doubles = {10, 18.4})
	void testcat1(double bmi) {
		assertEquals("UNDERWEIGHT",b.category(bmi));
		assertNotEquals("UNDERWEIGHT", b.category(19));
	}
	
	
	@ParameterizedTest
	@DisplayName("category normal correct")
	@ValueSource (doubles = {18.5, 20, 24.9})
	void testcat2(double bmi) {
		assertEquals("NORMAL",b.category(bmi));
		assertNotEquals("NORMAL", b.category(26));
	}
	
	@ParameterizedTest
	@DisplayName("category overweight correct")
	@ValueSource (doubles = {25.0, 28, 29.9})
	void testcat3(double bmi) {
		assertEquals("OVERWEIGHT",b.category(bmi));
		assertNotEquals("OVERWEIGHT", b.category(23));
	}
	
	@ParameterizedTest
	@DisplayName("category obese correct")
	@ValueSource (doubles = {30, 60})
	void testcat4(double bmi) {
		assertEquals("OBESE",b.category(bmi));
		assertNotEquals("OBESE", b.category(25));
	}
	
	@ParameterizedTest
	@DisplayName("abdominalObesity woman correct")
	@ValueSource (doubles = {80.1, 85})
	void testao1(double wc) {
		assertEquals(true,b.abdominalObesity(wc, 'F'));
		assertNotEquals(true, b.abdominalObesity(80, 'F'));
	}
	
	@ParameterizedTest
	@DisplayName("abdominalObesity man correct")
	@ValueSource (doubles = {92.0, 95})
	void testao2(double wc) {
		assertEquals(true,b.abdominalObesity(wc, 'M'));
		assertNotEquals(true, b.abdominalObesity(90, 'M'));
	}
	
	@Test
	@DisplayName("gender F or M")
	void exceptionTesting4() {
		
		Exception exception1 = assertThrows(RuntimeException.class,
				()->b.bmi(85, 'f'));
		Exception exception2 = assertThrows(RuntimeException.class,
				()->b.bmi(84, 'm'));
	}
	
}
