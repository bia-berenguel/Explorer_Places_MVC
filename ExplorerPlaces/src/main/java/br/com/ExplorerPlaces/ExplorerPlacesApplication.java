package br.com.ExplorerPlaces;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="br.com.ExplorerPlaces.controller")
public class ExplorerPlacesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExplorerPlacesApplication.class, args);
	}

}
