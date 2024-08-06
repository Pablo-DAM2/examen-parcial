package models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Sala {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer id;

private int capacidad;
private Sesion s;

@OneToMany(mappedBy = "sala")
private List<Sesion> sesiones = new ArrayList<Sesion>();

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public int getCapacidad() {
	return capacidad;
}

public void setCapacidad(int capacidad) {
	this.capacidad = capacidad;
}

public Sesion getS() {
	return s;
}

public void setS(Sesion s) {
	this.s = s;
}

public List<Sesion> getSesiones() {
	return sesiones;
}

public void setSesiones(List<Sesion> sesiones) {
	this.sesiones = sesiones;
}




}
