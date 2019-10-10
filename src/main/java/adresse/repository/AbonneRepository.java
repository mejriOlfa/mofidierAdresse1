package adresse.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import adresse.model.Abonnee;

@Repository
public interface AbonneRepository  extends JpaRepository<Abonnee,Long>{
 
	
}
