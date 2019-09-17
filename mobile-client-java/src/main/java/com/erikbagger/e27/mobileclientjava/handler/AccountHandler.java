package com.erikbagger.e27.mobileclientjava.handler;

import com.erikbagger.e27.mobileclientjava.entity.Account;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Component
public class AccountHandler {

    public Mono<ServerResponse> handle(ServerRequest request){
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromObject(new Account(UUID.randomUUID().toString(), "Erik", "Bagger", 0.0)));
    }
}
