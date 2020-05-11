package com.springboot.rentapp.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone_nr")
	private int phoneNr;
	
	@Column(name="address")
	private String address;
	
	@Column(name="passport")
	private String passport;
	
	@Column(name="date_birth", columnDefinition = "DATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateBirth;

	@OneToMany(fetch = FetchType.LAZY, mappedBy="customer",
			cascade= {CascadeType.PERSIST, CascadeType.MERGE, 
					CascadeType.DETACH, CascadeType.REFRESH})
	private List<Order> orders;
	
	public Customer() {}
	
	public Customer(String firstName, String lastName, String email, int phoneNr, String address, String passport,
			LocalDate dateBirth, List<Order> orders) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNr = phoneNr;
		this.address = address;
		this.passport = passport;
		this.dateBirth = dateBirth;
		this.orders = orders;
	}

	public Customer(String firstName, String lastName, String email, int phoneNr, String address, String passport,
			LocalDate dateBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNr = phoneNr;
		this.address = address;
		this.passport = passport;
		this.dateBirth = dateBirth;
	}

	public void add(Order tempOrder) {
		
		if(orders == null) {
			orders = new ArrayList<>();
		}
		
		orders.add(tempOrder);
		tempOrder.setCustomer(this);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNr() {
		return phoneNr;
	}

	public void setPhoneNr(int phoneNr) {
		this.phoneNr = phoneNr;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public LocalDate getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(LocalDate dateBirth) {
		this.dateBirth = dateBirth;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phoneNr=" + phoneNr + ", address=" + address + ", passport=" + passport + ", dateBirth="
				+ dateBirth + ", orders=" + orders + "]";
	}
	
	
}
