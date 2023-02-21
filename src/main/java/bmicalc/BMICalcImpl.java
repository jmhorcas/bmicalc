package bmicalc;

public class BMICalcImpl implements BMICalc {

	public double bmi(double mass, double height) {
		if (mass <= 0 || height <= 0) throw new ArithmeticException("No puedes introducir valores nulos o negativos");
		else if (mass > height * 100) throw new ArithmeticException("Relación masa altura irreal");
		return mass / Math.pow(height, 2);
	}

	public String category(double bmi) {
		if (bmi < 0) throw new IllegalArgumentException("BMI no puede ser negativo");
		String category = "";
		
		if (bmi < 18.5) category = "underweight";
		else if (18.5 <= bmi && bmi < 25) category = "normal";
		else if (25 <= bmi && bmi < 30) category = "overweight";
		else if (bmi >= 30) category = "obese";

		return category;
		
	}

	public boolean abdominalObesity(double waistCircumference, char gender) {
		if (waistCircumference <= 0) throw new ArithmeticException("No puedes introducir valores nulos o negativos");
		if (gender != 'M' && gender != 'F') throw new IllegalArgumentException("Género mal especificado, se esperaba 'M' o 'F'.");

		boolean hasObesity = false;
		if (gender == 'M' && waistCircumference > 90) hasObesity = true;
		else if (gender == 'F' && waistCircumference > 80) hasObesity = true;
		return hasObesity;
	}

}
