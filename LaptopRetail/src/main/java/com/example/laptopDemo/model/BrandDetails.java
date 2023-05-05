package com.example.laptopDemo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Table(name="Branddetails")
@Entity
public class BrandDetails {
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "brand_id")
	private Laptop laptop;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String processor;
	private String display;
	private String gen;
	private String ram;
	private String batterylife;
	private String warrenty;
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getBatterylife() {
		return batterylife;
	}
	public void setBatterylife(String batterylife) {
		this.batterylife = batterylife;
	}
	public String getWarrenty() {
		return warrenty;
	}
	public void setWarrenty(String warrenty) {
		this.warrenty = warrenty;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

}
