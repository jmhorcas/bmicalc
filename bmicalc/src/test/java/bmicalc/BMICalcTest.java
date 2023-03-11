package bmicalc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class BMICalcTest {
	static BMICalcImpl calc;

	@BeforeAll
	public static void loadCalc() {
		calc = new BMICalcImpl();
	}

	// Tests for bmi

	@Test
	public void bmiPositiveReals() {
		double mass = 60.5;
		double height = 1.8;
		assertEquals(mass / (height * height), calc.bmi(mass, height));
	}

	@Test
	public void bmiPositiveInts() {
		int mass = 60;
		int height = 2;
		assertEquals(mass / (height * height), calc.bmi(mass, height));
	}

	@Test
	public void bmiNegativeMass() {
		assertThrows(ArithmeticException.class, () -> calc.bmi(-2, 20));
	}
	
	@Test
	public void bmiNegativeHeight() {
		assertThrows(ArithmeticException.class, () -> calc.bmi(1.5, -2));
	}
	
	@Test
	public void bmiNegativeBoth() {
		assertThrows(ArithmeticException.class, () -> calc.bmi(-4, -2));
	}
	
	@Test
	public void bmiMassZero() {
		assertThrows(ArithmeticException.class, () -> calc.bmi(0, 50));
	}

	@Test
	public void bmiHeightZero() {
		assertThrows(ArithmeticException.class, () -> calc.bmi(60, 0));
	}
	
	@ParameterizedTest
	@ValueSource(doubles = {0.3, 3})
	public void bmiHeightOutOfBonds(double value) {
		assertThrows(ArithmeticException.class, () -> calc.bmi(60, value));
	}
	
	@ParameterizedTest
	@ValueSource(doubles = {1, 650})
	public void bmiMassOutOfBonds(double value) {
		assertThrows(ArithmeticException.class, () -> calc.bmi(value, 1.7));
	}

	// Tests for category

	@ParameterizedTest
	@ValueSource(doubles = {0.0, 1.2, 3, 10.99, 18.49999})
	public void categoryUnderweight(double value) {
		assertEquals("UNDERWEIGHT", calc.category(value));
	}

	@ParameterizedTest
	@ValueSource(doubles = {18.5, 20, 22.22, 24, 24.9999})
	public void categoryNormal(double value) {
		assertEquals("NORMAL", calc.category(value));
	}

	@ParameterizedTest
	@ValueSource(doubles = {25, 26.26, 27, 28.99, 29.9999})
	public void categoryOverweight(double value) {
		assertEquals("OVERWEIGHT", calc.category(value));
	}

	@ParameterizedTest
	@ValueSource(doubles = {30, 31.2, 33.222, 40, 100})
	public void categoryObese(double value) {
		assertEquals("OBESE", calc.category(value));
	}
	
	@Test
	public void categoryNegative() {
		assertThrows(ArithmeticException.class, () -> calc.category(-1));
	}
	
	@Test
	public void categoryBMIOutOfBonds() {
		assertThrows(ArithmeticException.class, () -> calc.category(120));
	}
	
	// Tests for abdominalObesity
	
	@ParameterizedTest
	@ValueSource(doubles = {90.001, 91, 98.99, 100, 103.254})
	public void abdominalMaleTrue(double value) {
		assertTrue(calc.abdominalObesity(value, 'M'));
	}
	
	@ParameterizedTest
	@ValueSource(doubles = {35, 40.1, 45.121, 89.999, 90})
	public void abdominalMaleFalse(double value) {
		assertFalse(calc.abdominalObesity(value, 'M'));
	}
	
	@ParameterizedTest
	@ValueSource(doubles = {80.001, 81, 90, 100, 103.254})
	public void abdominalFemaleTrue(double value) {
		assertTrue(calc.abdominalObesity(value, 'F'));
	}
	
	@ParameterizedTest
	@ValueSource(doubles = {35, 40.1, 45.121, 79.999, 80})
	public void abdominalFemaleFalse(double value) {
		assertFalse(calc.abdominalObesity(value, 'F'));
	}
	
	@Test
	public void abdominalm() {
		assertThrows(ArithmeticException.class, () -> calc.abdominalObesity(91, 'm'));
	}
	
	@Test
	public void abdominalf() {
		assertThrows(ArithmeticException.class, () -> calc.abdominalObesity(91, 'f'));
	}
	
	@Test
	public void abdominalDifferent() {
		assertThrows(ArithmeticException.class, () -> calc.abdominalObesity(91, 'k'));
	}
	
	@Test
	public void abdominalNegative() {
		assertThrows(ArithmeticException.class, () -> calc.abdominalObesity(-5, 'F'));
	}
	
	@ParameterizedTest
	@ValueSource(doubles = {20, 400})
	public void abdominalOutOfBonds(double value) {
		assertThrows(ArithmeticException.class, () -> calc.abdominalObesity(value, 'F'));
	}
}
