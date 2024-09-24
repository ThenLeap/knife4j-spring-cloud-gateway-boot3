package teck.jony.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import teck.jony.inner.UserClient;

@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private UserClient userClient;

    @GetMapping("/get")
    public String get() {
        return "Hello World!  --from order-service's TestController";
    }

    @GetMapping("/feign")
    public String testFeign() {
        return userClient.test();
    }
}
