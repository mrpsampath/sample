package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
import com.config.Criteria;
import com.config.EntityManager;
import com.config.List;
import com.config.PersistenceContext;
import com.config.UserDao;
import com.config.UserDetails;*/
import com.sample.model.Employee;

@Component
public class EmployeeCRUD implements DAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean createEmployee() {
		Session session = sessionFactory.openSession();
	    Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         Employee employee = new Employee("hi", "bye");
	         session.save(employee);
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	     
		return true;
	}
	
	   @PersistenceContext
	    private EntityManager entityManager;

		public void getUserDetails() {
			 Employee employee = new Employee("hi", "bye");
			 entityManager.unwrap(Session.class).saveOrUpdate(employee);//createCriteria(UserDetails.class);
			//return criteria.list();
		}

		@Override
		public boolean createEmployee(Employee employee) {
			Session session = sessionFactory.openSession();
		    Transaction tx = null;
		      try{
		         tx = session.beginTransaction();
		         session.save(employee);
		         tx.commit();
		      }catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      }finally {
		         session.close(); 
		      }
			return false;
		}

}
