package com.ssb.spring.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "businesses")

public class Business {
	 @Id
	    private String id;
	    @Override
	public String toString() {
		return "Business [id=" + id + ", name=" + name + "]";
	}
		public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public Business(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
		private String name;
}
