package bmicalc;

public class BMICalcImpl implements BMICalc {
	
	public BMICalcImpl() {
		
	}

	public double bmi(double mass, double height) {
		
		if ( height<=0 || mass<=0) {
			throw new ArithmeticException();
		}
		
		if (mass<0.420 || mass>635) {
			throw new ArithmeticException();
		}
		
		if (height<0.023 || height>2.6) {
			throw new ArithmeticException();
		}
		
		
		return (mass/(height*height));
	}

	public String category(double bmi) {
		
		String category = null;
		if (bmi < 18.5) {
			category = "UNDERWEIGHT";
		}
		else if (bmi >= 18.5 && bmi <=24.9) {
			category = "NORMAL";
		}
		else if (bmi >= 25.0 && bmi <=29.9) {
			category = "OVERWEIGHT";
		}
		else if (bmi >=30) {
			category = "OBESE";
		}
		
		return category;
	}

	public boolean abdominalObesity(double waistCircumference, char gender) {
		boolean ao = false;
		if ( gender!= 'F' && gender!= 'M') {
			throw new RuntimeException();
		}
		if (gender=='F' && waistCircumference>80) {
			ao = true;
		} else if (gender=='M' && waistCircumference>90) {
			ao = true;
		}
		return ao;
	}

}
