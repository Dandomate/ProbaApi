package hu.fisherRaceAPI.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import hu.fisherRaceAPI.domain.Student;
import hu.fisherRaceAPI.domain.StudentList;
import hu.fisherRaceAPI.repositories.StudentRepository;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;
    @Value("${server.port}")
    private int port;

    public List<StudentList> getStudents() {
        List<StudentList> students = new ArrayList<>();
        List<Object[]> data = repository.getStudents();
        for (Object[] object : data) {
            int OMA_STUDENT = (Integer)object[0];
            String Name = (String) object[1];
            int CLASS_ID = (Integer) object[2];
            students.add(new StudentList(OMA_STUDENT, Name, CLASS_ID));
        }
        return students;
    }
}