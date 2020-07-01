package com.springboot.rentapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.springboot.rentapp.validation.ValidEmail;

@Entity
@Table(name="contact")
public class Contact {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@NotNull(message = "Name is required")
	@Size(min = 1, message = "Name is required")
	@Column(name="name")
	private String name;
	
	@ValidEmail
	@NotNull(message = "Email is required")
	@Size(min = 1, message = "Email is required")
	@Column(name="email")
	private String email;
	
	@Pattern(regexp="^(\\+4|)?(07[0-8]{1}[0-9]{1}|02[0-9]{2}|03[0-9]{2}){1}?(\\s|\\.|\\-)?([0-9]{3}(\\s|\\.|\\-|)){2}$", 
			message="Invalid phone number")
	@NotNull(message="Phone number is required")
	@Column(name="phone_nr")
	private String phoneNr;

	@NotNull(message = "Message is required")
	@Size(min = 1, message = "Message is required")
	@Column(name="message")
	private String message;
	
	public Contact() {}

	public Contact(String name, String email, String phoneNr, String message) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNr = phoneNr;
		this.message = message;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNr() {
		return phoneNr;
	}

	public void setPhoneNr(String phoneNr) {
		this.phoneNr = phoneNr;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", email=" + email + ", phoneNr=" + phoneNr + ", message="
				+ message + "]";
	}
	
	
}
