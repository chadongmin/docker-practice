package com.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerApplication {

	@RequestMapping("/")
	public String home(){
		return "Hello Docker CI - after using github action!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerApplication.class, args);
	}

}
