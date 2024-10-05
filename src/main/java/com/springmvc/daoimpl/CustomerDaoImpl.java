package com.springmvc.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springmvc.dao.CustomerDAO;
import com.springmvc.entities.Customer;

@Component
public class CustomerDaoImpl implements CustomerDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void insertCustomer(Customer c) {

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.persist(c);
		session.getTransaction().commit();
	}

}
