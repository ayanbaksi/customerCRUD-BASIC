package com.customertexcelCSV.GetCustomer.Customer;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRepo;

	@Override
	public List<Customer> getAllCustomer() {
		
		return customerRepo.findAll();	
		
	}

	@Override
	public void editCustomer(Customer customer,Integer orgid) {
		Customer oldCustomer = customerRepo.getById(orgid);
		
		if(oldCustomer == customer) {
			System.out.print("enter new Value");
		}
		else {
			customerRepo.save(customer);
		}
	}

	@Override
	public Customer getCustomerById(Integer orgid) {
		
		return customerRepo.findById(orgid).orElse(null);
	}

	@Override
	public void deleteCustomer(Integer orgid) {
		customerRepo.deleteById(orgid);
		
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		return customerRepo.save(customer);
		
	}
	@Override
	 public List<Customer> saveAllCustomers(List<Customer> customers) {
	        // You can add additional logic or validation here
	        return customerRepo.saveAll(customers);
	    }

	

}
