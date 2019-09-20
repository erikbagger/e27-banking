package com.erikbagger.e27.e27bankingserver.persistence.repository;

import com.erikbagger.e27.e27bankingserver.persistence.document.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CustomerRepository extends ReactiveMongoRepository<Customer, String> {
}
