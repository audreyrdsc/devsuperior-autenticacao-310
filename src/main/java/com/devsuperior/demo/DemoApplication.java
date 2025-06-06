package com.devsuperior.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
//public class DemoApplication implements CommandLineRunner {

	//Injeção do PasswordEncoder
	//@Autowired
	//private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	//metodo para encriptar a senha "123456"
	/*@Override
	public void run(String... args) throws Exception {
		System.out.println("ENCODE: " + passwordEncoder.encode("123456")); //gera criptografia

		//teste da senha se confere com o encode
		boolean result = passwordEncoder.matches("123456", "$2a$10$td9M0CLJ/PlH7ywo8ij7IOtqmH9OZSaUh8ZIxOtVks3IySeGEJjfG");
		System.out.println("RESULTADO: " + result);
	}*/
}
