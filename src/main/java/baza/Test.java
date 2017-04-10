package baza;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test{
    public static void main(String[] args){
        EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory( "Album" );;
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.close();
        System.out.println("done");
    }
}