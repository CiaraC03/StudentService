package ie.atu.studentservice2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name = "Student-service", url = "http://localhost:8080")
public interface EnrolementServiceClient {
    @PostMapping("/enrolement")
    String someDetails(@RequestBody Students students);
}
