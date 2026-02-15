package com.github.pamanne.exercises.javase016.exercise3;

import java.util.Objects;

public class Student {
    private String id;
    private String name;
    private String email;

    public Student(String id, String name, String email) throws InvalidStudentException {
        setId(id);
        setName(name);
        setEmail(email);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setId(String id) throws InvalidStudentException{
        if (id != null && !id.trim().isEmpty()) {
            this.id = id;
        } else {
            throw new InvalidStudentException("Student Id must not be empty or null!");
        }
    }

    public void setName(String name) throws InvalidStudentException {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            throw new InvalidStudentException("Student Name must not be empty or null!");
        }
    }

    public void setEmail(String email) throws InvalidStudentException {
        if (email != null && !email.trim().isEmpty()) {
            String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
            if (email.matches(emailRegex)) {
                this.email = email;
            } else {
                throw new InvalidStudentException("Invalid email format!");
            }

        } else {
            throw new InvalidStudentException("Student Email must not be empty or null!");
        }
    }

   

   @Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Student student = (Student) o;
    return Objects.equals(id, student.id) && Objects.equals(email, student.email);
}

@Override
public int hashCode() {
    return Objects.hash(id,email);
}

@Override
    public String toString() {
        return String.format("Student{id:" +id + ", name:" + name +", email:" + email +"}");
    }

}
