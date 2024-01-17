package com.practice.phones.mobiles.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="MobileInfo")
public class MobileData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String company;
	@Column
	private String mobilename;
	@Column
	private double prize;
	
	
	
	
	public MobileData() {
		
	}
	public MobileData(Long id, String company, String mobilename, double prize) {
		super();
		this.company = company;
		this.mobilename = mobilename;
		this.prize = prize;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getMobilename() {
		return mobilename;
	}
	public void setMobilename(String mobilename) {
		this.mobilename = mobilename;
	}
	public double getPrize() {
		return prize;
	}
	public void setPrize(double prize) {
		this.prize = prize;
	}
	
	
	
	
	
}
