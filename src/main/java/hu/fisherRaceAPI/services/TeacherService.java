/*
package hu.fisherRaceAPI.services;

import hu.fisherRaceAPI.domain.Teacher;
import hu.fisherRaceAPI.repositories.TeacherRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository repository;

    public List<Teacher> getTheachers() {
        return repository.nativeFindTeacher();
    }

    public Teacher getTeacher(int OMA_TEACHER){
        Optional<Teacher> teacher = repository.findById(OMA_TEACHER);
        if(teacher.isPresent())
            return teacher.get();
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    public Teacher updateTeacher(int OMA_TEACHER, String Name,int Phone,String Password,boolean Admin) {
        Optional<Teacher> optionalTeacher = repository.findById(OMA_TEACHER);
        if(optionalTeacher.isPresent()){
            Teacher teacher = optionalTeacher.get();
            teacher.setName(Name);
            teacher.setPhone(Phone);
            teacher.setPassword(Password);
            teacher.setAdmin(Admin);
            return repository.save(teacher);
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }



    public Teacher addTeacher(@NotNull Teacher teacher){
        Optional<Teacher> optionalTeacher = repository.findById(teacher.getOMA_TEACHER());
        if(!optionalTeacher.isPresent()){
            return repository.save(teacher);
        }
        throw new ResponseStatusException(HttpStatus.CONFLICT);
    }

    public void deleteTeacher(int OMA_TEACHER) {
        Optional<Teacher> optionalTeacher = repository.findById(OMA_TEACHER);
        if(optionalTeacher.isPresent()){
            repository.deleteById(OMA_TEACHER);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }


    }


*/