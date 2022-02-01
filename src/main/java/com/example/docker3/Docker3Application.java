package com.example.docker3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Docker3Application {

@RequestMapping("/room")
  public String home() {
    return "Hello Room";
  }


	public static void main(String[] args) {
		SpringApplication.run(Docker3Application.class, args);
	}

}
