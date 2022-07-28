package com.prodapt.proj.travel.customer;

import java.util.List;

public interface CustomerDAO {

	public boolean addCustomer(Customer cus);

	public Customer findCustomer(int id);

	public void displayAllCustomer();
	
	public List<Customer> getAllCustomer();

}
