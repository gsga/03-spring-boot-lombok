package tup.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tup.demo.models.User;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/")
	public String hola(@RequestParam(value = "name", defaultValue = "José") String name) {

		/*
		 * Usamos varios métodos de la clase User, pero no los implementamos nosotros,
		 * sino que fueron generados por la anotación @Data de Lombok.
		 */
		User user = new User();
		user.setName(name);

		return String.format("¡Hola %s!", user.getName());
	}
}
