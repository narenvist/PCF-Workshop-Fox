package io.pivotal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class HawtdemoApplication {

	@RequestMapping("/")
	public String hello() {
	    return "Hello Hawt!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HawtdemoApplication.class, args);
	}
}
