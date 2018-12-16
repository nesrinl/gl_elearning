package org.mql.models;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import java.util.Vector;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Formation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Integer id;
	private String title;
	private java.sql.Date createdDate;
	private String category;
	private List<Following> followings = new Vector<>();
	
	public Formation() {
		super();
	}
	public Formation(Integer id) {
		super();
		this.id = id;
	}
	public Formation(Integer id, String title, Member headTeacher, Date createdDate, String category) {
		super();
		this.id = id;
		this.title = title;
		this.createdDate = createdDate;
		this.category = category;
	}
	public String getCategory() {
		return category;
	}
	public java.sql.Date getCreatedDate() {
		return createdDate;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setCreatedDate(java.sql.Date createdDate) {
		this.createdDate = createdDate;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@OneToMany(mappedBy = "primaryKey.formation", cascade = CascadeType.ALL)
	public List<Following> getFollowings() {
		return followings;
	}
	
	public void setFollowings(List<Following> followings) {
		this.followings = followings;
	}

	public void addFollowing(Following following) {
		followings.add(following);
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	
}
