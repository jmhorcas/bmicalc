package bmicalc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BMICalcTest {
	
	@Test
	@DisplayName("Example Test Method.")
	public void bmi() {
		assertEquals(true, true);
	}

	/*   - underweight for a bmi below 18.5
	 *   - normal for a bmi between 18.5 and 24.9
	 *   - overweight for a bmi between 25.0 and 29.9
	 *   - obese for a bmi above or equal 30.0
	 * */
 
	@Test
	public void underweightCategoryTest() {
		BMICalcImpl calc = new BMICalcImpl();
		double[] nums = {0, 15, 18.49};
		for (int i = 0; i < nums.length; i++) {		
			String category = calc.category(nums[i]);
			assertEquals(category, "underweight");
		}
	}

	@Test
	public void underweightNegativeCategoryTest() {
		BMICalcImpl calc = new BMICalcImpl();	
		String category = calc.category(-5);
		assertEquals(category, "Error: negative input");
	}

	@Test
	public void normalCategoryTest() {
		BMICalcImpl calc = new BMICalcImpl();
		double[] nums = {18.5, 20, 24.9, 24.98};
		for (int i = 0; i < nums.length; i++) {		
			String category = calc.category(nums[i]);
			assertEquals(category, "normal");
		}
	}

	@Test
	public void overweightCategoryTest() {
		BMICalcImpl calc = new BMICalcImpl();
		double[] nums = {25.0, 27.7, 29.9, 29.95};
		for (int i = 0; i < nums.length; i++) {		
			String category = calc.category(nums[i]);
			assertEquals(category, "overweight");
		}
	}

	@Test
	public void obeseCategoryTest() {
		BMICalcImpl calc = new BMICalcImpl();
		double[] nums = {30, 40, 50};
		for (int i = 0; i < nums.length; i++) {		
			String category = calc.category(nums[i]);
			assertEquals(category, "obese");
		}
	}

	@Test
	public void positiveMaleAbdominalObesityTest() {
		BMICalcImpl calc = new BMICalcImpl();
		boolean obesity = calc.abdominalObesity(95, 'M');
		assertTrue(obesity);
	}

	@Test
	public void negativeMaleAbdominalObesityTest() {
		BMICalcImpl calc = new BMICalcImpl();
		boolean obesity = calc.abdominalObesity(80, 'M');
		assertFalse(obesity);
		obesity = calc.abdominalObesity(90, 'M');
		assertFalse(obesity);
	}

	@Test
	public void positiveFemaleAbdominalObesityTest() {
		BMICalcImpl calc = new BMICalcImpl();
		boolean obesity = calc.abdominalObesity(85, 'F');
		assertTrue(obesity);
	}

	@Test
	public void negativeFemaleAbdominalObesityTest() {
		BMICalcImpl calc = new BMICalcImpl();
		boolean obesity = calc.abdominalObesity(70, 'F');
		assertFalse(obesity);
		obesity = calc.abdominalObesity(80, 'F');
		assertFalse(obesity);
	}
	
}
