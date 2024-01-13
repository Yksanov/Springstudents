package taskProject.sprignstudents.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import taskProject.sprignstudents.model.StudentModel;
import taskProject.sprignstudents.service.studentService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/StudentModel")
@AllArgsConstructor
public class StudentController {

    @Autowired
    private final studentService service;
    @GetMapping
    public List<StudentModel> findAllStudent(){
        //todo
        return service.findAllStudent();
    }

    @PostMapping("save_student")
    public String saveStudent(@RequestBody StudentModel studentModel){
        service.saveStudent(studentModel);
        return "Student successfully saved";
    }
    @GetMapping("/{email}")
    public StudentModel findByEmail(@PathVariable String email){
        return service.findByEmail(email);
    }
    @PutMapping("update_student")
    public StudentModel updateStudent(StudentModel studentModel) {
        return service.updateStudent(studentModel);
    }

    @DeleteMapping("delete_student/{email}")
    public void deleteStudent(@PathVariable String email){
        service.deleteStudent(email);
    }
}
