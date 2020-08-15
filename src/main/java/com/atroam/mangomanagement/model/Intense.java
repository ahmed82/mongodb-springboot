package com.atroam.mangomanagement.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//@Data
@Document(collection = "Intense")
public class Intense {
	@Id
	private int id;
	private String intenseNumber;
	private String intenseName;
	
	public Intense() {
		super();
	}
	
	public Intense(int id, String intenseNumber, String intenseName) {
		super();
		this.id = id;
		this.intenseNumber = intenseNumber;
		this.intenseName = intenseName;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIntenseNumber() {
		return intenseNumber;
	}

	public void setIntenseNumber(String intenseNumber) {
		this.intenseNumber = intenseNumber;
	}

	public String getIntenseName() {
		return intenseName;
	}

	public void setIntenseName(String intenseName) {
		this.intenseName = intenseName;
	}

	@Override
	public String toString() {
		return "Intense [id=" + id + ", intenseNumber=" + intenseNumber + ", intenseName=" + intenseName + "]";
	}


	

}
