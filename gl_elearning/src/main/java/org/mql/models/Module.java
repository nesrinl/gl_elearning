package org.mql.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Module {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String description;
	private float rating;
	private String type;
	public Module() {
		super();
	}
	public Module(Integer id) {
		super();
		this.id = id;
	}
	public Module(Integer id, String title, String description, float rating, String type) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.rating = rating;
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public long getId() {
		return id;
	}
	public float getRating() {
		return rating;
	}
	public String getTitle() {
		return title;
	}
	public String getType() {
		return type;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
	
}
