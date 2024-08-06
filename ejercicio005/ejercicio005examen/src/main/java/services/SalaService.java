package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import models.Sala;
import repositories.SalaRepository;



@Service
public class SalaService {
	
	@Autowired
	SalaRepository salaRepository;
	
	@Transactional
	public int postSala(Sala c) {
		 salaRepository.save(c);
		 return c.getId();
	}
	@Transactional
	public Sala putSala(Sala c) throws Exception {
	if(c.getId() == null) {
			
			throw new Exception("Me la intentaste colar");
		}
		salaRepository.save(c);
		return c;
	}
	
	@Transactional
	public void delSala(Integer id) {
		salaRepository.deleteById(id);
	}
	@Transactional(readOnly = true)
	public Sala getOne(Integer id) {
	
		return salaRepository.findById(id).orElse(null);
	}
	
	@Transactional(readOnly = true)
	public List<Sala> getAll(){
		return salaRepository.findAll();
	}

}
