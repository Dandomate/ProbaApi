package hu.fisherRaceAPI.controllers;

import hu.fisherRaceAPI.domain.Subject;
import hu.fisherRaceAPI.domain.SubjectList;
import hu.fisherRaceAPI.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class SubjectController {

    @Autowired
    private SubjectService service;

    @GetMapping("/subjects")
    public List<SubjectList> getSubjects(){
        return service.getSubjects();
    }
}
