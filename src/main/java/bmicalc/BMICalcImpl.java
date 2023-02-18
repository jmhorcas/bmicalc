package bmicalc;

public class BMICalcImpl implements BMICalc {

	public double bmi(double mass, double height) {
		return Math.abs(mass) / Math.pow(height, 2);
	}

	public String category(double bmi) {
		String category = "";
		if (bmi < 0) category = "Error: negative input";
		else if (bmi < 18.5) category = "underweight";
		else if (18.5 <= bmi && bmi < 25) category = "normal";
		else if (25 <= bmi && bmi < 30) category = "overweight";
		else if (bmi >= 30) category = "obese";

		return category;
		
	}

	public boolean abdominalObesity(double waistCircumference, char gender) {
		boolean hasObesity = false;
		if (gender == 'M' && waistCircumference > 90) hasObesity = true;
		else if (gender == 'F' && waistCircumference > 80) hasObesity = true;
		return hasObesity;
	}

}
