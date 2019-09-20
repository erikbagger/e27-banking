package com.erikbagger.e27.e27bankingserver.service;

import com.erikbagger.e27.e27bankingserver.persistence.document.Customer;
import com.erikbagger.e27.e27bankingserver.persistence.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerService {

    private CustomerRepository repository;

    public CustomerService(CustomerRepository repository){
        this.repository = repository;
    }

    public Mono<Customer> store(Customer customer){
        return this.repository.save(customer);
    }

    public Flux<Customer> findAll(){ return this.repository.findAll();}
}
