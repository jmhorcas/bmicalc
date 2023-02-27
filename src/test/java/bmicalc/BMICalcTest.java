package bmicalc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BMICalcTest {
	
	@Test
	@DisplayName("BMI.")
	public void bmi() {
		BMICalcImpl a=new BMICalcImpl();
		assertEquals(a.bmi(1,1), 1);
	}
	
	@Test
	@DisplayName("BMI con peso igual a 0")
	public void bmiPeso0() {
		BMICalcImpl a=new BMICalcImpl();
		assertThrows(ArithmeticException.class,()->a.bmi(1,0));
	}
	@Test
	public void masanegativa(){
		BMICalcImpl a=new BMICalcImpl();
		assertThrows(Exception.class,()->a.bmi(-1,1));
	}
	@Test
	public void underweight() {
		BMICalcImpl a=new BMICalcImpl();
		assertEquals(a.category(18.4),"UNDERWEIGHT");
	}
	@Test
	public void Normal1() {
		BMICalcImpl a=new BMICalcImpl();
		assertEquals(a.category(18.5),"NORMAL");
	}
	@Test
	public void Normal2() {
		BMICalcImpl a=new BMICalcImpl();
		assertEquals(a.category(24.9),"NORMAL");
	}
	@Test
	public void OverWeight1() {
		BMICalcImpl a=new BMICalcImpl();
		assertEquals(a.category(25),"OVERWEIGHT");
	}
	@Test
	public void OverWeight2() {
		BMICalcImpl a=new BMICalcImpl();
		assertEquals(a.category(29.9),"OVERWEIGHT");
	}
	@Test
	public void Obese() {
		BMICalcImpl a=new BMICalcImpl();
		assertEquals(a.category(30),"OBESE");
	}
	@Test
	public void categoryBmiNegativo() {
		BMICalcImpl a=new BMICalcImpl();
		assertThrows(Exception.class,()->a.category(-2));
	}
	@Test
	public void aogenderMwc100(){
		BMICalcImpl a=new BMICalcImpl();
		assertTrue(a.abdominalObesity(100,'M'));
	}
	@Test
	public void aogenderFwc90(){
		BMICalcImpl a=new BMICalcImpl();
		assertTrue(a.abdominalObesity(0.9,'F'));
	}
	@Test
	public void aogenderMwc80(){
		BMICalcImpl a=new BMICalcImpl();
		assertFalse(a.abdominalObesity(0.8,'M'));
	}
	@Test
	public void aogenderFwc70(){
		BMICalcImpl a=new BMICalcImpl();
		assertFalse(a.abdominalObesity(0.7,'F'));
	}
	@Test
	public void genderDistinto() {
		BMICalcImpl a=new BMICalcImpl();
		assertThrows(Exception.class,()->a.abdominalObesity(2,'D'));
	}
	@Test
	public void waistCircumferenceNegativo() {
		BMICalcImpl a=new BMICalcImpl();
		assertThrows(Exception.class,()->a.abdominalObesity(-2, 'M'));
	}
}
