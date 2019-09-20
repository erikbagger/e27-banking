package com.erikbagger.e27.e27bankingserver.persistence.repository;

import com.erikbagger.e27.e27bankingserver.persistence.document.Account;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface AccountRepository extends ReactiveMongoRepository<Account, String> {
}
