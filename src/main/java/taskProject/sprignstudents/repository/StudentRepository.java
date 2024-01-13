package taskProject.sprignstudents.repository;

import org.springframework.stereotype.Repository;
import taskProject.sprignstudents.model.StudentModel;

public interface StudentRepository extends JpoRepository<StudentModel, Long>{
}
