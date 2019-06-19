package com.creativa.tiendaprod.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.creativa.tiendaprod.dao.CategoriaDao;
import com.creativa.tiendaprod.model.Categoria;

@Service
public class CategoriaServiceImp implements CategoriaService {
	@Autowired
	private CategoriaDao categoriaDao;

	@Transactional
	public void save(Categoria categoria) {
		categoriaDao.save(categoria);
	}

	@Override
	@Transactional
	public List<Categoria> list() {
		return this.categoriaDao.list();
	}
}
