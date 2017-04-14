package baza;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Cziczarito on 13.04.2017.
 */
public class Main {
    public static void main(String[] args){
        EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory( "Album" );;
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.close();
        entityManagerFactory.close();
    }

}
