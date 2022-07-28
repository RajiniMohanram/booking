package com.prodapt.proj.travel.customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {
	private static List<Customer> customers;

	static {
		customers = new ArrayList<Customer>();
	}

	@Override
	public boolean addCustomer(Customer cus) {
		return customers.add(cus);
	}

	@Override
	public Customer findCustomer(int id) {
		Customer c = null;
		for (Customer cc : customers) {
			if (cc.getId() == id) {
				c = cc;
			}
		}
		return c;
	}

	@Override
	public void displayAllCustomer() {
		for (Customer c : customers) {
			System.out.println(c);
		}
	}

	@Override
	public List<Customer> getAllCustomer() {
		return customers;
	}

}
