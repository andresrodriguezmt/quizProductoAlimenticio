package andres.ejercicio.quiz;

import andres.ejercicio.quiz.repositorio.RepositorioProductoAlimenticio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuizApplication {

	public static void main(String[] args) {

		SpringApplication.run(QuizApplication.class, args);
		System.out.println("Aplicación iniciada");
	}



}
