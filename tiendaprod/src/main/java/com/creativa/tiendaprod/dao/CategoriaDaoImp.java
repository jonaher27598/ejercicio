package com.creativa.tiendaprod.dao;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.creativa.tiendaprod.model.Categoria;

@Repository
public class CategoriaDaoImp implements CategoriaDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(Categoria categoria) {
		sessionFactory.getCurrentSession().save(categoria);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Categoria> list() {
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Paso por aqui");
		List<Categoria> catelist = session.createQuery("from Categoria").list();

		return catelist;
	}

}
