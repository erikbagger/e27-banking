package com.erikbagger.e27.e27bankingserver.service;

import com.erikbagger.e27.e27bankingserver.persistence.document.Account;
import com.erikbagger.e27.e27bankingserver.persistence.repository.AccountRepository;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class AccountService  {

    private final AccountRepository repository;

    public AccountService(AccountRepository repository){
        this.repository = repository;
    }

    public Mono<Account> store(Account account){ return this.repository.save(account); }

    public Mono<Account> findById(String id){
        return this.repository.findById(id);
    }

    public Flux<Account> findAll(){ return this.repository.findAll(); }
}
