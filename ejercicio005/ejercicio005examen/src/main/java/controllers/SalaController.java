package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import models.Sala;
import services.SalaService;


@RestController()
@RequestMapping("/salas")
public class SalaController {
	
	@Autowired
	SalaService salaService;
	
	@PostMapping()
	public int postSala(@RequestBody Sala c) {
		return salaService.postSala(c);
	}
	@PutMapping()
	public Sala putSala(@RequestBody Sala c) throws Exception {
	
		return salaService.putSala(c);
	}
	@DeleteMapping("/{id}")
	public void delSala(@PathVariable ("id") Integer id) {
		salaService.delSala(id);
	}
	@GetMapping("/{id}")
	public Sala getOne(@PathVariable ("id") Integer id) {
		Sala c =salaService.getOne(id);
		return c;
	}
	
	@GetMapping
	public List<Sala> getAll(){
		return salaService.getAll();
	}

}
