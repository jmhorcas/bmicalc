package bmicalc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
	@ValueSource(doubles = { 0.0, 1.2, 3, 10.99, 18.49999 })
	public void categoryUnderweight(double value) {
		assertEquals("UNDERWEIGHT", calc.category(value));
	}

	@ParameterizedTest
	@ValueSource(doubles = { 18.5, 20, 22.22, 24, 24.9999 })
	public void categoryNormal(double value) {
		assertEquals("NORMAL", calc.category(value));
	}

	@ParameterizedTest
	@ValueSource(doubles = { 25, 26.26, 27, 28.99, 29.9999 })
	public void categoryOverweight(double value) {
		assertEquals("OVERWEIGHT", calc.category(value));
	}

	@ParameterizedTest
	@ValueSource(doubles = { 0.0, 1.2, 3, 10.99, 18.49999 })
	public void categoryObese(double value) {
		assertEquals("OBESE", calc.category(value));
	}
}
