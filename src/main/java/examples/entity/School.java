package examples.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "schools")
    Set<Student> students = new HashSet<>();

    public School() {
    }

    public School(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        this.students.add(student);
        student.addSchool(this);
    }
}
