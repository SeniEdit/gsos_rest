package nl.hu.iac.rest;

public class Bmi {
	private float height = 0;
	private float weight = 0;
	private float bmi = 0;
	private String category = "";

	public Bmi() {
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	/**
	 * Returns BMI in metric (weight in kg / height in cm / height in cm * 10000)
 	 * 
	 * @return      Result of BMI formula
	 */
	public float getBmi() {
		float r = this.getWeight() / this.getHeight() / this.getHeight() * 10000;
		if (r >= 35) {
			this.setCategory("Morbid obese");
		} else if (r > 30 && r < 35) {
			this.setCategory("Obese");
		} else if (r > 25 && r < 30) {
			this.setCategory("Overweight");
		} else if (r > 18.5 && r < 25) {
			this.setCategory("Healthy");
		} else if (r < 18.5) {
			this.setCategory("Underweight");
		}
		return r ;
	}
}