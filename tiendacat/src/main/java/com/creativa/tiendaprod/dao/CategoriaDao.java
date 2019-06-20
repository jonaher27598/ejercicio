package com.creativa.tiendaprod.dao;

import java.util.List;

import com.creativa.tiendaprod.model.Categoria;


public interface CategoriaDao {
	public  List<Categoria> list();
	public void addcat(Categoria c);
}
