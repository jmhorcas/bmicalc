package bmicalc;

public class BMICalcImpl implements BMICalc {

	public double bmi(double mass, double height) {
		if(mass>0 && height>0)
			return mass / (height * height);
		else return 0;
	}

	public String category(double bmi) {
		if (bmi<=0) return "ERROR: El BMI debe ser mayor que 0";
		
		else if(bmi<18.5) return "UNDERWEIGHT";
		else if (bmi<=24.9) return "NORMAL";
		else if (bmi<=29.9) return "OVERWEIGHT";
		else return "OBESE";

	}
	/**
	 * Determine whether a person has abdominal obesity.
	 * A woman has abdominal obesity if her waist circumference is greater than 80 cm.
	 * A man has abdominal obesity if his waist circumference is greater than 90 cm.
	 * 
	 * @param waistCircumference	Waist circumference.
	 * @param gender				Male ('M') or Female ('F').
	 * @return						True if the person has abdominal obesity, false otherwise.
	 */
	public boolean abdominalObesity(double waistCircumference, char gender) {
		
		 return false;
		
	}

}
