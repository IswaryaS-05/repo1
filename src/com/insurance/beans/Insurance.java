package com.insurance.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Insurance {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column
	private String clientNumber;
	@Column
	private String clientType;
	@Column
	private String dob;
	@Column
	private String mobile;
	@Column
	private String address;
	@Column
	private String state;
	@Column
	private String initialAmount;
	@Column
	private String name;
	@Column
	private String password;
	@Column
	private String age;
	@Column
	private String email;
	@Column
	private String city;
	@Column
	private String nation;
	
	
	
	public Insurance() {
		super();
	}
	
	public Insurance(String username, String password) {
		this.clientNumber=clientNumber;
		this.password=password;
	}
	public Insurance(int id, String clientNumber, String clientType, String dob, String mobile, String address,
			String state, String initialAmount, String name, String password, String age, String email, String city,
			String nation) {
		super();
		this.id = id;
		this.clientNumber = clientNumber;
		this.clientType = clientType;
		this.dob = dob;
		this.mobile = mobile;
		this.address = address;
		this.state = state;
		this.initialAmount = initialAmount;
		this.name = name;
		this.password = password;
		this.age = age;
		this.email = email;
		this.city = city;
		this.nation = nation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClientNumber() {
		return clientNumber;
	}
	public void setClientNumber(String clientNumber) {
		this.clientNumber = clientNumber;
	}
	public String getClientType() {
		return clientType;
	}
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getInitialAmount() {
		return initialAmount;
	}
	public void setInitialAmount(String initialAmount) {
		this.initialAmount = initialAmount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	
	

	
	
}
