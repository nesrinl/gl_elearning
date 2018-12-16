package org.mql.models;

import java.io.Serializable;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Transient;

@Entity
@AssociationOverrides({
	@AssociationOverride(name = "primaryKey.member",
			joinColumns = @JoinColumn(name = "member_id")),
	@AssociationOverride(name = "primaryKey.formation",
	joinColumns = @JoinColumn(name ="formation_id"))
})
public class Following implements Serializable{

	private static final long serialVersionUID = 1L;

	private FollowingId primaryKey = new FollowingId();
	
	private String test;
	
	@EmbeddedId
	public FollowingId getPrimaryKey() {
		return primaryKey;
	}
	
	public void setPrimaryKey(FollowingId primaryKey) {
		this.primaryKey = primaryKey;
	}
	
	
	@Transient
	public Member getMember() {
		return getPrimaryKey().getMember();
	}
	
	public void setMember(Member member) {
		getPrimaryKey().setMember(member);
	}
	
	@Transient
	public Formation getFormation() {

		return getPrimaryKey().getFormation();
		
	}
	
	public void setFormation(Formation formation) {
		getPrimaryKey().setFormation(formation);
	}
	
	public void setTest(String test) {
		this.test = test;
	}
	
	public String getTest() {
		return test;
	}
	
	
	
	
	
}
