package taskProject.sprignstudents.service;

import org.springframework.stereotype.Service;
import taskProject.sprignstudents.model.StudentModel;

import java.util.List;

public interface studentService {
     List<StudentModel> findAllStudent();

     StudentModel saveStudent(StudentModel studentModel);
     StudentModel findByEmail(String email);

     StudentModel findByStudent(String email);

     StudentModel updateStudent(StudentModel studentModel);
     void deleteStudent(String email);
}
