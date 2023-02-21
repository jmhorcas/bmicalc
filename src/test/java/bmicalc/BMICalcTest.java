package bmicalc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BMICalcTest {
	
	
	
	@Test
	@DisplayName("bmi_1")
	public void bmi_1() {
		BMICalcImpl c = new BMICalcImpl();
		boolean thrown = false;
		try {
			c.bmi(0, 0);
		}catch(ArithmeticException e) {
			thrown = true ;
		}
		assertEquals(thrown,true);	
	}
	@Test
	@DisplayName("bmi_2")
	public void bmi_2() {
		BMICalcImpl c = new BMICalcImpl();
		boolean thrown = false;
		try {
			c.bmi(-1, -1);
		}catch(ArithmeticException e) {
			thrown = true ;
		}
		assertEquals(thrown,true);	
		
	}
	@Test
	@DisplayName("bmi_3")
	public void bmi_3() {
		BMICalcImpl c = new BMICalcImpl();
		assertEquals(c.bmi(81,1.8), 25);
	}
	@Test
	@DisplayName("category_4")
	public void bmi_4() {
		BMICalcImpl c = new BMICalcImpl();
		assertEquals(c.category(0), "ERROR");
	}
	@Test
	@DisplayName("category_5")
	public void bmi_5() {
		BMICalcImpl c = new BMICalcImpl();
		assertEquals(c.category(-1), "ERROR");
	}
	@Test
	@DisplayName("category_6")
	public void bmi_6() {
		BMICalcImpl c = new BMICalcImpl();
		assertEquals(c.category(18), "UNDERWEIGHT");
	}
	@Test
	@DisplayName("category_7")
	public void bmi_7() {
		BMICalcImpl c = new BMICalcImpl();
		assertEquals(c.category(18.5), "NORMAL");
	}
	@Test
	@DisplayName("category_8")
	public void bmi_8() {
		BMICalcImpl c = new BMICalcImpl();
		assertEquals(c.category(24.9), "NORMAL");
	}
	@Test
	@DisplayName("category_9")
	public void bmi_9() {
		BMICalcImpl c = new BMICalcImpl();
		assertEquals(c.category(25), "OVERWEIGHT");
	}
	@Test
	@DisplayName("category_10")
	public void bmi_10() {
		BMICalcImpl c = new BMICalcImpl();
		assertEquals(c.category(29.9), "OVERWEIGHT");
	}
	@Test
	@DisplayName("category_11")
	public void bmi_11() {
		BMICalcImpl c = new BMICalcImpl();
		assertEquals(c.category(30), "OBESE");
	}
	@Test
	@DisplayName("admObsty_12")
	public void bmi_12() {
		BMICalcImpl c = new BMICalcImpl();
		boolean thrown = false;
		try {
			c.abdominalObesity(0, 'M');
		}catch(RuntimeException e) {
			thrown = true ;
		}
		assertEquals(thrown,true);	
		
	}
	@Test
	@DisplayName("admObsty_13")
	public void bmi_13() {
		BMICalcImpl c = new BMICalcImpl();
		boolean thrown = false;
		try {
			c.abdominalObesity(-1, 'M');
		}catch(RuntimeException e) {
			thrown = true ;
		}
		assertEquals(thrown,true);	
	}
	@Test
	@DisplayName("admObsty_14")
	public void bmi_14() {
		BMICalcImpl c = new BMICalcImpl();
		boolean thrown = false;
		try {
			c.abdominalObesity(80, 'G');
		}catch(RuntimeException e) {
			thrown = true ;
		}
		assertEquals(thrown,true);	
		
	}
	@Test
	@DisplayName("admObsty_15")
	public void bmi_15() {
		BMICalcImpl c = new BMICalcImpl();
		assertEquals(c.abdominalObesity(89, 'M'), false);
	}
	@Test
	@DisplayName("admObsty_16")
	public void bmi_16() {
		BMICalcImpl c = new BMICalcImpl();
		assertEquals(c.abdominalObesity(90, 'M'), false);
	}
	@Test
	@DisplayName("admObsty_17")
	public void bmi_17() {
		BMICalcImpl c = new BMICalcImpl();
		assertEquals(c.abdominalObesity(91, 'M'), true);
	}
	@Test
	@DisplayName("admObsty_18")
	public void bmi_18() {
		BMICalcImpl c = new BMICalcImpl();
		assertEquals(c.abdominalObesity(79, 'F'), false);
	}
	@Test
	@DisplayName("admObsty_19")
	public void bmi_19() {
		BMICalcImpl c = new BMICalcImpl();
		assertEquals(c.abdominalObesity(80, 'F'), false);
	}
	@Test
	@DisplayName("admObsty_20")
	public void bmi_20() {
		BMICalcImpl c = new BMICalcImpl();
		assertEquals(c.abdominalObesity(81, 'F'), true);
	}
	
}
