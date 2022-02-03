package hu.fisherRaceAPI.repositories;

import hu.fisherRaceAPI.domain.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {
    @Query(value="SELECT subject.SUBJECT_ID, subject.SubjectName FROM subject", nativeQuery = true)
    public List<Object[]> getSubjects();
}
