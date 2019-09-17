package com.erikbagger.e27.mobileclientjava.router;

import com.erikbagger.e27.mobileclientjava.handler.AccountHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.*;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration
public class AccountRouter {

    @Bean
    public RouterFunction<ServerResponse> route(AccountHandler handler){
        return RouterFunctions.route(GET("/account").and(accept(APPLICATION_JSON)), handler::handle);
    }
}
