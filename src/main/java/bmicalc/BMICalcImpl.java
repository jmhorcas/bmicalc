package bmicalc;

public class BMICalcImpl implements BMICalc {

	public double bmi(double mass, double height) {
		if(mass<=0 || height<=0) {
			throw new RuntimeException("La masa y la altura deben ser valores positivos");
		}
		double bmi = mass/Math.pow(height, 2);
		double round=Math.round(bmi*100);
		double bmiround=round/100;
		return bmiround;
	}

	public String category(double bmi) {
		String str = "";
		if(bmi<18.5) {
			str = "UNDERWEIGHT";
		} else if (18.5 <= bmi && bmi < 25.0) {
			str = "NORMAL";
		} else if (25.0 <= bmi && bmi < 30.0) {
			str = "OVERWEIGHT";
		} else {
			str = "OBESE";
		}
		return str;
	}

	public boolean abdominalObesity(double waistCircumference, char gender) throws Exception {
		if (gender != 'M' && gender != 'F') {
			throw new Exception("El g�nero debe ser Masculino (M) o femenino(F)");
		} else if(waistCircumference<=0.0) {
			throw new Exception("El radio de circunferencia debe ser un valor positivo");
		}
		boolean obese = false;
		if(waistCircumference > 90.0 && gender == 'M') {
			obese = true;
		} else if (waistCircumference > 80.0 && gender == 'F') {
			obese = true;
		} else {
			obese = false;
		}
		return obese;
	}

}
