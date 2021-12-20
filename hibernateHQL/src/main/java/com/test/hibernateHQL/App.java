package com.test.hibernateHQL;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
 Configuration con=new Configuration().configure().addAnnotatedClass(Student.class);
         
         
         SessionFactory sf=con.buildSessionFactory();
         
         org.hibernate.Session session=sf.openSession();
         Transaction tx=session.beginTransaction();
         Query  q=session.createQuery("select sum(marks) from Student s where s.marks>80");
         Long marks=(Long)q.uniqueResult();
         System.out.println(marks);
         
      
         
         
         
         
         
         session.getTransaction().commit();
         System.out.println("done!");
    }
}
