package fr.gtm.dao;

import static org.junit.Assert.*;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.gtm.entities.Film;

public class TestFilmDAO {
	private static EntityManagerFactory emf;
	
	@BeforeClass
	public static void before() {
		emf = Persistence.createEntityManagerFactory("cinema");
	}
	
	@AfterClass
	public static void after() {
		if(emf!=null)
			emf.close();
	}

	@Test
	public void testFindById() {
		
		
		FilmDao dao = new FilmDao(emf);
		assertNotNull(dao);
		
		Film film = dao.findById(1L);
		assertNotNull(film);
		
		
		
	}

}
