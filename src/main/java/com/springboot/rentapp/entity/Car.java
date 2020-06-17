package com.springboot.rentapp.entity;

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
	
	@Column(name="segment")
	private String segment;
	
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
	
	@Column(name="min_distance")
	private String minDistance;
	
	@Column(name="max_distance")
	private String maxDistance;
	
	@Column(name="fast_charge")
	private String fastCharge;
	
	@Column(name="features")
	private String features;
	
	@Column(name="casco")
	private double casco;
	
	@Column(name="luggage")
	private int luggage;
	
	@Column(name="status")
	private String status;

	@Column(name="img")
	private String img;

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

	@Column(name="weight")
	private int weight;

	@Column(name="traction")
	private String traction;
	
	@Column(name="horsepower")
	private String horsepower;

	@Column(name="minimal_age")
	private int minimalAge;

	@Column(name="driving_exp")
	private int drivingExp;

	@Column(name="garant")
	private double garant;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="car",
			cascade= {CascadeType.PERSIST, CascadeType.MERGE, 
					CascadeType.DETACH, CascadeType.REFRESH})
	private List<Order> orders;
	


	public Car() {}

	
	public Car(int id, String brand, String model, String segment, int productionYear, String carBody, String color,
			int nrOfDoors, int nrOfSeats, String minDistance, String maxDistance, String fastCharge, String features,
			double casco, int luggage, String status, String img, double price1, double price2, double price3,
			double price4, double price5, int weight, String traction, String horsepower, int minimalAge,
			int drivingExp, double garant, List<Order> orders) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.segment = segment;
		this.productionYear = productionYear;
		this.carBody = carBody;
		this.color = color;
		this.nrOfDoors = nrOfDoors;
		this.nrOfSeats = nrOfSeats;
		this.minDistance = minDistance;
		this.maxDistance = maxDistance;
		this.fastCharge = fastCharge;
		this.features = features;
		this.casco = casco;
		this.luggage = luggage;
		this.status = status;
		this.img = img;
		this.price1 = price1;
		this.price2 = price2;
		this.price3 = price3;
		this.price4 = price4;
		this.price5 = price5;
		this.weight = weight;
		this.traction = traction;
		this.horsepower = horsepower;
		this.minimalAge = minimalAge;
		this.drivingExp = drivingExp;
		this.garant = garant;
		this.orders = orders;
	}


	public Car(String brand, String model, String segment, int productionYear, String carBody, String color,
			int nrOfDoors, int nrOfSeats, String minDistance, String maxDistance, String fastCharge, String features,
			double casco, int luggage, String status, String img, double price1, double price2, double price3,
			double price4, double price5, int weight, String traction, String horsepower, int minimalAge,
			int drivingExp, double garant) {
		super();
		this.brand = brand;
		this.model = model;
		this.segment = segment;
		this.productionYear = productionYear;
		this.carBody = carBody;
		this.color = color;
		this.nrOfDoors = nrOfDoors;
		this.nrOfSeats = nrOfSeats;
		this.minDistance = minDistance;
		this.maxDistance = maxDistance;
		this.fastCharge = fastCharge;
		this.features = features;
		this.casco = casco;
		this.luggage = luggage;
		this.status = status;
		this.img = img;
		this.price1 = price1;
		this.price2 = price2;
		this.price3 = price3;
		this.price4 = price4;
		this.price5 = price5;
		this.weight = weight;
		this.traction = traction;
		this.horsepower = horsepower;
		this.minimalAge = minimalAge;
		this.drivingExp = drivingExp;
		this.garant = garant;
	}

	public Car(String brand, String model, String segment, int productionYear, String carBody, String color,
			int nrOfDoors, int nrOfSeats, String minDistance, String maxDistance, String fastCharge, String features,
			double casco, int luggage, String status, String img, double price1, double price2, double price3,
			double price4, double price5, int weight, String traction, String horsepower, int minimalAge,
			int drivingExp, double garant, List<Order> orders) {
		super();
		this.brand = brand;
		this.model = model;
		this.segment = segment;
		this.productionYear = productionYear;
		this.carBody = carBody;
		this.color = color;
		this.nrOfDoors = nrOfDoors;
		this.nrOfSeats = nrOfSeats;
		this.minDistance = minDistance;
		this.maxDistance = maxDistance;
		this.fastCharge = fastCharge;
		this.features = features;
		this.casco = casco;
		this.luggage = luggage;
		this.status = status;
		this.img = img;
		this.price1 = price1;
		this.price2 = price2;
		this.price3 = price3;
		this.price4 = price4;
		this.price5 = price5;
		this.weight = weight;
		this.traction = traction;
		this.horsepower = horsepower;
		this.minimalAge = minimalAge;
		this.drivingExp = drivingExp;
		this.garant = garant;
		this.orders = orders;
	}


	//convenience method for bi-directional relationship
	public void add(Order tempOrder) {
			
		if(orders == null) {
			orders = new ArrayList<>();
		}
			
		orders.add(tempOrder);
		tempOrder.setCar(this);
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


	public String getSegment() {
		return segment;
	}


	public void setSegment(String segment) {
		this.segment = segment;
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


	public String getMinDistance() {
		return minDistance;
	}


	public void setMinDistance(String minDistance) {
		this.minDistance = minDistance;
	}


	public String getMaxDistance() {
		return maxDistance;
	}


	public void setMaxDistance(String maxDistance) {
		this.maxDistance = maxDistance;
	}


	public String getFastCharge() {
		return fastCharge;
	}


	public void setFastCharge(String fastCharge) {
		this.fastCharge = fastCharge;
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


	public int getLuggage() {
		return luggage;
	}


	public void setLuggage(int luggage) {
		this.luggage = luggage;
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


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public String getTraction() {
		return traction;
	}


	public void setTraction(String traction) {
		this.traction = traction;
	}


	public String getHorsepower() {
		return horsepower;
	}


	public void setHorsepower(String horsepower) {
		this.horsepower = horsepower;
	}


	public int getMinimalAge() {
		return minimalAge;
	}


	public void setMinimalAge(int minimalAge) {
		this.minimalAge = minimalAge;
	}


	public int getDrivingExp() {
		return drivingExp;
	}


	public void setDrivingExp(int drivingExp) {
		this.drivingExp = drivingExp;
	}


	public double getGarant() {
		return garant;
	}


	public void setGarant(double garant) {
		this.garant = garant;
	}


	public List<Order> getOrders() {
		return orders;
	}


	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", model=" + model + ", segment=" + segment + ", productionYear="
				+ productionYear + ", carBody=" + carBody + ", color=" + color + ", nrOfDoors=" + nrOfDoors
				+ ", nrOfSeats=" + nrOfSeats + ", minDistance=" + minDistance + ", maxDistance=" + maxDistance
				+ ", fastCharge=" + fastCharge + ", features=" + features + ", casco=" + casco + ", luggage=" + luggage
				+ ", status=" + status + ", img=" + img + ", price1=" + price1 + ", price2=" + price2 + ", price3="
				+ price3 + ", price4=" + price4 + ", price5=" + price5 + ", weight=" + weight + ", traction=" + traction
				+ ", horsepower=" + horsepower + ", minimalAge=" + minimalAge + ", drivingExp=" + drivingExp
				+ ", garant=" + garant + "]";
	}

	
}
