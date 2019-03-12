package bcp.demo.demo.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Mariage implements Serializable {
	private static final long serialVersionUID = -6212388694932547475L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Personne epaux;
	@OneToOne
	private Personne epouse;
	@DateTimeFormat
	private LocalDate dateMariage;
	@ManyToOne
	private Salle salle;
	@ManyToMany
	private List<Invitee> invitees = new ArrayList<>();
	public Mariage() {
		super();
	}
	public Mariage(Personne epaux, Personne epouse, Salle salle) {
		super();
		this.epaux = epaux;
		this.epouse = epouse;
		this.salle = salle;
		this.dateMariage = LocalDate.now();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Personne getEpaux() {
		return epaux;
	}
	public void setEpaux(Personne epaux) {
		this.epaux = epaux;
	}
	public Personne getEpouse() {
		return epouse;
	}
	public void setEpouse(Personne epouse) {
		this.epouse = epouse;
	}
	public LocalDate getDateMariage() {
		return dateMariage;
	}
	public void setDateMariage(LocalDate dateMariage) {
		this.dateMariage = dateMariage;
	}
	public List<Invitee> getInvitees() {
		return invitees;
	}
	public void setInvitees(List<Invitee> invitees) {
		this.invitees = invitees;
	}
	public Salle getSalle() {
		return salle;
	}
	public void setSalle(Salle salle) {
		this.salle = salle;
	}
	public boolean addInvitee(Invitee e) {
		return invitees.add(e);
	}
	@Override
	public String toString() {
		return "Mariage [id=" + id + ", epaux=" + epaux + ", epouse=" + epouse + ", dateMariage=" + dateMariage
				+ ", invitees=" + invitees + "]";
	}
}
