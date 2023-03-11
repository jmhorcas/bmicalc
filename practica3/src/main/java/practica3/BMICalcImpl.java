package practica3;

public class BMICalcImpl implements BMICalc {

	public double bmi(double mass, double height) {
		if (height == 0) {
			throw new ArithmeticException();
		}
		
		if (mass < 0 || height < 0) { 
			throw new ArithmeticException();
		}
		
		if (height > 2.50 || height < 0.50 || mass > 635 || mass < 3) {
			throw new ArithmeticException();
		}
		
		return mass / (height*height);
	}

	public String category(double bmi) {
		String res;
		
		if (bmi < 0) {
			throw new ArithmeticException();
		}
		
		if (bmi > 106) {
			throw new ArithmeticException();
		}
		
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
		boolean res = false;
		
		if (gender != 'M' && gender != 'F') {
			throw new ArithmeticException();
		}
		
		if (waistCircumference < 0) {
			throw new ArithmeticException();
		}
		
		if (waistCircumference < 33 || waistCircumference > 303) {
			throw new ArithmeticException();
		}
		
		if (gender == 'M') {
			if (waistCircumference > 90) {
				res = true;
			}
		}
		
		if (gender == 'F') {
			if (waistCircumference > 80) {
				res = true;
			}
		}
		
		return res;
	}

}

