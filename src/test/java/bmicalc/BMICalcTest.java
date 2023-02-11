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

	@ParameterizedTest
	@ValueSource(doubles = { 1.5, 2.0, 3.2, 4.0, 10.5 })
	public void bmiPositiveReals(double value) {
		assertEquals(value / (value * value), calc.bmi(value, value));
	}

	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 3, 4, 10 })
	public void bmiPositiveInts(double value) {
		assertEquals(value / (value * value), calc.bmi(value, value));
	}

	@ParameterizedTest
	@ValueSource(doubles = { -1.5, -2.0, -3.2, -4.0, -10.5 })
	public void bmiNegativeReals(double value) {
		assertEquals(-value / (-value * -value), calc.bmi(value, value));
	}

	@ParameterizedTest
	@ValueSource(ints = { -1, -2, -3, -4, -10 })
	public void bmiNegativeInts(double value) {
		assertEquals(-value / (-value * -value), calc.bmi(value, value));
	}

	@Test
	public void bmiMassZero() {
		assertEquals(0, calc.bmi(0, 10));
	}

	@Test
	public void bmiHeightZero() {
		assertThrows(ArithmeticException.class, () -> calc.bmi(1, 0));
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
		assertEquals("UNDERWEIGHT", calc.category(-1));
	}
	
	// Tests for abdominalObesity
	
	@ParameterizedTest
	@ValueSource(doubles = {90.001, 91, 98.99, 100, 103.254})
	public void abdominalMaleTrue(double value) {
		assertTrue(calc.abdominalObesity(value, 'M'));
	}
	
	@ParameterizedTest
	@ValueSource(doubles = {10, 20, 30.121, 89.999, 90})
	public void abdominalMaleFalse(double value) {
		assertFalse(calc.abdominalObesity(value, 'M'));
	}
	
	@ParameterizedTest
	@ValueSource(doubles = {80.001, 81, 90, 100, 103.254})
	public void abdominalFemaleTrue(double value) {
		assertTrue(calc.abdominalObesity(value, 'F'));
	}
	
	@ParameterizedTest
	@ValueSource(doubles = {10, 20, 30.121, 79.999, 80})
	public void abdominalFemaleFalse(double value) {
		assertFalse(calc.abdominalObesity(value, 'F'));
	}
}
