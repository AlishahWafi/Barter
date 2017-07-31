package com.barter.www;

import com.barter.mvc.Model;

public class UserModel extends Model {
	private String fullname;
	private String username;
	private String password;
	private String date_of_birth;
	private String gender;
	private String email;
    private String card_number;
    private String mobile;
    private String phone;
    private String address;
    private String location;
    
    public UserModel() {
    }
  
	public UserModel(String fullname, String username, String password, String date_of_birth, String gender,
			String email, String card_number, String mobile, String phone, String address, String location) {
		this.fullname = fullname;
		this.username = username;
		this.password = password;
		this.date_of_birth = date_of_birth;
		this.gender = gender;
		this.email = email;
		this.card_number = card_number;
		this.mobile = mobile;
		this.phone = phone;
		this.address = address;
		this.location = location;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDateOfBirth() {
		return date_of_birth;
	}

	public void setDateOfBirth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCardNumber() {
		return card_number;
	}

	public void setCardNumber(String card_number) {
		this.card_number = card_number;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
