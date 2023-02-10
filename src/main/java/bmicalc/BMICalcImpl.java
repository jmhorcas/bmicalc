package bmicalc;

public class BMICalcImpl implements BMICalc {

	public double bmi(double mass, double height) {
		return mass / (height*height);
	}

	public String category(double bmi) {
		return "";
	}

	public boolean abdominalObesity(double waistCircumference, char gender) {
		return false;
	}

}
