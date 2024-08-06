package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import models.Sesion;
import repositories.SesionRepository;

@Service
public class SesionService {


	
	@Autowired
	SesionRepository sesionRepository;
	
	@Transactional
	public int postSesion(Sesion sesion) {
		 sesionRepository.save(sesion);
		 return sesion.getId();
	}
	@Transactional
	public Sesion putSesion(Sesion sesion) throws Exception {
	if(sesion.getId() == null) {
			
			throw new Exception("Me la intentaste colar");
		}
		sesionRepository.save(sesion);
		return sesion;
	}
	
	@Transactional
	public void delSesion(Integer id) {
		sesionRepository.deleteById(id);
	}
	@Transactional(readOnly = true)
	public Sesion getOne(Integer id) {
	
		return sesionRepository.findById(id).orElse(null);
	}
	
	@Transactional(readOnly = true)
	public List<Sesion> getAll(){
		return sesionRepository.findAll();
	}
}
