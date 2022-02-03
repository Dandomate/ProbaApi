package hu.fisherRaceAPI.services;

import hu.fisherRaceAPI.domain.SubjectList;
import hu.fisherRaceAPI.domain.Subject;
import hu.fisherRaceAPI.repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {

        @Autowired
        private SubjectRepository repository;
        @Value("${server.port}")
        private int port;

        public List<SubjectList> getSubjects() {
            List<SubjectList> subjects = new ArrayList<>();
            List<Object[]> data = repository.getSubjects();
            for (Object[] object : data) {
                int SUBJECT_ID = (Integer)object[0];
                String SubjectName = (String) object[1];
                subjects.add(new SubjectList(SUBJECT_ID, SubjectName));
            }
            return subjects;
        }
    }