package nl.hu.iac.rest;

public class BmiService implements BmiInterface {
	
	public BmiService() {
		
	}

	/**
	 * Returns BMI in metric (weight in kg / height in cm / height in cm * 10000)
 	 * 
	 * @return      Result of BMI formula
	 */
	@Override
	public float calcBmi(Bmi bmi) {
		float r = (float) (bmi.getWeight() / Math.pow(bmi.getHeight(), 2) * 10000);
		return r ;
	}

}
