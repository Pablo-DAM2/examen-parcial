package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import models.Sesion;
import services.SesionService;

@RestController
@RequestMapping ("/sesiones")
public class SesionController {
	
	@Autowired
	SesionService sesionService;
	
	@PostMapping()
	public int postSesion(@RequestBody Sesion c) {
		return sesionService.postSesion(c);
	}
	@PutMapping()
	public Sesion putSesion(@RequestBody Sesion c) throws Exception {
	
		return sesionService.putSesion(c);
	}
	@DeleteMapping("/{id}")
	public void delSesion(@PathVariable ("id") Integer id) {
		sesionService.delSesion(id);
	}
	@GetMapping("/{id}")
	public Sesion getOne(@PathVariable ("id") Integer id) {
		Sesion c =sesionService.getOne(id);
		return c;
	}
	
	@GetMapping
	public List<Sesion> getAll(){
		return sesionService.getAll();
	}

}
