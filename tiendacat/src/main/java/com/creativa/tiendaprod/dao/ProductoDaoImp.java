package com.creativa.tiendaprod.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.creativa.tiendaprod.config.hibernateConfigStore;

import com.creativa.tiendaprod.model.Producto;

@Repository
public class ProductoDaoImp implements ProductoDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addcat(Producto p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Producto> list() {
		Session session = hibernateConfigStore.getSessionFactory().openSession();
		List<Producto> productlist = session.createQuery("from productos").list();

		return productlist;
	}
}
