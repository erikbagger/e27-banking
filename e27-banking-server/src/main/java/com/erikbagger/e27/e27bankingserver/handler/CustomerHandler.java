package com.erikbagger.e27.e27bankingserver.handler;

import com.erikbagger.e27.e27bankingserver.document.Customer;
import com.erikbagger.e27.e27bankingserver.service.CustomerService;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Component
public class CustomerHandler {

    private final CustomerService service;

    public CustomerHandler(CustomerService service){
        this.service = service;
    }

    public Mono<ServerResponse> store(ServerRequest request){
        return ServerResponse.ok()
                .contentType(APPLICATION_JSON)
                .body(BodyInserters.fromPublisher(request.bodyToMono(Customer.class).flatMap(this.service::store), Customer.class));
    }

    public Mono<ServerResponse> findAll(ServerRequest request){
        return ServerResponse.ok()
                .contentType(APPLICATION_JSON)
                .body(BodyInserters.fromPublisher(this.service.findAll(), Customer.class));
    }
}
