package adresse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import adresse.model.Adresse;

@Repository
public interface AdresseRepository extends JpaRepository<Adresse,Long>{


}
