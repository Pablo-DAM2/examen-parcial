package models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Sesion {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private final int descuentoGrupo = 30;
	
	private final int descuentoJoven = 20;
	
	private int precioEntrada = 5;
	
	@ManyToOne
	@JoinColumn(name = "id_sala")
	private Sala sala;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(int precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public int getDescuentoGrupo() {
		return descuentoGrupo;
	}

	public int getDescuentoJoven() {
		return descuentoJoven;
	}
	
	
	
}
