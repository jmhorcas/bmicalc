package bmicalc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BMICalcTest {

	private BMICalcImpl calc;

	@BeforeEach
	public void inicializar() {
		calc = new BMICalcImpl();
	}

	@Test
	@DisplayName("Negative values for both parameters")
	public void bmitest1() {
		assertThrows(RuntimeException.class, () -> calc.bmi(-1, -3));
	}

	@Test
	@DisplayName("Negative value for mass and height = 0")
	public void bmitest2() {
		assertThrows(RuntimeException.class, () -> calc.bmi(-3, 0));
	}

	@Test
	@DisplayName("Negative value for mass")
	public void bmitest3() {
		assertThrows(RuntimeException.class, () -> calc.bmi(-1, 1.61));
	}

	@Test
	@DisplayName("Negative value for height and mass = 0")
	public void bmitest4() {
		assertThrows(RuntimeException.class, () -> calc.bmi(0, -3));
	}
	
	@Test
	@DisplayName("Negative value for height")
	public void bmitest5() {
		assertThrows(RuntimeException.class, () -> calc.bmi(61, -3));
	}
	
	@Test
	@DisplayName("BMI test with accurate values")
	public void bmitestCorrect() {
		assertEquals(18.924941241109856, calc.bmi(62, 1.81));
	}
	
	@Test
	@DisplayName("BMI test with accurate values")
	public void bmitestCorrect2() {
		assertEquals(20.775623268698062, calc.bmi(75, 1.90));
		
	}
	
	@Test
	@DisplayName("Category with negative bmi")
	public void category1() {
		assertThrows(RuntimeException.class, () -> calc.category(-2));
	}
	
	@Test
	@DisplayName("Category with bmi = 0")
	public void category2() {
		assertThrows(RuntimeException.class, () -> calc.category(0));
	}
	
	@Test
	@DisplayName("Category with bmi = 10")
	public void category3() {
		assertEquals("UNDERWEIGHT", calc.category(10));
	}
	
	@Test
	@DisplayName("Category with bmi = 18.4")
	public void category4() {
		assertEquals("UNDERWEIGHT", calc.category(18.4));
	}
	
	@Test
	@DisplayName("Category with bmi = 18.5")
	public void category5() {
		assertEquals("NORMAL", calc.category(18.5));
	}

	@Test
	@DisplayName("Category with bmi = 20")
	public void category6() {
		assertEquals("NORMAL", calc.category(20));
	}
	
	@Test
	@DisplayName("Category with bmi = 24.9")
	public void category7() {
		assertEquals("NORMAL", calc.category(24.9));
	}
	
	@Test
	@DisplayName("Category with bmi = 25")
	public void category8() {
		assertEquals("OVERWEIGHT", calc.category(25));
	}
	
	@Test
	@DisplayName("Category with bmi = 27")
	public void category9() {
		assertEquals("OVERWEIGHT", calc.category(27));
	}
	
	@Test
	@DisplayName("Category with bmi = 29.9")
	public void category10() {
		assertEquals("OVERWEIGHT", calc.category(29.9));
	}
	
	@Test
	@DisplayName("Category with bmi = 30")
	public void category11() {
		assertEquals("OBESE", calc.category(30));
	}
	
	@Test
	@DisplayName("Category with bmi = 35")
	public void category12() {
		assertEquals("OBESE", calc.category(35));
	}
	
	@Test
	@DisplayName("Abdominal obesity negative circunference male")
	public void abdominalObesity1() {
		assertThrows(RuntimeException.class, () -> calc.abdominalObesity(-2, 'M'));
	}
	
	@Test
	@DisplayName("Abdominal obesity zero circunference female")
	public void abdominalObesity2() {
		assertThrows(RuntimeException.class, () -> calc.abdominalObesity(0, 'F'));
	}
	
	@Test
	@DisplayName("Abdominal obesity invalid gender")
	public void abdominalObesity3() {
		assertThrows(RuntimeException.class, () -> calc.abdominalObesity(56, 'P'));
	}
	
	@Test
	@DisplayName("Abdominal obesity invalid gender")
	public void abdominalObesity4() {
		assertThrows(RuntimeException.class, () -> calc.abdominalObesity(2, 'Q'));
	}
	
	@Test
	@DisplayName("Abdominal obesity invalid gender")
	public void abdominalObesity5() {
		assertThrows(RuntimeException.class, () -> calc.abdominalObesity(43, 'K'));
	}
	
	@Test
	@DisplayName("Abdominal obesity negative circunference female")
	public void abdominalObesity6() {
		assertThrows(RuntimeException.class, () -> calc.abdominalObesity(-4, 'F'));
	}
	
	@Test
	@DisplayName("Abdominal obesity zero circunference male")
	public void abdominalObesity7() {
		assertThrows(RuntimeException.class, () -> calc.abdominalObesity(0, 'M'));
	}
	
	@Test
	@DisplayName("Abdominal obesity circunference = 10 male")
	public void abdominalObesity8() {
		assertEquals(false, calc.abdominalObesity(10, 'M'));
	}
	
	@Test
	@DisplayName("Abdominal obesity circunference = 70 male")
	public void abdominalObesity9() {
		assertEquals(false, calc.abdominalObesity(70, 'M'));
	}
	
	@Test
	@DisplayName("Abdominal obesity circunference = 90 male")
	public void abdominalObesity10() {
		assertEquals(false, calc.abdominalObesity(90, 'M'));
	}
	
	@Test
	@DisplayName("Abdominal obesity circunference = 91 male")
	public void abdominalObesity11() {
		assertEquals(true, calc.abdominalObesity(91, 'M'));
	}
	
	@Test
	@DisplayName("Abdominal obesity circunference = 100 male")
	public void abdominalObesity12() {
		assertEquals(true, calc.abdominalObesity(100, 'M'));
	}
	
	@Test
	@DisplayName("Abdominal obesity circunference = 15 female")
	public void abdominalObesity13() {
		assertEquals(false, calc.abdominalObesity(15, 'F'));
	}
	
	@Test
	@DisplayName("Abdominal obesity circunference = 27 female")
	public void abdominalObesity14() {
		assertEquals(false, calc.abdominalObesity(27, 'F'));
	}
	
	@Test
	@DisplayName("Abdominal obesity circunference = 79 female")
	public void abdominalObesity15() {
		assertEquals(false, calc.abdominalObesity(79, 'F'));
	}
	
	@Test
	@DisplayName("Abdominal obesity circunference = 80 female")
	public void abdominalObesity16() {
		assertEquals(false, calc.abdominalObesity(80, 'F'));
	}
	
	@Test
	@DisplayName("Abdominal obesity circunference = 81 female")
	public void abdominalObesity17() {
		assertEquals(true, calc.abdominalObesity(81, 'F'));
	}
	
	@Test
	@DisplayName("Abdominal obesity circunference = 90 female")
	public void abdominalObesity18() {
		assertEquals(true, calc.abdominalObesity(90, 'F'));
	}
	
	
}
