package pl.matigre.generator_of_names;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratorRepo extends JpaRepository<GeneratorEntity, Integer> {
}
