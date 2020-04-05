package com.springboot.rentapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity	
@Table(name="car")
public class Car {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="brand")
	private String brand;
	
	@Column(name="model")
	private String model;
	
	@Column(name="production_year")
	private int productionYear;
	
	@Column(name="car_body")
	private String carBody;
	
	@Column(name="color")
	private String color;
	
	@Column(name="nr_of_doors")
	private int nrOfDoors;
	
	@Column(name="nr_of_seats")
	private int nrOfSeats;
	
	@Column(name="transmission")
	private String transmission;
	
	@Column(name="fuel")
	private String fuel;
	
	@Column(name="engine")
	private double engine;
	
	@Column(name="features")
	private String features;
	
	@Column(name="casco")
	private double casco;
	
	@Column(name="price")
	private double price;
	
	@Column(name="status")
	private String status;
	
	public Car() {}

	public Car(int id, String brand, String model, int productionYear, String carBody, String color, int nrOfDoors,
			int nrOfSeats, String transmission, String fuel, double engine, String features, double casco, double price,
			String status) {
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.productionYear = productionYear;
		this.carBody = carBody;
		this.color = color;
		this.nrOfDoors = nrOfDoors;
		this.nrOfSeats = nrOfSeats;
		this.transmission = transmission;
		this.fuel = fuel;
		this.engine = engine;
		this.features = features;
		this.casco = casco;
		this.price = price;
		this.status = status;
	}

	public Car(String brand, String model, int productionYear, String carBody, String color, int nrOfDoors,
			int nrOfSeats, String transmission, String fuel, double engine, String features, double casco, double price,
			String status) {
		this.brand = brand;
		this.model = model;
		this.productionYear = productionYear;
		this.carBody = carBody;
		this.color = color;
		this.nrOfDoors = nrOfDoors;
		this.nrOfSeats = nrOfSeats;
		this.transmission = transmission;
		this.fuel = fuel;
		this.engine = engine;
		this.features = features;
		this.casco = casco;
		this.price = price;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}

	public String getCarBody() {
		return carBody;
	}

	public void setCarBody(String carBody) {
		this.carBody = carBody;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNrOfDoors() {
		return nrOfDoors;
	}

	public void setNrOfDoors(int nrOfDoors) {
		this.nrOfDoors = nrOfDoors;
	}

	public int getNrOfSeats() {
		return nrOfSeats;
	}

	public void setNrOfSeats(int nrOfSeats) {
		this.nrOfSeats = nrOfSeats;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public double getEngine() {
		return engine;
	}

	public void setEngine(double engine) {
		this.engine = engine;
	}

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	public double getCasco() {
		return casco;
	}

	public void setCasco(double casco) {
		this.casco = casco;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", model=" + model + ", productionYear=" + productionYear
				+ ", carBody=" + carBody + ", color=" + color + ", nrOfDoors=" + nrOfDoors + ", nrOfSeats=" + nrOfSeats
				+ ", transmission=" + transmission + ", fuel=" + fuel + ", engine=" + engine + ", features=" + features
				+ ", casco=" + casco + ", price=" + price + ", status=" + status + "]";
	}
	
	
}
