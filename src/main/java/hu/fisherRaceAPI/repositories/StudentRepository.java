package hu.fisherRaceAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import hu.fisherRaceAPI.domain.Student;

import java.util.List;

@Repository

    public interface StudentRepository extends JpaRepository<Student, Integer> {
    @Query(value="SELECT student.OMA_STUDENT, student.Name, student.CLASS_ID  FROM student ;"
            , nativeQuery = true)
    public List<Object[]> getStudents();
}
