package bmicalc;

public class BMICalcImpl implements BMICalc {

	public double bmi(double mass, double height) {
		if(mass==0 || height==0 ) {
			throw new ArithmeticException("No puede ser 0");
		}else if( mass<0 || height <0) {
			throw new IllegalArgumentException("No pueden ser valores negativos");
		}
		double result = (mass)/(Math.pow(height,2));
		return result;
	}

	

	public String category(double bmi) {
		String cat="";
		if (bmi<=0 || bmi>=50) {
			throw new IllegalArgumentException("Valores imposibles");
		}
		
		if(bmi<18.5) {
			cat="UNDERWEIGHT";
		}else if (bmi>18.5 && bmi<24.9) {
			cat="NORMAL";
		}else if(bmi>25.0 && bmi<29.9) {
			cat="OVERWEIGHT";
		}else {
			cat="OBSESE";
		}
		return cat;
	}

	public boolean abdominalObesity(double waistCircumference, char gender) {
		boolean estar=false;
		if(gender!='M' && gender!='F') {
			throw new IllegalArgumentException("Argumento incorrecto");
		}
		if((gender=='M' && waistCircumference>90)||(gender=='F' && waistCircumference>80)){
			estar=true;
		}
		return estar;
	}

}