package br.inatel.restapi.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("eureka-client")
public interface GreetingFeignClient {
    @RequestMapping("/greetings")
    String greeting();
}