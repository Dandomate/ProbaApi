/*
package hu.fisherRaceAPI.repositories;

import hu.fisherRaceAPI.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
    public List<Teacher> findAllByOrderByName();

    @Query(value="SELECT * FROM teacher ORDER BY Name ASC", nativeQuery = true)
    public List<Teacher> nativeFindTeacher();
}
*/