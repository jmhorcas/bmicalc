package bmicalc;

public class BMICalcImpl implements BMICalc {

	public double bmi(double mass, double height) {
		return 0.0;
	}

	public String category(double bmi) {
		String category = "";
		if (bmi < 18.5) category = "underweight";
		else if (18.5 <= bmi && bmi <= 24.9) category = "normal";
		else if (25 <= bmi && bmi <= 29.9) category = "overweight";
		else if (bmi >= 30) category = "obese";

		return category;
		
	}

	public boolean abdominalObesity(double waistCircumference, char gender) {
		return false;
	}

}
