package com.creativa.tiendaprod.dao;

import java.util.List;

import com.creativa.tiendaprod.model.Categoria;


public interface CategoriaDao {
	void save(Categoria categoria);
	   List<Categoria> list();
}
