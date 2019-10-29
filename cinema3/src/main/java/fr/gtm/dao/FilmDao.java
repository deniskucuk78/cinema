package fr.gtm.dao;

import javax.persistence.EntityManagerFactory;

import fr.gtm.entities.Film;

public class FilmDao extends AbstractDAO<Film, Long> {
	
	public FilmDao(EntityManagerFactory emf) {
		super(emf, Film.class);
	}
	

}
