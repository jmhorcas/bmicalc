package bmicalc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.swing.text.StyledEditorKit.UnderlineAction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BMICalcTest {
	private BMICalcImpl test = new BMICalcImpl();
	
	@Test
	@DisplayName("Test bmi method.")
	public void bmi() {
		//Test a known problem
		assertEquals((70)/(1.75*1.75), test.bmi(70, 1.75)); 
		
		//Test if an error message appears when height or mass is under 0.
		assertThrows(RuntimeException.class, () ->{
			test.bmi(-70, 1.75);
		});
		assertThrows(RuntimeException.class, () ->{
			test.bmi(70, -1.75);
		});
		
		//Test if an error message appears when height or mass is equal to 0.
		assertThrows(RuntimeException.class, () ->{
			test.bmi(70, 0);
		});
		assertThrows(RuntimeException.class, () ->{
			test.bmi(0, 1.75);
		});
	}
	
	@Test
	@DisplayName("Test category method.")
	public void category() {
		//Test if an error message appears when bmi is under 0.
		assertThrows(RuntimeException.class, () ->{
			test.category(-10);
		});
		
		//Test if an error message appears when bmi is equal to 0.
		assertThrows(RuntimeException.class, () ->{
			test.category(0);
		});
		
		//Test if value under 18.5 is UNDERWEIGHT
		assertEquals("UNDERWEIGHT", test.category(17));
		
		//Test if value equal to 18.5 is NORMAL
		assertEquals("NORMAL", test.category(18.5));
		
		//Test if value equal to 25 is OVERWEIGHT
		assertEquals("OVERWEIGHT", test.category(25));
		
		//Test if value equal to 30 is OBESE
		assertEquals("OBESE", test.category(30));
		
		//Test if value over 30 is OBESE
		assertEquals("OBESE", test.category(34));
	}
	
	@Test
	@DisplayName("Test abdominalObesity method.")
	public void abdominalObesity() {
		//Test if an error message appears when waistCircumference is under 0.
		assertThrows(RuntimeException.class, () ->{
			test.abdominalObesity(-23, 'M');
		});
		assertThrows(RuntimeException.class, () ->{
			test.abdominalObesity(-23, 'F');
		});
		
		//Test if an error message appears when waistCircumference is equal to 0.
		assertThrows(RuntimeException.class, () ->{
			test.abdominalObesity(0, 'M');
		});
		assertThrows(RuntimeException.class, () ->{
			test.abdominalObesity(0, 'F');
		});
		
		//Test if gender is male or female.
		assertThrows(RuntimeException.class, () ->{
			test.abdominalObesity(23, 'c');
		});
	}
}
