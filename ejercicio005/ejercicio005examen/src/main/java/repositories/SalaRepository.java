package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.Sala;

@Repository
public interface SalaRepository extends JpaRepository<Sala, Integer>{

}
