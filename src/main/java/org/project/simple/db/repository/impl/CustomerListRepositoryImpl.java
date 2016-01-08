package org.project.simple.db.repository.impl;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.project.simple.db.repository.CustomerListRepository;
import org.project.simple.domain.Customer_List;

@Component
public class CustomerListRepositoryImpl implements CustomerListRepository {

	private SessionFactory sessionFactory;
	
	@Inject
	public CustomerListRepositoryImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;		 //<co id="co_InjectSessionFactory"/>
	}
	
	private Session currentSession() {
		return sessionFactory.getCurrentSession();//<co id="co_RetrieveCurrentSession"/>
	}
	
	public List<Customer_List> getCustomerList() {
		List<Customer_List> cuList = null;

		Session session = null;
		
		try{
			session = sessionFactory.openSession();
			session.beginTransaction();
			cuList = session.createSQLQuery("select * from customer_list").list();
//			cuList = session.createQuery("from customer_list").list();
			session.getTransaction().commit();
		}catch (RuntimeException e){
			System.out.println(e.getMessage());
		}
		finally
		{
			if(session != null){
								
			}
		}
		
		return cuList;
	}

}
