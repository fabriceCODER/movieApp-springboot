package dev.fabish.movieApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MovieAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(MovieAppApplication.class, args);
	}

}
