package bmicalc;

public class BMICalcImpl implements BMICalc {

	public double bmi(double mass, double height) {
		if (mass <= 0 || height <= 0) {
			throw new ArithmeticException("Los valores no pueden ser negativos");
		}
		double bmi = mass / (Math.pow(height, 2));
		return bmi;
	}

	public String category(double bmi) {
		if (bmi < 18.5) {
			return "UNDERWEIGHT";
		} else if(bmi > 18.5 && bmi < 24.9) {
			return "NORMAL";
		} else if(bmi > 25.0 && bmi < 29.9) {
			return "OVERWEIGHT";
		} else {
			return "OBESE";
		}
	}

	public boolean abdominalObesity(double waistCircumference, char gender) {
		if (waistCircumference > 80 && gender == 'F') {
			return true;
		} else if (waistCircumference > 90 && gender == 'M'){
			return true;
		} else {
			return false;
		}
		
	}

}
