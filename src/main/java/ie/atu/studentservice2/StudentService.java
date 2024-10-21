package ie.atu.studentservice2;


import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {




    private List<Students> studentList = new ArrayList<>();

    public List<Students> getStudentList(){
        return studentList;

    }

    public Students returnStudent(Students students){
        studentList.add(students);
        return students;
    }

    public String enrolementMessage(Students students){
        String message = "Thank you" + students.getStudentId() + ", Your enrollment has been completed ";
        return message;
    }
}
