package org.mql.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StreamCourse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String url;
	private java.sql.Timestamp sqlTimestamp;

	public StreamCourse() {
		super();
	}
	public StreamCourse(Integer id) {
		super();
		this.id = id;
	}
	public StreamCourse(Integer id, String title, String url, Timestamp sqlTimestamp) {
		super();
		this.id = id;
		this.title = title;
		this.url = url;
		this.sqlTimestamp = sqlTimestamp;
	}
	public long getId() {
		return id;
	}
	public java.sql.Timestamp getSqlTimestamp() {
		return sqlTimestamp;
	}
	public String getTitle() {
		return title;
	}
	public String getUrl() {
		return url;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setSqlTimestamp(java.sql.Timestamp sqlTimestamp) {
		this.sqlTimestamp = sqlTimestamp;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
	
}
