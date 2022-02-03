package hu.fisherRaceAPI.controllers;

import hu.fisherRaceAPI.domain.ClassRoom;
import hu.fisherRaceAPI.domain.ClassRoomList;
import hu.fisherRaceAPI.services.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ClassRoomController {

    @Autowired
    private ClassRoomService service;

    @GetMapping("/classrooms")
    public List<ClassRoomList> getStudents(){
        return service.getClassRooms();
    }
}
