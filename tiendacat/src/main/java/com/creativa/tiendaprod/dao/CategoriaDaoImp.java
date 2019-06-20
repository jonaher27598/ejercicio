package com.creativa.tiendaprod.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.creativa.tiendaprod.config.hibernateConfigStore;
import com.creativa.tiendaprod.model.Categoria;


@Repository
public class CategoriaDaoImp implements CategoriaDao {

	@Autowired
	   private SessionFactory sessionFactory;

	@Override
	public void addcat(Categoria c) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(c);
	}

	@SuppressWarnings("unchecked")
	public List<Categoria> list() {
		Session session = hibernateConfigStore.getSessionFactory().openSession();
		List<Categoria> catelist = session.createQuery("from Categoria").list();

		return catelist;
	}
	
}
