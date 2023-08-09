package com.customertexcelCSV.GetCustomer.Customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	
	@GetMapping("/customer")
	public List<Customer> getAll(){
		return customerService.getAllCustomer();
		
		
	}
	@GetMapping("/customer/{orgid}")
	public Customer getProductById(@PathVariable Integer orgid)
	{
		return customerService.getCustomerById(orgid);
	}
	@PutMapping("/customer/{orgid}")
	public void editCustomer(@RequestBody Customer customer,@PathVariable Integer orgid) {
		customerService.editCustomer(customer, orgid);
		
	}
	@DeleteMapping("/customer/{orgid}")
	public void deleteCustomer(@PathVariable Integer orgid) {
		customerService.deleteCustomer(orgid);
	}
	@PostMapping("/customer")
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {
	    try {
	        Customer newCustomer = customerService.saveCustomer(customer);
	        return ResponseEntity.status(HttpStatus.CREATED).body(newCustomer);
	    } catch (Exception e) {
	        // Handle the exception and provide an appropriate response
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	    }
	}
	@PostMapping("/customerAll")
    public ResponseEntity<List<Customer>> saveAllCustomers(@RequestBody List<Customer> customers) {
        try {
            List<Customer> savedCustomers = customerService.saveAllCustomers(customers);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedCustomers);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
