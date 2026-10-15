package com;

public class User {
	
	private int user_id;
	private String name;
	private String gender;
	private String email;
	private long phone;
	
	public User(int user_id, String name, String gender, String email, long phone) {
		this.user_id = user_id;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", name=" + name + ", gender=" + gender + ", email=" + email + ", phone="
				+ phone + "]";
	}
	

	
}
