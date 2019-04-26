package pl.pragmatists.interview.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.pragmatists.interview.model.Person;
import pl.pragmatists.interview.repo.PersonRepository;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
public class AppContorller {
	
	@Autowired
	PersonRepository repository;

	@RequestMapping(value = "/getPpl", method = RequestMethod.GET)
	public List<Person> getAllPpl() {
		return repository.findAll();
	}

	@PostConstruct
	public void afterStart() {

		Person personX = new Person();
		personX.setFirstName("Adolf");
		personX.setLastName("Roman");
		personX.setPeselNumber("000");
		repository.save(personX);
	}
}
