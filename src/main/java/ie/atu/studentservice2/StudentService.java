package ie.atu.studentservice2;


import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentsRepository studentsRepository;

    public StudentService(StudentsRepository studentsRepository){
        this.studentsRepository = studentsRepository;
    }

    public String enrolementMessage(Students students){
        String message = "Thank you" + students.getStudentId() + ", Your enrolement has been completed ";
        return message;
    }
}
