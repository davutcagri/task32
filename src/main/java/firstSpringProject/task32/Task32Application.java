package firstSpringProject.task32;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Task32Application {

	public static void main(String[] args) {
		SpringApplication.run(Task32Application.class, args);
	}

	@GetMapping
	public String print() {
		return "İlk spring projesi";
	}

}
