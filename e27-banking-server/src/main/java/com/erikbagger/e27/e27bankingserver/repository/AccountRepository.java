package com.erikbagger.e27.e27bankingserver.repository;

import com.erikbagger.e27.e27bankingserver.document.Account;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface AccountRepository extends ReactiveMongoRepository<Account, String> {
}
