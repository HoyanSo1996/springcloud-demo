package com.omega.springcloud.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayRouteConfig {

    // /**
    //  * 创建路由规则的第二种配置方法.
    //  */
    // @Bean
    // public RouteLocator myRouteLocator01(RouteLocatorBuilder builder) {
    //     return builder.routes()
    //             .route("user_route01", r -> r
    //                     .path("/provider/user/query/**")
    //                     .uri("http://localhost:8083")).build();
    // }
    //
    // @Bean
    // public RouteLocator myRouteLocator02(RouteLocatorBuilder builder) {
    //     return builder.routes()
    //             .route("user_route02", r -> r
    //                     .path("/provider/user/save")
    //                     .uri("http://localhost:8083")).build();
    // }
}
