package com.managers.service;

import com.managers.model.Customer;

import java.util.List;

public interface CustomerService {
    Iterable<Customer> findAll();

    Customer findById(Long id);

    Customer save(Customer customer);

    void remove(Long id);

    void removeAll();
}
