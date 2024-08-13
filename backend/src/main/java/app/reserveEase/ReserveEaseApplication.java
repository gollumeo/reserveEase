package app.reserveEase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "app.reserveEase.web.controllers")
public class ReserveEaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReserveEaseApplication.class, args);
	}

}