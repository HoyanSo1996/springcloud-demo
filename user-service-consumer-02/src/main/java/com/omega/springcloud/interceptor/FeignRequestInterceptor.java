package com.omega.springcloud.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignRequestInterceptor implements RequestInterceptor {

    /**
     * 只要通过 FeignClient 访问的接口都会走这个地方。
     */
    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header("X-KEY", "333333");
    }
}
