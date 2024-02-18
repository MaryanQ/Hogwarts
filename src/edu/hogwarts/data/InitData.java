package edu.hogwarts.data;

import edu.generic.Student;
import edu.generic.Teacher;


import java.util.ArrayList;
import java.util.List;

public class InitData {
    private static final List<Student> studentsList = new ArrayList<>();
    private static final List<Teacher> teachersList = new ArrayList<>();

    public static void initData() {

        createStudents();


        createTeachers();
    }

    private static void createStudents() {


            Student student1 = new Student("Harry", "James", "Potter", 12, HouseEnum.GRYFFINDOR);
            Student student2 = new Student("Hermione", "Jean", "Granger", 12, HouseEnum.GRYFFINDOR);
            Student student3 = new Student("Ronald", "Bilius", "Weasley", 12, HouseEnum.GRYFFINDOR);
            Student student4 = new Student("Draco", "Lucius", "Malfoy", 12, HouseEnum.SLYTHERIN);
            Student student5 = new Student("Luna", "", "Lovegood", 12, HouseEnum.RAVENCLAW);
            Student student6 = new Student("Neville", "Longbottom", "", 12, HouseEnum.GRYFFINDOR);
            Student student7 = new Student("Ginny", "Molly", "Weasley", 12, HouseEnum.GRYFFINDOR);
            Student student8 = new Student("Fred", "", "Weasley", 12, HouseEnum.GRYFFINDOR);
            Student student9 = new Student("George", "", "Weasley", 12, HouseEnum.GRYFFINDOR);
            Student student10 = new Student("Cho", "", "Chang", 12, HouseEnum.RAVENCLAW);

            studentsList.add(student1);
            studentsList.add(student2);
            studentsList.add(student3);
            studentsList.add(student4);
            studentsList.add(student5);
            studentsList.add(student6);
            studentsList.add(student7);
            studentsList.add(student8);
            studentsList.add(student9);
            studentsList.add(student10);
        }



    private static void createTeachers() {

        Teacher headmaster = new Teacher("Albus Dumbledore", 116, "Headmaster");
        Teacher mcGonagall = new Teacher("Minerva McGonagall", 70, "Transfiguration");
        Teacher snape = new Teacher("Severus Snape", 38, "Potions");
        Teacher flitwick = new Teacher("Filius Flitwick", 62, "Charms");


        teachersList.add(headmaster);
        teachersList.add(mcGonagall);
        teachersList.add(snape);
        teachersList.add(flitwick);
    }


    public static List<Student> getStudentsList() {
        return studentsList;
    }

    public static List<Teacher> getTeachersList() {
        return teachersList;
    }
}
