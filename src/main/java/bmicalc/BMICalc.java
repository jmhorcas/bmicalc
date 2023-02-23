package bmicalc;


public interface BMICalc {
	
	/**
	 * Calculate the Body Mass Index (BMI) of a person.
	 * BMI = mass (kg) / height^2 (m)
	 * 
	 * @param mass 	 Weight of the person.
	 * @param height Height of the person.
	 * @return 		 The Body Mass Index (BMI) value.
	 * @throws Exception 
	 */
	public double bmi(double mass, double height) throws Exception;
	
	/**
	 * Categorize a person according to the BMI category:
	 *   - UNDERWEIGHT for a BMI below 18.5
	 *   - NORMAL for a BMI between 18.5 and 24.9
	 *   - OVERWEIGHT for a BMI between 25.0 and 29.9
	 *   - OBESE for a BMI above or equal 30.0
	 *   
	 * @param bmi Body Mass Index (BMI) value.
	 * @return	  String representing the BMI category.
	 */
	public String category(double bmi);
	
	/**
	 * Determine whether a person has abdominal obesity.
	 * A woman has abdominal obesity if her waist circumference is greater than 80 cm.
	 * A man has abdominal obesity if his waist circumference is greater than 90 cm.
	 * 
	 * @param waistCircumference	Waist circumference.
	 * @param gender				Male ('M') or Female ('F').
	 * @return						True if the person has abdominal obesity, false otherwise.
	 * @throws Exception 
	 */
	public boolean abdominalObesity(double waistCircumference, char gender) throws Exception;
}
