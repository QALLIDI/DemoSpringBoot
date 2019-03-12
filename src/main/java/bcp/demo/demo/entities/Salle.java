package bcp.demo.demo.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class Salle implements Serializable {
	private static final long serialVersionUID = -4008434187119704221L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private String nomSalle;
	@NotNull
	private String adresseSalle;
	@NotNull
	@Min(value = 100 , message = "Salle doit avoir au moins 100 places !")
	private int capacite;
	@OneToMany(mappedBy = "salle")
	private List<Mariage> mariages = new ArrayList<>();
	// JPA NECESSITE UN CONSTRUCTEUR PAR DEFAULT SANS PARAMS
	public Salle() {
		super();
	}
	public Salle(String nomSalle, String adresseSalle, int capacite) {
		super();
		this.nomSalle = nomSalle;
		this.adresseSalle = adresseSalle;
		this.capacite = capacite;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomSalle() {
		return nomSalle;
	}
	public void setNomSalle(String nomSalle) {
		this.nomSalle = nomSalle;
	}
	public String getAdresseSalle() {
		return adresseSalle;
	}
	public void setAdresseSalle(String adresseSalle) {
		this.adresseSalle = adresseSalle;
	}
	public int getCapacite() {
		return capacite;
	}
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	public List<Mariage> getMariages() {
		return mariages;
	}
	public void setMariages(List<Mariage> mariages) {
		this.mariages = mariages;
	}
	@Override
	public String toString() {
		return "Salle [id=" + id + ", nomSalle=" + nomSalle + ", adresseSalle=" + adresseSalle + ", capacite="
				+ capacite + "]";
	}
}
