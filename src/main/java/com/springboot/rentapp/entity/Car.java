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
	
	@Column(name="status")
	private String status;

	@Column(name="img")
	private String img;

	@Column(name="segment")
	private String segment;

	@Column(name="luggage")
	private String luggage;

	@Column(name="price1")
	private double price1;

	@Column(name="price2")
	private double price2;
	
	@Column(name="price3")
	private double price3;

	@Column(name="price4")
	private double price4;

	@Column(name="price5")
	private double price5;

	public Car() {}

	public Car(int id, String brand, String model, int productionYear, String carBody, String color, int nrOfDoors,
			int nrOfSeats, String transmission, String fuel, double engine, String features, double casco,
			String status, String img, String segment, String luggage, double price1, double price2, double price3,
			double price4, double price5) {
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
		this.status = status;
		this.img = img;
		this.segment = segment;
		this.luggage = luggage;
		this.price1 = price1;
		this.price2 = price2;
		this.price3 = price3;
		this.price4 = price4;
		this.price5 = price5;
	}

	public Car(String brand, String model, int productionYear, String carBody, String color, int nrOfDoors,
			int nrOfSeats, String transmission, String fuel, double engine, String features, double casco,
			String status, String img, String segment, String luggage, double price1, double price2, double price3,
			double price4, double price5) {
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
		this.status = status;
		this.img = img;
		this.segment = segment;
		this.luggage = luggage;
		this.price1 = price1;
		this.price2 = price2;
		this.price3 = price3;
		this.price4 = price4;
		this.price5 = price5;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getSegment() {
		return segment;
	}

	public void setSegment(String segment) {
		this.segment = segment;
	}

	public String getLuggage() {
		return luggage;
	}

	public void setLuggage(String luggage) {
		this.luggage = luggage;
	}

	public double getPrice1() {
		return price1;
	}

	public void setPrice1(double price1) {
		this.price1 = price1;
	}

	public double getPrice2() {
		return price2;
	}

	public void setPrice2(double price2) {
		this.price2 = price2;
	}

	public double getPrice3() {
		return price3;
	}

	public void setPrice3(double price3) {
		this.price3 = price3;
	}

	public double getPrice4() {
		return price4;
	}

	public void setPrice4(double price4) {
		this.price4 = price4;
	}

	public double getPrice5() {
		return price5;
	}

	public void setPrice5(double price5) {
		this.price5 = price5;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", carBody=" + carBody + ", casco=" + casco + ", color=" + color + ", engine="
				+ engine + ", features=" + features + ", fuel=" + fuel + ", id=" + id + ", img=" + img + ", luggage="
				+ luggage + ", model=" + model + ", nrOfDoors=" + nrOfDoors + ", nrOfSeats=" + nrOfSeats + ", price1="
				+ price1 + ", price2=" + price2 + ", price3=" + price3 + ", price4=" + price4 + ", price5=" + price5
				+ ", productionYear=" + productionYear + ", segment=" + segment + ", status=" + status
				+ ", transmission=" + transmission + "]";
	}

	

	
}
