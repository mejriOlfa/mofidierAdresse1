package adresse.model;

import java.util.Date;

public class Contrat {
	private Abonnee abonne;
	private String numContrat;
	private Date creationDate;
	private Adresse adresse;
	
	public Abonnee getAbonne() {
		return abonne;
	}
	public void setAbonne(Abonnee abonne) {
		this.abonne = abonne;
	}
	public String getNumContrat() {
		return numContrat;
	}
	public void setNumContrat(String numContrat) {
		this.numContrat = numContrat;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

}
