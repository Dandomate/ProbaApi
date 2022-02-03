/*
package hu.fisherRaceAPI.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Teacher {

    @Id
    private int OMA_TEACHER;
    private String Name;
    private int Phone; //át kell irni varcharra mert ha van benne plusz
    private String Password;
    private boolean Admin;

    @OneToMany(mappedBy = "teacher")
    @JsonIgnore
    private List<TeacherSubject> teacherSubjects;



    public Teacher() {
    }

    public Teacher(int OMA_TEACHER, String Name, int Phone, String Password,boolean Admin) {
        this.OMA_TEACHER = OMA_TEACHER;
        this.Name = Name;
        this.Phone = Phone;
        this.Password = Password;
        this.Admin = Admin;
    }

    public int getOMA_TEACHER() {
        return OMA_TEACHER;
    }

    public void setOMA_TEACHER(int OMA_TEACHER) {
        this.OMA_TEACHER = OMA_TEACHER;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public  int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public boolean getAdmin() {
        return Admin;
    }

    public void setAdmin(boolean admin) {
        Admin = admin;
    }


    public List<TeacherSubject> getCatches() {
        return teacherSubjects;
    }

    public void setCatches(List<TeacherSubject> teacherSubjects) {
        this.teacherSubjects = teacherSubjects;
    }


}

        */