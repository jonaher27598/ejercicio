package com.creativa.tiendaprod.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cate")
	private int id;

	@Column(name = "nombre")
//	@Size(max = 50, min = 3, message = "{cate.name.invalid}")
//	@NotEmpty(message = "Por Favor Ingrese un nombre de Categoria")
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", name=" + name + "]";
	}
	
}
