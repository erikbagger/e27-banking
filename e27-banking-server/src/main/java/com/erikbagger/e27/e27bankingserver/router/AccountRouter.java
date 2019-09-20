package com.erikbagger.e27.e27bankingserver.router;

import com.erikbagger.e27.e27bankingserver.handler.AccountHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration
public class AccountRouter {

    private final String uri = "/account";

    @Bean("AccountRouter")
    public RouterFunction<ServerResponse> route(AccountHandler handler){
        return RouterFunctions.route(GET(uri), handler::findAll)
                .andRoute(POST(uri).and(accept(APPLICATION_JSON)), handler::store);
    }

}
