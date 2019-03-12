package bcp.demo.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import bcp.demo.demo.entities.Personne;

@Repository
public interface PersonneRepos extends JpaRepository<Personne, Long>{

}
