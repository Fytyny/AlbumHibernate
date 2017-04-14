package baza;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//import baza.Album;

public class BazaTest {
    EntityManagerFactory entityManagerFactory;
    EntityManager entityManager;
    @Before
    public void before(){
        entityManagerFactory =  Persistence.createEntityManagerFactory( "Album" );;
        entityManager = entityManagerFactory.createEntityManager();
    }
    @After
    public void after(){
        entityManager.close();
        entityManagerFactory.close();

    }

    @Test
    public void createFolder() throws Exception{


    }
}