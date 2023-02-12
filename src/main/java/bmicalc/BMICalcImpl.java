package bmicalc;


public class BMICalcImpl implements BMICalc {

	public double bmi(double mass, double height) {
		
		if(mass <= 0 || height <=0) {
			return  -1;
		}
		
		double bmi = mass / Math.pow(height, 2);
		//DecimalFormat f = new DecimalFormat("#.0000");
		//bmi = Double.parseDouble(f.format(bmi));
		return bmi;
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
	public String category(double bmi) {
		String res;
		if(bmi <=0) {
			res = "Invalid bmi value";
		}else if (bmi > 0 && bmi < 18.5) {
			res = "UNDERWEIGHT";
			
		}else if (bmi >= 18.5 && bmi < 25) {
			res = "NORMAL";
			
		}else if (bmi >= 25 && bmi < 30) {
			res = "OVERWEIGHT";
			
		}else {
			res = "OBESE";
		}
		return res;
	}

	public boolean abdominalObesity(double waistCircumference, char gender) {
		return false;
	}

}
