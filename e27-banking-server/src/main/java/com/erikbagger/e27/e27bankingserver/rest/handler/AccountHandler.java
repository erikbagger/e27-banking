package com.erikbagger.e27.e27bankingserver.rest.handler;

import com.erikbagger.e27.e27bankingserver.persistence.document.Account;
import com.erikbagger.e27.e27bankingserver.service.AccountService;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.BodyInserters.fromPublisher;

@Component
public class AccountHandler {

    private final AccountService service;

    public AccountHandler(AccountService service){
        this.service = service;
    }

    public Mono<ServerResponse> findById(ServerRequest request){
        Mono<Account> account = this.service.findById(request.pathVariable("id"));
        return ServerResponse.ok().contentType(APPLICATION_JSON)
                .body(account, Account.class);
    }

    public Mono<ServerResponse> findAll(ServerRequest request){
        return ServerResponse.ok().contentType(APPLICATION_JSON)
                .body(fromPublisher(service.findAll(), Account.class));
    }

    public Mono<ServerResponse> store(ServerRequest request){
        return ServerResponse.ok().contentType(APPLICATION_JSON)
                .body(fromPublisher(request.bodyToMono(Account.class).flatMap(service::store), Account.class));
    }

}
