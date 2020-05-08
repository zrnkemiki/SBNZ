package com.ftn.carDiagnostic.model;

public class User {
	//Mozda protected umesto private?
	private Long id;
	private Long carId;
	private String firstName;
	private String lastName;
	private String username;
	private String email;
    private String password;
    private String city;
    private String phoneNumber;
    
    
    
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public User(Long id, Long carId, String firstName, String lastName, String username, String email, String password,
			String city, String phoneNumber) {
		super();
		this.id = id;
		this.carId = carId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.email = email;
		this.password = password;
		this.city = city;
		this.phoneNumber = phoneNumber;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCarId() {
		return carId;
	}
	public void setCarId(Long carId) {
		this.carId = carId;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
    
    
}
