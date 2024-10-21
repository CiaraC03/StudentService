package ie.atu.studentservice2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name = "Student-service", url = "http://localhost:8081")
public interface EnrolementServiceClient {
    @PostMapping("/enrollment")
    String someDetails(@RequestBody Students students);
}
