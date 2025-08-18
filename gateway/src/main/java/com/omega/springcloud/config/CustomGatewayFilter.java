package com.omega.springcloud.config;

// @Component
// public class CustomGatewayFilter implements GlobalFilter, Ordered {
//
//     /**
//      * 处理当前请求。有必要的话通过{@link GatewayFilterChain}将请求交给下一个过滤器处理
//      *
//      * @param exchange  请求上下文，里面可以获取Request、Response等信息
//      * @param chain  过滤器链，用来把请求委托给下一个过滤器
//      * @return {@code Mono<Void>}  返回标示当前过滤器业务结束
//      */
//     @Override
//     public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//         System.out.println("========== CustomGateWayFilter =========== ");
//         String username = exchange.getRequest().getQueryParams().getFirst("username");
//         String password = exchange.getRequest().getQueryParams().getFirst("password");
//         if (!("kenny".equals(username) && "123456".equals(password))) {
//             System.out.println("====== 非法用户 ======");
//             exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
//             return exchange.getResponse().setComplete();
//         }
//         System.out.println("====== 验证通过, 放行 ======");
//         return chain.filter(exchange);
//     }
//
//     /**
//      * 表示该过滤器的执行顺序, 数字越小, 优先级越大
//      */
//     @Override
//     public int getOrder() {
//         return 0;
//     }
// }
