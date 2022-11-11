package org.senai.prjjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Os @ são os inject - são injeções de classes que realizam funções
@SpringBootApplication
@RestController
public class PrjJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrjJavaApplication.class, args);
	}

	// O @GetMapping realiza um mapeamento do tipo get - vai ser do endereço/hello
	// O @RequestParam identifica quais os parâmetros que virão na barra de endereços
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
}
