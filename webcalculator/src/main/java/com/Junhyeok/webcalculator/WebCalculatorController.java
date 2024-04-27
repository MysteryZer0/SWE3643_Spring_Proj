package com.Junhyeok.webcalculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebCalculatorController {

    // This method handles GET requests to the root URL ("/") and displays the calculator form.
    @GetMapping("/")
    public String showCalculator() {
        return "calculator";
    }

    @PostMapping("/calculate")
    public ModelAndView calculate(
            @RequestParam("inputA") double inputA,
            @RequestParam(value = "inputB", required = false) Double inputB,
            @RequestParam("operation") String operation,
            Model model) {

        double result = 0; // Initialize result to handle cases where it's not set

        switch (operation) {
            case "add":
                result = inputA + inputB;
                break;
            case "subtract":
                result = inputA - inputB;
                break;
            case "multiply":
                result = inputA * inputB;
                break;
            case "division":
                result = inputA / inputB;
                break;
            case "sin":
                result = Math.sin(inputA);
                break;
            case "cos":
                result = Math.cos(inputA);
                break;
            case "tan":
                result = Math.tan(inputA);
                break;
            case "factorial":
                result = factorial((int) inputA);
                break;
            case "power":
                result = Math.pow(inputA, inputB);
                break;
            case "log":
                result = Math.log(inputA) / Math.log(inputB);
                break;
            case "root":
                result = Math.pow(inputA, 1 / inputB);
                break;
            case "equal":
                result = inputA == inputB ? 1 : 0; // Change this line as per your requirement
                break;
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }

        model.addAttribute("result", result);
        model.addAttribute("inputA", inputA);
        if (inputB != null) {
            model.addAttribute("inputB", inputB);
        }
        model.addAttribute("operation", operation);

        ModelAndView modelAndView = new ModelAndView("calculator", "model", model);
        return modelAndView;
    }

    private double factorial(double inputA) {
        if (inputA == 0)
            return 1;
        else
            return inputA * factorial(inputA - 1);
    }
}