package adresse.model;

import java.util.List;


public class Abonnee {
	private Long numAbonne;
	private String identite;
	public enum Condition{AvecDateEffet,SansDateEffet}
    private Condition cdt = Condition.AvecDateEffet; // Default etat

	private List<Adresse> adresseList;
	private List<Contrat>contraList;
	
	public void setCondition(Condition cdt) {
		this.cdt = cdt;
	}
	
	 public Condition getCondition() {
	        return cdt;
	    }
	
	 
	public Long getNumAbonne() {
		return numAbonne;
	}


	public void setNumAbonne(Long numAbonne) {
		this.numAbonne = numAbonne;
	}


	public String getIdentite() {
		return identite;
	}


	public void setIdentite(String identite) {
		this.identite = identite;
	}
	
	


	public List<Adresse> getAdresseList() {
		return adresseList;
	}


	public void setAdresseList(List<Adresse> adresseList) {
		this.adresseList = adresseList;
	}


	public List<Contrat> getContraList() {
		return contraList;
	}


	public void setContraList(List<Contrat> contraList) {
		this.contraList = contraList;
	}




	private List<Adresse>  adresse;
	private List <Contrat> contrat;

	public List<Contrat> getContrat() {
		return contrat;
	}


	public void setContrat(List<Contrat> contrat) {
		this.contrat = contrat;
	}


	private String nom;
	private String prenom;


	public List<Adresse> getAdresse() {
		return adresse;
	}


	public void setAdresse(List<Adresse> adresse) {
		this.adresse = adresse;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	@Override
	public String toString() {
		return "Abonnee [adresse=" + adresse + "]";
	}
	}
