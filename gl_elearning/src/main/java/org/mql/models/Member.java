package org.mql.models;

import java.io.Serializable;
import java.util.List;
import java.util.Vector;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Member implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private List<Following> followings = new Vector<>();
	
	
	
	public Member() {
		super();
	}

	public Member(Integer id) {
		super();
		this.id = id;
	}

	public Member(Integer id, String firstName, String lastName, String email, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public String getFirstName() {
		return firstName;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPassword() {
		return password;
	}

	
	public void setFollowings(List<Following> followings) {
		this.followings = followings;
	}

	@OneToMany(mappedBy = "primaryKey.member",cascade = CascadeType.ALL)
	public List<Following> getFollowings() {
		return followings;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	public void addFollowing(Following following) {
		followings.add(following);
	}
	
	@Override
	public String toString() {
		return "Nom : "+lastName+"Prenom : "+lastName;
	}

}
