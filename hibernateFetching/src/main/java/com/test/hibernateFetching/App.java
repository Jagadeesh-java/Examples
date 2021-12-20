package com.test.hibernateFetching;

import java.util.Collection;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.test.Alien;
import com.test.Laptop;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Laptop laps=new Laptop();
    	laps.setLid(101);
    	laps.setPrice(500);
    	laps.setBrand("HP");
   
    	Alien a=new Alien();
    	a.setAid(1);
    	a.setAname("Jagadeesh");
    	a.getLaps().add(laps);
    	
    	Configuration con=new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Alien.class);
        
        
        org.hibernate.SessionFactory sf=con.buildSessionFactory();
        
        org.hibernate.Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        Alien a1=session.get(Alien.class, 1);
        System.out.println(a1.getAname());
        session.getTransaction().commit();
        
        System.out.println( "Hello World!" );
    }
}
