package bcp.demo.demo.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Type", discriminatorType = DiscriminatorType.STRING)
public class Personne implements Serializable {
	private static final long serialVersionUID = 2316755677320732650L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private String nomPersonne;
	@NotNull
	private String prenomePersonne;
	@Enumerated(EnumType.STRING)
	private Sexe sexe;
	@OneToMany(mappedBy = "epaux")
	private List<Mariage> mariages = new ArrayList<>();
	public Personne() {
		super();
	}
	public Personne(String nomPersonne, String prenomePersonne, Sexe sexe) {
		super();
		this.nomPersonne = nomPersonne;
		this.prenomePersonne = prenomePersonne;
		this.sexe = sexe;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomPersonne() {
		return nomPersonne;
	}
	public void setNomPersonne(String nomPersonne) {
		this.nomPersonne = nomPersonne;
	}
	public String getPrenomePersonne() {
		return prenomePersonne;
	}
	public void setPrenomePersonne(String prenomePersonne) {
		this.prenomePersonne = prenomePersonne;
	}
	public Sexe getSexe() {
		return sexe;
	}
	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}
	public List<Mariage> getMariages() {
		return mariages;
	}
	public void setMariages(List<Mariage> mariages) {
		this.mariages = mariages;
	}
	
	public boolean addMariage(Mariage e) {
		if(this.getSexe() == Sexe.HOMME && e.getEpaux().equals(this)) {
			return mariages.add(e);
		} else {
			return false;
		}
	}
	public boolean remove(Object o) {
		return mariages.remove(o);
	}
	@Override
	public String toString() {
		return "Personne [id=" + id + ", nomPersonne=" + nomPersonne + ", prenomePersonne=" + prenomePersonne
				+ ", sexe=" + sexe + "]";
	}
}
