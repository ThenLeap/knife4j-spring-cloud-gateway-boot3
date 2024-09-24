package teck.jony.inner;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("user-service")
public interface UserClient {

    @GetMapping("/user/test/get")
    String test();

}
