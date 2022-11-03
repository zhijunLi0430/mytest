package com.bjpowernode.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder){
        RouteLocator build = builder.routes()
                .route("guochuang-id", r -> r.path("/guochuang").uri("https://www.bilibili.com/guochuang"))
                .route("dance-id", r -> r.path("/v/dance").uri("https://www.bilibili.com"))
                .build();
        return build;
    }
}
