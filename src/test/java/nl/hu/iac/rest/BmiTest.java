package nl.hu.iac.rest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BmiTest {
	private Bmi bmi;

	@Before
	public void setup() throws Exception {
		this.bmi = new Bmi();
		this.bmi.setHeight(185);
		this.bmi.setWeight(200);
	}
	
	@Test
	public void testHeightIsEqualTo() {
		bmi.setHeight(180);
		assertEquals(180, (int) bmi.getHeight());
	}
	
	@Test
	public void testWeightIsEqualTo() {
		bmi.setWeight(78);
		assertEquals(78, (int) bmi.getWeight());
	}
	
	@Test
	public void testBmiIsEqualTo() {
		/* Berekent BMI in het metrisch systeem */
		float height = 185;
		float weight = 200;
		float r = (float) (weight / Math.pow(height, 2) * 10000);
		assertEquals(r, bmi.calcBmi(), 0);
	}
	
	@Test
	public void testCategoryEqualToMorbid() {
		assertEquals("Morbid obese", bmi.getCategory());
	}
	
	@Test
	public void testCategoryEqualToHealthy() {
		bmi.setHeight(181);
		bmi.setWeight(78);
		assertEquals("Healthy", bmi.getCategory());
	}
}
