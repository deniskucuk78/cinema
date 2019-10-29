package fr.gtm.dao;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.gtm.dao.ActeurDAO;
import fr.gtm.entities.Acteur;


public class TestActeurDAO {

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
	public void newDao() {
		ActeurDAO dao = new ActeurDAO(emf);
		assertNotNull(dao);
	}
	
	@Test
	public void testFindById() {

		ActeurDAO dao = new ActeurDAO(emf);
		Acteur acteur = dao.findById(1L);
		assertFalse(acteur.getFilms().isEmpty());
	}
	
	
	
	

}
