package bcp.demo.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import bcp.demo.demo.entities.Mariage;

@Repository
public interface MariageRepos extends JpaRepository<Mariage, Long>{

}
