package examples.entity;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name= "employee_table")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false)
    String name;
    @Column (name = "password")
    String secret;
    @Column(length = 9, unique = true)
    String telephoneNumber;
    @Transient
    long age;
    @Temporal(TemporalType.DATE)
    Date birthDate;
    @Enumerated(EnumType.STRING)
    Gender gender;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    String description;
    @Embedded
    Address address;


    public Employee() {
    }

    public Employee(String name, String secret, String telephoneNumber, long age, Date birthDate, Gender gender, String description) {
        this.name = name;
        this.secret = secret;
        this.telephoneNumber = telephoneNumber;
        this.age = age;
        this.birthDate = birthDate;
        this.gender = gender;
        this.description = description;

    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
