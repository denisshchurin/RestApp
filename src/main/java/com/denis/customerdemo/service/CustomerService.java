package com.denis.customerdemo.service;

import com.denis.customerdemo.model.Customer;

import java.util.List;

/**
 * Service interface for {@link Customer} class.
 *
 * @author Denis Shchurin
 * @version 1.0
 */


public interface CustomerService {
    Customer getById();

    void save(Customer customer);

    void delete(Customer customer);

    List<Customer> getAll();
}
