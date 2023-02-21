package bmicalc;

public class BMICalcImpl implements BMICalc {
	private double mass;
	private double height;

	private char Male = 'M';
	private char Female = 'F';

	public double bmi(double mass, double height) {
		if (height <= 0 || mass <= 0)
			throw new RuntimeException("Weight or mass can not be under 0 or equal to 0");
		this.mass = mass;
		this.height = height;
		return mass / (height * height);
	}

	public String category(double bmi) {
		if (bmi <= 0)
			throw new RuntimeException("bmi can not be under 0 or equal to 0");
		if (bmi < 18.5) {
			return "UNDERWEIGHT";
		} else if (bmi < 25) {
			return "NORMAL";
		} else if (bmi < 30) {
			return "OVERWEIGHT";
		} else {
			return "OBESE";
		}
	}

	public boolean abdominalObesity(double waistCircumference, char gender) {
		if (gender != Male || gender != Female)
			throw new RuntimeException("You must choose a gender: M or F");
		if (waistCircumference <= 0)
			throw new RuntimeException("waistCircumference can not be under or equal to 0");

		if (gender == Male) {
			if (waistCircumference < 102) {
				return false;
			} else {
				return true;
			}
		} else {
			if (waistCircumference < 88) {
				return false;
			} else {
				return true;
			}
		}
	}

}
