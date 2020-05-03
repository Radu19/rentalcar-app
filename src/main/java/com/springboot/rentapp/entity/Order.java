package com.springboot.rentapp.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="order")
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="order_date")
	private Date orderDate;
	
	@Column(name="start_date")
	private Date startDate;
	
	@Column(name="end_date")
	private Date endDate;
	
	@Column(name="hire_days")
	private int hireDays;
	
	@Column(name="total_cost")
	private double totalCost;
	
	@Column(name="status")
	private String status;
	
	@Column(name="payment_status")
	private String paymentStatus;
	
	@Column(name="payment_method")
	private String paymentMethod;
	
	@Column(name="details")
	private String details;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade= {CascadeType.PERSIST, CascadeType.MERGE, 
			CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="car_id")
	private Car car;

	@ManyToOne(fetch = FetchType.LAZY, cascade= {CascadeType.PERSIST, CascadeType.MERGE, 
			CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade= {CascadeType.PERSIST, CascadeType.MERGE, 
			CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="customer_id")
	private Customer customer;

	public Order(Date orderDate, Date startDate, Date endDate, int hireDays, double totalCost, String status,
			String paymentStatus, String paymentMethod, String details, Car car, User user, Customer customer) {
		super();
		this.orderDate = orderDate;
		this.startDate = startDate;
		this.endDate = endDate;
		this.hireDays = hireDays;
		this.totalCost = totalCost;
		this.status = status;
		this.paymentStatus = paymentStatus;
		this.paymentMethod = paymentMethod;
		this.details = details;
		this.car = car;
		this.user = user;
		this.customer = customer;
	}

	public Order(Date orderDate, Date startDate, Date endDate, int hireDays, double totalCost, String status,
			String paymentStatus, String paymentMethod, String details) {
		super();
		this.orderDate = orderDate;
		this.startDate = startDate;
		this.endDate = endDate;
		this.hireDays = hireDays;
		this.totalCost = totalCost;
		this.status = status;
		this.paymentStatus = paymentStatus;
		this.paymentMethod = paymentMethod;
		this.details = details;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getHireDays() {
		return hireDays;
	}

	public void setHireDays(int hireDays) {
		this.hireDays = hireDays;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderDate=" + orderDate + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", hireDays=" + hireDays + ", totalCost=" + totalCost + ", status=" + status + ", paymentStatus="
				+ paymentStatus + ", paymentMethod=" + paymentMethod + ", details=" + details + ", car=" + car
				+ ", user=" + user + ", customer=" + customer + "]";
	}
	
}
