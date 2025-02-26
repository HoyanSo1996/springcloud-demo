package com.omega.springcloud.config;

import com.omega.springcloud.entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
public class InfoController {

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/eureka/discovery")
    public Result<Object> discovery() {
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("============ 服务名: {} ============", service);
            for (ServiceInstance instance : discoveryClient.getInstances(service)) {
                log.info("实例Id: {}, 主机名: {}, 端口号: {}, Uri: {}",
                        instance.getInstanceId(), instance.getHost(), instance.getPort(), instance.getUri());
            }
        }
        return Result.success("查询数据成功~", services);
    }
}
