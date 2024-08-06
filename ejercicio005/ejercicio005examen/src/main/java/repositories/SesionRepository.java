package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.Sala;
import models.Sesion;

@Repository
public interface SesionRepository extends JpaRepository<Sesion,Integer>{

}
