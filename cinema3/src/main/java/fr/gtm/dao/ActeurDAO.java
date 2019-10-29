package fr.gtm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import fr.gtm.entities.Acteur;

public class ActeurDAO extends AbstractDAO<Acteur, Long> {

	public ActeurDAO(EntityManagerFactory emf) {
		super(emf, Acteur.class);
	}
	

}
