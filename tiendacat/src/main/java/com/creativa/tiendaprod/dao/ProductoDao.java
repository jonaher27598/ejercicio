package com.creativa.tiendaprod.dao;

import java.util.List;

import com.creativa.tiendaprod.model.Producto;

public interface ProductoDao {
	public  List<Producto> list();
	public void addcat(Producto p);
}
