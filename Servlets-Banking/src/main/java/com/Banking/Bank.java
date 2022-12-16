package com.Banking;

public class Bank {
	
	String fname ;
	String lname ;
	String email ;
	long mobile ;
	long adhar  ; 
	String dob ; 
	String pan ;
	String country ;
	String state  ;
	String city ; 
	int zip ;
	String type ;
	
	public Bank (){
		
	}
	
	Bank(	String fname ,	String lname ,	String email ,	long mobile ,
	long adhar  , 	String dob , 	String pan ,	String country ,
	String state  , String city , 	int zip ,	String type ){
		
		this.fname 	= fname ;
		this.lname 	= lname;
		this.email 	=  email ;
		this.mobile = mobile;
		this.adhar 	= adhar ;
		this.pan 	= pan;
		this.country =country;
		this.state =  state ;
		this.city = city;
		this.zip = zip;
		this.type = type;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public long getAdhar() {
		return adhar;
	}

	public void setAdhar(long adhar) {
		this.adhar = adhar;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
