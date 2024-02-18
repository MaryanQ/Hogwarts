package edu.hogwarts.application;


import edu.generic.HogwartsPerson;
import edu.generic.Student;
import edu.generic.Teacher;
import edu.hogwarts.data.InitData;

import edu.hogwarts.data.Subject;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Application {
    private static final StudentController studentController = new StudentController(InitData.getStudentsList());
    private static final TeacherController teacherController = TeacherController.getInstance(InitData.getTeachersList());

    private static final Scanner scanner = new Scanner(System.in);
    private static List<Teacher> teacherList;

    public static void main(String[] args) {
        // Initialize data
        InitData.initData();

        // Display menu
        displayMenu();
    }

    private static void displayMenu() {
        System.out.println("Welcome to the Hogwarts Student and Teacher Management System!");
        int choice;
        do {
            System.out.println("1. Display Students");
            System.out.println("2. Display Teachers");
            System.out.println("3. Sort Students and Teachers");
            System.out.println("4. Filter Students by House");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    displayStudents();
                    break;
                case 2:
                    displayTeachers();
                    break;
                case 3:
                    sortData();
                    break;
                case 4:
                    filterStudentsByHouse();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }
    private static void displayStudents() {
        List<Student> students = retrieveStudents();
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("List of Students:");
            displayTable(students);
        }
    }

    private static List<Student> retrieveStudents() {
        return studentController.getAllStudents();
    }

    private static void displayTeachers() {
        List<Teacher> teachers = teacherController.getAllTeachers();
        if (teachers.isEmpty()) {
            System.out.println("No teachers found.");
        } else {
            System.out.println("List of Teachers:");
            displayTeachersTable(teachers); // Legg til dette kallet
        }
    }




    private static void sortData() {
        System.out.println("Sort by which column? (1. First Name, 2. Last Name, 3. Age, 4. House, 5. Role)");
        int columnChoice = scanner.nextInt();
        List<Student> studentList = studentController.getAllStudents();
        List<Teacher> teacherList = teacherController.getAllTeachers();

        switch (columnChoice) {
            case 1:
                studentList.sort(Comparator.comparing(Student::getFirstName));
                teacherList.sort(Comparator.comparing(Teacher::getName));
                break;
            case 2:
                studentList.sort(Comparator.comparing(Student::getLastName));

                break;
            case 3:
                studentList.sort(Comparator.comparingInt(Student::getAge));
                teacherList.sort(Comparator.comparingInt(Teacher::getAge));
                break;
            case 4:

                System.out.println("Cannot sort teachers by house.");
                return;
            case 5:

                System.out.println("Cannot sort teachers by role.");
                return;
            default:
                System.out.println("Invalid choice. Sorting aborted.");
                return;
        }

        // Display sorted students
        displayTable(studentList);
        // Display sorted teachers
        displayTeachers();
    }


    private static void filterStudentsByHouse() {
        System.out.println("Enter house to filter (e.g., GRYFFINDOR):");
        String house = scanner.next().toUpperCase();
        List<Student> students = retrieveStudents();
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getHouse().toString().equals(house)) {
                filteredStudents.add(student);
            }
        }
        if (filteredStudents.isEmpty()) {
            System.out.println("No students found in the house " + house);
        } else {
            System.out.println("Students in house " + house + ":");
            displayTable(filteredStudents);
        }
    }

    private static void displayTable(List<Student> students) {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("| %-15s | %-15s | %-15s | %-4s | %-10s |\n", "First Name", "Last Name", "Age", "House", "Role");
        System.out.println("-----------------------------------------------------------------------------");
        for (Student student : students) {
            System.out.printf("| %-15s | %-15s | %-15s | %-4s | %-10s |\n", student.getFirstName(), student.getLastName(), student.getAge(), student.getHouse(), student.getRole());



        }
        System.out.println("-----------------------------------------------------------------------------");
    }
    private static void displayTeachersTable(List<Teacher> teachers) {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("| %-15s | %-15s | %-15s | %-4s | %-10s |\n", "First Name", "Last Name", "Age", "House", "Role");
        System.out.println("-----------------------------------------------------------------------------");
        for (Teacher teacher : teachers) {
            System.out.printf("| %-15s | %-15s | %-15s | %-4s | %-10s |\n", teacher.getName(), "", teacher.getAge(), teacher.getHouse(), "Teacher");
        }
        System.out.println("-----------------------------------------------------------------------------");
    }



}