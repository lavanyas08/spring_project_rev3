package com.example.laptopDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Laptop {
@Id
@GeneratedValue
private int id;

private String brand;
private String price;
private String discounts;
private String reviews;
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}

public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getReviews() {
	return reviews;
}
public void setReviews(String reviews) {
	this.reviews = reviews;
}
public String getDiscounts() {
	return discounts;
}
public void setDiscounts(String discounts) {
	this.discounts = discounts;
}

@Override
public String toString() {
	return "Laptop [id=" + id + ", brand=" + brand + ", price=" + price + ", discounts=" + discounts + ", reviews="
			+ reviews + "]";
}


}
