package ejercicio005_examen;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import coches.models.Propietario;
import coches.models.Sesion;
import coches.repositories.CocheRepository;
import coches.services.CocheService;
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
		
		models.Sesion on = new models.Sesion();
		
		Sala s1 = new Sala();
		s1.setCapacidad(100);
		s1.set
		
	
	}
	@Test
	@Transactional
	void postCocheTest() {
		Sesion c = new Sesion ();
		c.setMatricula("2222-B");
		
		Propietario propietario = new Propietario();
		propietario.setNombre("Pedro");	
		propietario.getListaCoches().add(c);
		
		c.setPropietario(propietario);
		
		int idCochePersistido = cocheService.postCoche(c);
		
		assertThat(idCochePersistido).isNotNull(); 

    
        Sesion cochePersistido = em.find(Sesion.class, idCochePersistido);
        assertThat(cochePersistido).isNotNull();
        assertThat(cochePersistido.getMatricula()).isEqualTo("2222-B"); 
		
	}
	@Test
	@Transactional
	void putCocheTest() throws Exception {
		Sesion c = new Sesion();
		c.setId(1);
		c.setMatricula("AAAA-1");
	
	Sesion cochemodificado =	cocheService.putCoche(c);
		assertThat(cochemodificado.getMatricula()).isEqualTo("AAAA-1");
	}
	
	@Test
	@Transactional
	void delCocheTest() {
		cocheService.delCoche(2);
		Sesion cocheBorrado = em.find(Sesion.class, 2);
		assertThat(cocheBorrado).isNull();
	}
	
	@Test
	@Transactional (readOnly = true)
	void getOneTest() {
	
	Sesion cocheObtenido = cocheService.getOne(id1);

	assertThat(cocheObtenido.getId()).isEqualTo(id1);
		
	}

	@Test
	@Transactional (readOnly = true)
	void getAllTest() {
		List<Sesion> listaCoches = cocheService.getAll();
		
		assertThat(listaCoches.size()).isGreaterThan(1);
	}
	
}
