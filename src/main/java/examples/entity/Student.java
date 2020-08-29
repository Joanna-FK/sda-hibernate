package examples.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @ManyToMany(cascade = CascadeType.ALL)
    Set<School> schools = new HashSet<>();

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public void addSchool(School school) {
        schools.add(school);
    }
}
