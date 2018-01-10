package nl.hu.iac.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BmiController {
	
	/**
	 * Reads params height and weight (defaulted to 0) from URI
	 * and returns BMI object as JSON
 	 * 
 	 * @param	height	height in cm
 	 * @param	weight	weight in kg
	 * @return	BMI object as JSON
	 */
	@RequestMapping("/bmi")
	public Bmi bmi(@RequestParam(value = "height", defaultValue = "0") int height,
			@RequestParam(value = "weight", defaultValue = "0") int weight) {
		Bmi bmi = new Bmi();
		bmi.setHeight(height);
		bmi.setWeight(weight);
		bmi.getBmi();
		return bmi;
	}
}