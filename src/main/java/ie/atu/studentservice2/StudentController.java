package ie.atu.studentservice2;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class StudentController {
    public final StudentService studentService;
    private final EnrolementServiceClient enrolementServiceClient;

    public StudentController(StudentService studentService, EnrolementServiceClient enrolementServiceClient){
        this.studentService = studentService;
        this.enrolementServiceClient = enrolementServiceClient;
    }

    @GetMapping("/students")
    public List<Students> getStudentList(){
        return studentService.getStudentList();
    }

    @PostMapping("/students")
    public Students returnStudents(@RequestBody Students students){
        return studentService.returnStudent(students);
    }


    @PostMapping("/student/{studentId}")
    public String retreiveStudent(@Valid @RequestBody Students students){
        String confirm = enrolementServiceClient.someDetails(students);
        String response = confirm + " " + studentService.enrolementMessage(students);
        return response;
    }


}
