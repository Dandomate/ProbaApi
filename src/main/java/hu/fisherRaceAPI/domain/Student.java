package hu.fisherRaceAPI.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int OMA_STUDENT;
    private String Name;
    private int CLASS_ID;



    public Student(int OMA_STUDENT, String Name, int CLASS_ID) {
        this.OMA_STUDENT = OMA_STUDENT;
        this.Name = Name;
        this.CLASS_ID = CLASS_ID;
    }

    public Student() {
    }

    public int getOMA_STUDENT() {
        return OMA_STUDENT;
    }

    public void setOMA_STUDENT(int OMA_STUDENT) {
        this.OMA_STUDENT = OMA_STUDENT;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCLASS_ID() {
        return CLASS_ID;
    }

    public void setCLASS_ID(int CLASS_ID) {
        this.CLASS_ID = CLASS_ID;
    }
}
