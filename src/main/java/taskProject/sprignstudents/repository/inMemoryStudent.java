package taskProject.sprignstudents.repository;

import org.springframework.stereotype.Repository;
import taskProject.sprignstudents.model.StudentModel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.Locale.filter;

@Repository
public class inMemoryStudent {
    private final List<StudentModel> STUDENT = new ArrayList<>();

    public List<StudentModel> findAllStudent(){
        return STUDENT;
    }

    public StudentModel saveStudent(StudentModel studentModel){
        STUDENT.add(studentModel);
        return studentModel;
    }

    public StudentModel findByEmail(String email) {
        return STUDENT.stream()
                .filter(element -> element.getEmail().equals(email))
                .findFirst()
               .orElse(null);
    }

    public StudentModel updateStudent(StudentModel studentModel) {
        var StudentIndex = IntStream.range(0, STUDENT.size())
                .filter(index -> STUDENT.get(index).getEmail().equals(studentModel.getEmail()))
                .findFirst()
                .orElse(-1);
        if(StudentIndex > -1){
            STUDENT.set(StudentIndex,studentModel);
            return studentModel;
        }

        return null;
    }

    public void deleteStudent(String email) {
        var studentModel = findAllStudent();
        if(studentModel == null){
            STUDENT.remove(studentModel);
        }
    }
}
