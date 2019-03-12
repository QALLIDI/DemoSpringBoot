package bcp.demo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import bcp.demo.demo.entities.Salle;
import bcp.demo.demo.repositories.MariageRepos;
import bcp.demo.demo.repositories.PersonneRepos;
import bcp.demo.demo.repositories.SalleRepos;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private PersonneRepos p;
	@Autowired
	private SalleRepos s;
	@Autowired
	private MariageRepos m;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Salle salle0 = new Salle("Salle 0","Adresse 0",140);
		s.save(salle0);
	}

}
