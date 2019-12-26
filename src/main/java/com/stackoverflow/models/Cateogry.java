package com.stackoverflow.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cateogry")

public class Cateogry {

	private long id;
	private String cateogryname;

	public Cateogry() {

	}

	public Cateogry(String name) {

		this.setCateogryname(name);
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCateogryname() {
		return cateogryname;
	}

	public void setCateogryname(String cateogryname) {
		this.cateogryname = cateogryname;
	}

}
