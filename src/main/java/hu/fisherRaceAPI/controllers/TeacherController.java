/*
package hu.fisherRaceAPI.controllers;

import hu.fisherRaceAPI.domain.Teacher;
import hu.fisherRaceAPI.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService service;

    @GetMapping("/teachers")
    public List<Teacher> getTeachers(){
        return service.getTheachers();
    }

    @GetMapping("/teachers/{OMA_TEACHER}")
    public Teacher getTeacher(@PathVariable("OMA_TEACHER") int OMA_TEACHER){
        return service.getTeacher(OMA_TEACHER);
    }

    @PostMapping("/teachers")
    @ResponseStatus(HttpStatus.CREATED)
    public Teacher addTeacher(@RequestBody Teacher teacher){
        return service.addTeacher(teacher);
    }

    @PatchMapping("/teachers/{OMA_TEACHER}")
    public Teacher updateTeacher(@PathVariable("OMA_TEACHER") int OMA_TEACHER, @RequestBody Teacher teacher){
        String Name = teacher.getName();
        int Phone = teacher.getPhone();
        String Password = teacher.getPassword();
        boolean Admin = teacher.getAdmin();
        return service.updateTeacher(OMA_TEACHER, Name,Phone,Password,Admin);
    }

    @DeleteMapping("/teachers/{OMA_TEACHER}")
    public void deleteTEACHER(@PathVariable("OMA_TEACHER") int OMA_TEACHER){
        service.deleteTeacher(OMA_TEACHER);
    }



    @GetMapping("/catchlist/{id}")
    public List<CatchList> getCatchList(@PathVariable("id") int id){
        return service.getCatchList(id);
    }

    @GetMapping("/comp")
    public List<Competition> comp(){
        return service.competition();
    }





}
   */

