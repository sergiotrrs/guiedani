package org.generation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Stock {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_stock;
	private Integer count;
	
	@OneToOne
	@JoinColumn(name="id_product")
	private Products id_product;

	public Integer getId_stock() {
		return id_stock;
	}

	public void setId_stock(Integer id_stock) {
		this.id_stock = id_stock;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Products getId_product() {
		return id_product;
	}

	public void setId_product(Products id_product) {
		this.id_product = id_product;
	}
	  
	  
	

	

}
