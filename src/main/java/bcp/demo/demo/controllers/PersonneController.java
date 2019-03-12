package bcp.demo.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import bcp.demo.demo.entities.Personne;
import bcp.demo.demo.repositories.PersonneRepos;

@RestController
@RequestMapping(value = "/personnes")
public class PersonneController {
	@Autowired
	private PersonneRepos personneRepos;
	@GetMapping("/all")
	public List<Personne> getAll() {
		List<Personne> personnes = personneRepos.findAll();
		return personnes;
	}
	// CRUD METHODS ADD LATER
}
