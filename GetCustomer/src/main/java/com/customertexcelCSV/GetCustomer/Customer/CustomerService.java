package com.customertexcelCSV.GetCustomer.Customer;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;



public interface CustomerService {
	public List<Customer> getAllCustomer();
	
	public Customer saveCustomer(Customer customer);
	public void editCustomer(Customer customer,Integer orgid);
	public Customer getCustomerById(Integer orgid);
	public void deleteCustomer(Integer orgid);
	

	List<Customer> saveAllCustomers(List<Customer> customers);
}
