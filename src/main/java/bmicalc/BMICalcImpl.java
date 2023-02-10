package bmicalc;

public class BMICalcImpl implements BMICalc {

	public double bmi(double mass, double height) {
		if (height == 0) {
			throw new ArithmeticException();
		}
		
		if (mass < 0) {
			mass = -mass;
		}
		
		if (height < 0) {
			height = -height;
		}
		
		return mass / (height*height);
	}

	public String category(double bmi) {
		return "";
	}

	public boolean abdominalObesity(double waistCircumference, char gender) {
		return false;
	}

}
