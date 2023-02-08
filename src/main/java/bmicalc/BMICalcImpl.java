package bmicalc;

public class BMICalcImpl implements BMICalc {

	public double bmi(double mass, double height) {
		
		return mass / (height * height);
	}

	public String category(double bmi) {
		
		
		if(bmi<18.5) return "UNDERWEIGHT";
		else if (bmi<=24.9) return "NORMAL";
		else if (bmi<=29.9) return "OVERWEIGHT";
		else return "OBESE";

	}
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

	public boolean abdominalObesity(double waistCircumference, char gender) {
		return false;
	}

}
