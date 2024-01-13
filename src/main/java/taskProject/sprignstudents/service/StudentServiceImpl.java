package taskProject.sprignstudents.service;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import taskProject.sprignstudents.model.StudentModel;
import taskProject.sprignstudents.repository.StudentRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class StudentServiceImpl implements studentService {

    private final StudentRepository repository;
    @Override
    public List<StudentModel> findAllStudent() {
        return null;
    }

    @Override
    public StudentModel saveStudent(StudentModel studentModel) {
        return null;
    }

    @Override
    public StudentModel findByEmail(String email) {
        return null;
    }

    @Override
    public StudentModel findByStudent(String email) {
        return null;
    }

    @Override
    public StudentModel updateStudent(StudentModel studentModel) {
        return null;
    }

    @Transactional
    @Override
    public void deleteStudent(String email) {

    }
}
