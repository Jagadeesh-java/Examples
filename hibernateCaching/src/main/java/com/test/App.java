package com.test;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	
    	Alien a=new Alien();
    	//a.setAid(101);
    	//a.setAname("Jagadeesh");
    	//a.setColor("yellow");
    	 Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
         
         
         SessionFactory sf=con.buildSessionFactory();
         
         org.hibernate.Session session=sf.openSession();
         Transaction tx=session.beginTransaction();
         Query q1=session.createQuery("from Alien where aid=101");
         q1.setCacheable(true);
         a=(Alien)q1.uniqueResult();
         System.out.println(a);
        
          session.getTransaction().commit();
          session.close();
          
          
          
         org.hibernate.Session session2=sf.openSession();
         Transaction tx2=session2.beginTransaction();
        Query q2=session2.createQuery("from Alien where id=101");
        q2.setCacheable(true);
        a=(Alien)q2.uniqueResult();
        System.out.println(a);
         session2.getTransaction().commit();
         session2.close();
       
    }
}
