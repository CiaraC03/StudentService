package ie.atu.studentservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class StudentService2Application {

    public static void main(String[] args) {
        SpringApplication.run(StudentService2Application.class, args);
    }

}
