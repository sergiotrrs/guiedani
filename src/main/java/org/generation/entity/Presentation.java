package org.generation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Presentation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_presentation;
	private String name;
	
	
	public Integer getId_presentation() {
		return id_presentation;
	}
	public void setId_presentation(Integer id_presentation) {
		this.id_presentation = id_presentation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
