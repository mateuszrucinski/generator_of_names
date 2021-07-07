package pl.matigre.generator_of_names;

import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;
import java.util.function.Predicate;

@Service
public class GeneratorService {

    private final GeneratorRepo generatorRepo;

    public GeneratorService(GeneratorRepo generatorRepo) {
        this.generatorRepo = generatorRepo;
    }

    public void showPerson() {
        Random random = new Random();

        int numberGuessed = random.nextInt(9) + 1;

        Optional<GeneratorEntity> person = generatorRepo.findById(numberGuessed);
        person.orElseThrow(IllegalArgumentException::new);

        System.out.println();
        System.out.println(person);

    }
}
