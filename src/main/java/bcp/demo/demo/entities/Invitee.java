package bcp.demo.demo.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;

@Entity
@DiscriminatorValue(value = "Invitee")
public class Invitee extends Personne {
	private static final long serialVersionUID = -8655885189735094024L;
	@Enumerated(EnumType.STRING)
	private Status status;
	@ManyToMany
	private List<Mariage> mariages = new ArrayList<>();
	public Invitee() {
		super();
	}
	public Invitee(String nomPersonne, String prenomePersonne, Sexe sexe, Status status) {
		super(nomPersonne, prenomePersonne, sexe);
		this.status = status;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public List<Mariage> getMariages() {
		return mariages;
	}
	public void setMariages(List<Mariage> mariages) {
		this.mariages = mariages;
	}
	public boolean add(Mariage e) {
		return mariages.add(e);
	}
	public boolean remove(Object o) {
		return mariages.remove(o);
	}
	public int size() {
		return mariages.size();
	}
	@Override
	public String toString() {
		return "Invitee [status=" + status + ", getId()=" + getId() + ", getNomPersonne()=" + getNomPersonne()
				+ ", getPrenomePersonne()=" + getPrenomePersonne() + ", getSexe()=" + getSexe() + "]";
	}
}
