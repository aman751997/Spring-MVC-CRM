package com.varun.webapp.dao;


import java.util.List;

import com.varun.webapp.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);
}
