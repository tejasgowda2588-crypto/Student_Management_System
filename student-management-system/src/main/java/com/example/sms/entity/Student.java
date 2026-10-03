package com.example.sms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "students")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Student {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(name = "first_name", nullable = false )
private String firstName;

@Column(name = "last_name", nullable = false )
private String lastName;

@Column(name = "email", nullable = false, unique = true)
private String email;

@Column(name = "course")
private String course;

public void setFirstName(String firstName) {
    this.firstName = firstName;
}

public void setLastName(String lastName) {
    this.lastName = lastName;
}

public void setEmail(String email) {
    this.email = email;
}

public String getFirstName() {
    return firstName;
}

public String getLastName() {
    return lastName;
}

public String getEmail() {
    return email;
}

public String getCourse() {
    return course;
}

public void setCourse(String course) {
    this.course = course;
}

}
