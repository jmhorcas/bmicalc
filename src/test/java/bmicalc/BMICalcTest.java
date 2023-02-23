package bmicalc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BMICalcTest {
	
private BMICalcImpl bmi;
	
	@BeforeEach
	void init() {
		bmi = new BMICalcImpl();
	}
	
	@Test
	@DisplayName("Example Test Method.")
	public void bmi() {
		assertEquals(true, true);
	}
	
	@Test
	@DisplayName("TEST CALCULO BMI")
	public void test1() throws Exception {
		assertEquals(23.85, ((Math.round((bmi.bmi(62.58, 1.62))*100.0)))/100.0);
		assertEquals(19.54, ((Math.round((bmi.bmi(54.49, 1.67))*100.0)))/100.0);
		assertEquals(27.99, ((Math.round((bmi.bmi(40.30, 1.20))*100.0)))/100.0);
		assertEquals(32.93, ((Math.round((bmi.bmi(12.66, 0.62))*100.0)))/100.0);
		assertEquals(27.44, ((Math.round((bmi.bmi(91.89, 1.83))*100.0)))/100.0);
		assertEquals(25.10, ((Math.round((bmi.bmi(70.00, 1.67))*100.0)))/100.0);
	}
	
	@Test
	@DisplayName("BMI<18.5")
	public void test2() {
		assertEquals("UNDERWEIGHT", bmi.category(15.0));
		assertEquals("UNDERWEIGHT", bmi.category(17.7));
		assertEquals("UNDERWEIGHT", bmi.category(18.4));
	}
	
	@Test
	@DisplayName("BMI=18.5")
	public void test3() {
		assertEquals("NORMAL", bmi.category(18.5));
	}
	
	@Test
	@DisplayName("18.5<BMI<=24.9")
	public void test4() {
		assertEquals("NORMAL", bmi.category(18.6));
		assertEquals("NORMAL", bmi.category(22.7));
		assertEquals("NORMAL", bmi.category(24.9));
	}
	
	@Test
	@DisplayName("BMI=25.0")
	public void test5() {
		assertEquals("OVERWEIGHT", bmi.category(25.0));
	}
	
	@Test
	@DisplayName("25.0<BMI<=29.9")
	public void test6() {
		assertEquals("OVERWEIGHT", bmi.category(25.1));
		assertEquals("OVERWEIGHT", bmi.category(28.1));
		assertEquals("OVERWEIGHT", bmi.category(29.9));
	}
	
	@Test
	@DisplayName("BMI=30.0")
	public void test7() {
		assertEquals("OBESE", bmi.category(30.0));
	}
	
	@Test
	@DisplayName("BMI>30")
	public void test8() {
		assertEquals("OBESE", bmi.category(30.1));
		assertEquals("OBESE", bmi.category(33.4));
		assertEquals("OBESE", bmi.category(37.8));
	}
	
	@Test
	@DisplayName("TEST CALCULO ABDOMINALOBESITY")
	public void test9() throws Exception {
		assertTrue(bmi.abdominalObesity(91.2, 'M'));
		assertTrue(bmi.abdominalObesity(100.7, 'M'));
		assertTrue(bmi.abdominalObesity(98.4, 'F'));
		assertTrue(bmi.abdominalObesity(90.2, 'F'));
		assertTrue(bmi.abdominalObesity(81.8, 'F'));
		assertFalse(bmi.abdominalObesity(90.0, 'M'));
		assertFalse(bmi.abdominalObesity(85.3, 'M'));
		assertFalse(bmi.abdominalObesity(80.0, 'F'));
		assertFalse(bmi.abdominalObesity(78.1, 'F'));
		assertFalse(bmi.abdominalObesity(70.6, 'F'));
	}
	
	@Test
	@DisplayName("TEST PRUEBA DE SALTO DE ERRORES")
	public void exceptionTesting() throws Exception{
		assertThrows(Exception.class, ()->bmi.bmi(46.0, 0.0));
		assertThrows(Exception.class, ()->bmi.bmi(0.0, 1.20));
		assertThrows(Exception.class, ()->bmi.bmi(0.0, 0.0));
		assertThrows(Exception.class, ()->bmi.bmi(-46.0, -1.45));
		assertThrows(Exception.class, ()->bmi.abdominalObesity(91.2, 'K'));
		assertThrows(Exception.class, ()->bmi.abdominalObesity(-23.3, 'K'));
		assertThrows(Exception.class, ()->bmi.abdominalObesity(-90.8, 'M'));
	}
}
