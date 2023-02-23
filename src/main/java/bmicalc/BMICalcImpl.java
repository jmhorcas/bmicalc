package bmicalc;

public class BMICalcImpl implements BMICalc {

	public double bmi(double mass, double height) {
		if (mass <= 0 || height <= 0) {
			throw new RuntimeException("EXCEPTION: Invalid arguments");
		} else {
			return mass / Math.pow(height, 2);
		}
	}

	public String category(double bmi) {
		String res = "";
		if (bmi < 18.5 && bmi > 0) {
			res = "UNDERWEIGHT";
		} else if (bmi >= 18.5 && bmi <= 24.9) {
			res = "NORMAL";
		} else if (bmi >= 25 && bmi <= 29.9) {
			res = "OVERWEIGHT";
		} else if (bmi >= 30) {
			res = "OBESE";
		} else {
			throw new RuntimeException("EXCEPTION: Invalid arguments");
		}
		return res;
	}

	public boolean abdominalObesity(double waistCircumference, char gender) {
		boolean res = false;
		if (waistCircumference <= 0 || (gender != 'M' && gender != 'F')) {
			throw new RuntimeException("EXCEPTION: Invalid arguments");
		} else if (gender == 'F' && waistCircumference > 80) {
			res = true;
		} else if (gender == 'M' && waistCircumference > 90) {
			res = true;
		}
		return res;
	}

}
