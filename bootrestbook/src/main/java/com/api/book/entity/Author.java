package com.api.book.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int author_id;
	
	private String firstname;
	
	private String lastname;

	public Author(int author_id, String firstname, String lastname) {
		super();
		this.author_id = author_id;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
	
	

}
