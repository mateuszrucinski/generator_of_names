package pl.matigre.generator_of_names;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GeneratorOfNamesApplication implements CommandLineRunner {

    GeneratorService service;

    public GeneratorOfNamesApplication(GeneratorService service) {
        this.service = service;
    }

    public static void main(String[] args) {
        SpringApplication.run(GeneratorOfNamesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        service.showPerson();
    }
}
