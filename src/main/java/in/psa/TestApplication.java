package in.psa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		String name="mike";
		int x=100;
		int y=200;
		boolean isPresent=false;
		SpringApplication.run(TestApplication.class, args);
	}

}
