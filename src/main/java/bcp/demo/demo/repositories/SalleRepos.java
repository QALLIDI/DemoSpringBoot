package bcp.demo.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import bcp.demo.demo.entities.Salle;

@Repository
public interface SalleRepos extends JpaRepository<Salle, Long>{

}
