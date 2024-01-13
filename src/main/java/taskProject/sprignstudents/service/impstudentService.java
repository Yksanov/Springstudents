package taskProject.sprignstudents.service;

import lombok.AllArgsConstructor;
import org.springframework.aot.generate.InMemoryGeneratedFiles;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import taskProject.sprignstudents.model.StudentModel;
import taskProject.sprignstudents.repository.inMemoryStudent;

import java.util.List;

@Service
@AllArgsConstructor
public class impstudentService implements studentService{

    private final inMemoryStudent repository;
    @Override
    public List<StudentModel> findAllStudent(){
        return repository.findAllStudent();
    }
    @Override
    public StudentModel saveStudent(StudentModel studentModel){
        return repository.saveStudent(studentModel);
    }

    @Override
    public StudentModel findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public StudentModel findByStudent(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public StudentModel updateStudent(@RequestBody StudentModel studentModel) {
        return repository.updateStudent(studentModel);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }
}
