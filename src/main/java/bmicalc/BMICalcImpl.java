package bmicalc;

public class BMICalcImpl implements BMICalc {

	public double bmi(double mass, double height) {

		if (mass <= 0 || mass > 800) {
			throw new RuntimeException("Invalid mass value");
		} else if (height <= 0 || height > 3) {
			throw new RuntimeException("Invalid height value");
		}

		double bmi = mass / Math.pow(height, 2);

		return bmi;
	}

	public String category(double bmi) {
		String res;
		if (bmi <= 0) {
			res = "Invalid bmi value";
		} else if (bmi > 0 && bmi < 18.5) {
			res = "UNDERWEIGHT";

		} else if (bmi >= 18.5 && bmi < 25) {
			res = "NORMAL";

		} else if (bmi >= 25 && bmi < 30) {
			res = "OVERWEIGHT";

		} else {
			res = "OBESE";
		}
		return res;
	}

	public boolean abdominalObesity(double waistCircumference, char gender) {
		boolean res;
		gender = Character.toUpperCase(gender);
		if (waistCircumference <= 0 || waistCircumference > 1000) {
			throw new RuntimeException("Invalid waist circumference value");
		} else if (gender != 'M' && gender != 'F') {
			throw new RuntimeException("Invalid gender character");
		} else if (gender == 'M') {
			if (waistCircumference <= 90) {
				res = false;
			} else {
				res = true;
			}
		} else {
			if (waistCircumference <= 80) {
				res = false;
			} else {
				res = true;
			}
		}
		return res;
	}

}
