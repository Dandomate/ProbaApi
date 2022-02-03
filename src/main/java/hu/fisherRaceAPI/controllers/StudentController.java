package hu.fisherRaceAPI.controllers;

import hu.fisherRaceAPI.domain.Student;
import hu.fisherRaceAPI.domain.StudentList;
import hu.fisherRaceAPI.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/students")
    public List<StudentList> getStudents(){
        return service.getStudents();
    }
}
