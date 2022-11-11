//package com.example.eurekagateway.config;
//
//import io.netty.resolver.DefaultAddressResolverGroup;
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import reactor.netty.http.client.HttpClient;
//
//
//@Configuration
//public class SpringConfig {
//
////    @Bean
////    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
////        return builder.routes()
////                .route(r -> r.path("/E**")
////                        .uri("http://EUREKA-CLIENT")
////                        //.id("employeeModule")
////                )
////
////                .route(r -> r.path("/**")
////                        .uri("http://SECOND-SERVICE")
////                        //.id("consumerModule")
////                )
////                .build();
////    }
//
//    @Bean
//    public HttpClient httpClient() {
//        return HttpClient.create().resolver(DefaultAddressResolverGroup.INSTANCE);
//    }
//}
