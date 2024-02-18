package edu.hogwarts.application;

import edu.generic.Student;

import java.util.List;

public class StudentController {
    private List<Student> students;

    public StudentController(List<Student> students) {
        this.students = students;
    }

    // Method to create a new student
    public void createStudent(Student student) {
        students.add(student);
    }

    // Method to get a student by ID
    public Student getStudentById(int studentId) {
        for (Student student : students) {
            if (student.getId() == studentId) {
                return student;
            }
        }
        return null; // Student with given ID not found
    }

    // Method to get all students
    public List<Student> getAllStudents() {
        return students;
    }

    // Method to update a student
    public void updateStudent(int studentId, Student updatedStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == studentId) {
                students.set(i, updatedStudent);
                break;
            }
        }
    }

    // Method to delete a student
    public void deleteStudent(int studentId) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == studentId) {
                students.remove(i);
                break;
            }
        }
    }
}
