package hu.fisherRaceAPI.services;

import hu.fisherRaceAPI.domain.ClassRoom;
import hu.fisherRaceAPI.domain.ClassRoomList;
import hu.fisherRaceAPI.repositories.ClassRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClassRoomService {
    @Autowired
    private ClassRoomRepository repository;
    @Value("${server.port}")
    private int port;

    public List<ClassRoomList> getClassRooms() {
        List<ClassRoomList> classrooms = new ArrayList<>();
        List<Object[]> data = repository.getClassRooms();
        for (Object[] object : data) {
            int DOORNUMBER_ID = (Integer)object[0];
            String Door = (String) object[1];
            int Space = (Integer) object[2];
            classrooms.add(new ClassRoomList(DOORNUMBER_ID, Door, Space));
        }
        return classrooms;
    }
}