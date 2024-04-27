package com.Junhyeok.webcalculator;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
@ComponentScan("com.Junhyeok.webcalculator")
public class WebcalculatorApplication {
	public static void main(String[] args) throws IOException {
		SpringApplication.run(WebcalculatorApplication.class, args);
		openHomePage();
	}
	private static void openHomePage() throws IOException {
		Runtime rt = Runtime.getRuntime();
		rt.exec("rundll32 url.dll,FileProtocolHandler " + "http://localhost:8089");
	}
}