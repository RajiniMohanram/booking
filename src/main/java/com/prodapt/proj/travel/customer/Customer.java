package com.prodapt.proj.travel.customer;

public class Customer {
	private int id;
	private String username;
	private String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Customer() {
		super();
	}

	public Customer(int id, String username, String city) {
		super();
		this.id = id;
		this.username = username;
		this.city = city;
	}

	public static Customer parseCustomer(String line) {
		Customer c = null;
		String[] v = line.split(",");
		int id = Integer.parseInt(v[0]);
		String username = v[1];
		String city = v[2];
		c = new Customer(id, username, city);

		return c;
	}

	public String toString() {

		return "Id:" + id + " Username:" + username + " City:" + city;
	}

}
