package bmicalc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class BMICalcTest {
	static BMICalcImpl calc;
	
	@BeforeAll
	public static void loadCalc() {
		calc = new BMICalcImpl();
	}
	
	@ParameterizedTest
    @ValueSource(doubles = {1.5, 2.0, 3.2, 4.0, 10.5})
	public void bmiPositiveReals(double value) {
		assertEquals(value / (value*value), calc.bmi(value, value));
	}
	
	@ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 10})
	public void bmiPositiveInts(double value) {
		assertEquals(value / (value*value), calc.bmi(value, value));
	}
	
	@ParameterizedTest
    @ValueSource(doubles = {-1.5, -2.0, -3.2, -4.0, -10.5})
	public void bmiNegativeReals(double value) {
		assertEquals(value / (value*value), calc.bmi(value, value));
	}
	
	@ParameterizedTest
    @ValueSource(ints = {-1, -2, -3, -4, -10})
	public void bmiNegativeInts(double value) {
		assertEquals(value / (value*value), calc.bmi(value, value));
	}
	
	
}
