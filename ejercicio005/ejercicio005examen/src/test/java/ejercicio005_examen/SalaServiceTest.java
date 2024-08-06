package ejercicio005_examen;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import models.Sala;
import repositories.SalaRepository;
import services.SalaService;

@SpringBootTest
public class SalaServiceTest {

	
	@Autowired
	SalaRepository salaRepository;
	
	@Autowired
	SalaService salaService;
	
	@Autowired
	@PersistenceContext
	EntityManager em;
	
	private Integer id1;
	private Integer id2;
	private Integer id3;
	
	@BeforeEach
	public void setUp() {
		
		models.Sesion on1 = new models.Sesion();
		on1.setPrecioEntrada(5);
		
		
		Sala s1 = new Sala();
		s1.setCapacidad(100);
		on1.setSala(s1);
		
		//No me da tiempo a mas
		
	
	}

	
}
