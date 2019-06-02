package com.hertz.digital.ccl.core.beans;

/**
 * The Customer class
 * 
 * @author karthik
 * @since 12/18/2018
 *
 */
public class Customer {

	private String firstName;
	private String lastName;
	private String age;
	private String phoneNumber;
	private String id;
	private String carModel;
	private String numberPlate;
	
	public Customer() {
		super();
	}

	public Customer(String firstName, String lastName, String age, String phoneNumber, String id, String carModel,
			String numberPlate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.id = id;
		this.carModel = carModel;
		this.numberPlate = numberPlate;
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getNumberPlate() {
		return numberPlate;
	}

	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}

}
