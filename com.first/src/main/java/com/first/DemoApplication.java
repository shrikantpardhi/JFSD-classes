package com.first;

import org.joda.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {

		LocalTime currentTime = new LocalTime();
	    System.out.println("The current local time is: " + currentTime);
	    Greeter greeter = new Greeter();

	    return String.format("Hello %s!: %s", greeter.sayHello(), currentTime);

	}

}
