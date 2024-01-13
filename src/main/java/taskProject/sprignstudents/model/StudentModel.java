package taskProject.sprignstudents.model;

import lombok.*;

import java.beans.Transient;
import java.time.LocalDate;
import java.time.Period;

@Data
@Entity
@Table(name = "students")
public class StudentModel {
    @Id
    @GeneratedValue
    private Long id;
    private String firstname;
    private String lastname;
    private LocalDate dateofBirth;
    @Column(unique = true)
    private String email;
    private int age;
    public int getAge() {
        return Period.between(dateofBirth, LocalDate.now()).getYears();
    }

}
