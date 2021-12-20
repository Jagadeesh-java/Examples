package com.test.JpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Alien a=new Alien();
    	a.setId(4);
    	a.setName("tippu");
    	a.setTech("support");
    	
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
    	EntityManager em=emf.createEntityManager();
    	Alien a1=em.find(Alien.class,1 );
    	//em.getTransaction().begin();
    	//em.persist(a);
    	
    	//em.getTransaction().commit();
    	System.out.println(a1);


    }
}
