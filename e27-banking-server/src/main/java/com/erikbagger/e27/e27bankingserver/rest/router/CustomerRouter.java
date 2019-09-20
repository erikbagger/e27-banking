package com.erikbagger.e27.e27bankingserver.rest.router;

import com.erikbagger.e27.e27bankingserver.rest.handler.CustomerHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration
public class CustomerRouter {

    private final String uri = "/customer";

    @Bean("CustomerRouter")
    public RouterFunction<ServerResponse> route(CustomerHandler handler){
        return RouterFunctions.route(POST(uri).and(accept(APPLICATION_JSON)), handler::store)
                .andRoute(GET(uri), handler::findAll);
    }
}
