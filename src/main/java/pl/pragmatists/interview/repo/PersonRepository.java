package pl.pragmatists.interview.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pragmatists.interview.model.Person;

public interface PersonRepository extends JpaRepository<Person, String> {

}
