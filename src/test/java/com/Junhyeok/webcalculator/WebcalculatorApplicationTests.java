package com.Junhyeok.webcalculator;

import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WebCalculatorApplicationTests {

	@Test
	void testCalculateAdd() {
		// Create an instance of your controller
		WebCalculatorController controller = new WebCalculatorController();

		// Mock the Model object
		Model model = Mockito.mock(Model.class);

		// Call the calculate method
		ModelAndView modelAndView = controller.calculate(5, 10.0, "add", model);

		// Retrieve the result from the model
		double result = (double) modelAndView.getModel().get("result");

		// Assert the result
		assertEquals(15.0, result, "Addition calculation is incorrect");
	}

	// Add more test methods for other operations
}