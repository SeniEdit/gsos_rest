package nl.hu.iac.rest;

public class Bmi {
	private BmiService _bmi = new BmiService();
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
		int r = (int) this.getBmi();
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
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public void setBmi(float bmi) {
		this.bmi = bmi;
	}
	
	public float getBmi() {
		return this._bmi.calcBmi(this);
	}
}
