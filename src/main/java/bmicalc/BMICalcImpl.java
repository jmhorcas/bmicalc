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
		String res;
		
		if (bmi < 18.5) {
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
