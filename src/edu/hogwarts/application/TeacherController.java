package edu.hogwarts.application;


import edu.generic.Teacher;


import java.util.List;





public class TeacherController {
    private List<Teacher> teachers;
    private static TeacherController instance;


    public TeacherController(List<Teacher> teachers) {
        this.teachers = teachers;
    }


    public static TeacherController getInstance(List<Teacher> teachers) {
        if (instance == null) {
            instance = new TeacherController(teachers);
        }
        return instance;
    }

    // Method to create a new teacher
    public void createTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    // Method to get a teacher by ID
    public Teacher getTeacherById(int teacherId) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == teacherId) {
                return teacher;
            }
        }
        return null; // Teacher with given ID not found
    }

    // Method to get all teachers
    public List<Teacher> getAllTeachers() {
        return teachers;
    }

    // Method to update a teacher
    public void updateTeacher(int teacherId, Teacher updatedTeacher) {
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getId() == teacherId) {
                teachers.set(i, updatedTeacher);
                break;
            }
        }
    }

    // Method to delete a teacher
    public void deleteTeacher(int teacherId) {
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getId() == teacherId) {
                teachers.remove(i);
                break;
            }
        }
    }
}

