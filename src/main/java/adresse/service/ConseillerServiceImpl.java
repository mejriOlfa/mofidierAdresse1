package adresse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import adresse.model.Abonnee;
import adresse.model.Adresse;
import adresse.model.Contrat;

@Service
public class ConseillerServiceImpl {
@Autowired
AdresseService adresseService;
	public void updateAdresse(Abonnee abonnee, Adresse adresse) {
		//parcourlist d'adresse
		//retourne une adresse
		List <Adresse> listAdresse=abonnee.getAdresse();
		for (Adresse ad:listAdresse){
			if ((ad.getPrincipale()==true) && (ad.getEtat().equals(Etat.ACTIVE))){
				adresseService.createOrUpdateAdresse(adresse);
				break;
			}
		}
		//modif adresse des contrat
		List <Contrat> listContrat=abonnee.getContraList();
		for (Contrat crt:listContrat){
			crt.setAdresse(adresse);		
		}	
	}

}
