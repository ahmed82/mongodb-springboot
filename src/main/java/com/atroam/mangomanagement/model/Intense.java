package com.atroam.mangomanagement.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Intense")
public class Intense {
	@Id
	private int id;
	private String intenseNumber;
	private String intenseName;

}
