package com.jacket.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="vendors")
public class Vendor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	@NotEmpty(message = "*Please provide an name! This field can not be empty!")
	private String name;
	
	@Column(name = "proprietor")
	@NotEmpty(message = "*Please provide an proprietor! This field can not be empty!")
	private String proprietor;
	
	@Column(name = "contact")
	@NotNull(message = "*Please provide an contact! This field can not be empty!")
//	@Length(min = 10, message = "*Your contact can not be less than 10 characters!")
	private int contact;
	
	@Column(name = "location")
	@NotEmpty(message = "*Please provide an location! This field can not be empty!")
	private String location;
	
	@Column(name = "notes")
	@NotEmpty(message = "*Please provide an notes! This field can not be empty!")
	private String notes;
	
	@Column(name = "created_at")
	@CreationTimestamp
//	@NotEmpty(message = "*Please provide an name! This field can not be empty!")
	private Date created_at;
	
	@Column(name = "updated_at")
	@UpdateTimestamp
//	@NotEmpty(message = "*Please provide an name! This field can not be empty!")
	private Date updated_at;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProprietor() {
		return proprietor;
	}

	public void setProprietor(String proprietor) {
		this.proprietor = proprietor;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	

}
