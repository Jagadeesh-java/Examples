package com.test;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AlienName an=new AlienName();
        an.setFname("Jagadeesh");
        an.setMname("Babu");
        an.setLname("Pula");
        Alien telusko =new Alien();
        telusko.setAid(105);
        telusko.setAname(an);
        telusko.setColor("yellow");
        
        
        Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
       
       
        
        org.hibernate.SessionFactory sf=con.buildSessionFactory();
        
        org.hibernate.Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        
        session.save(telusko);
        tx.commit();
        
    }
}
