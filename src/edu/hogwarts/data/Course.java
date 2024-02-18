package edu.hogwarts.data;


import edu.generic.HogwartsStudent;
import edu.generic.Teacher;
import edu.hogwarts.data.Book;
import edu.hogwarts.data.Cauldron;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private Subject subject;
    private Teacher teacher;
    private int year;
    private List<HogwartsStudent> students;
    private Book book;
    private Cauldron cauldron;
    private SilverKnife silverKnife;
    private List<Ingredient> ingredients;

    public Course() {
   
        this.students = new ArrayList<>();
    }

    public Course(Subject subject, Teacher teacher, int year) {
        this.subject = subject;
        this.teacher = teacher;
        this.year = year;
        this.students = new ArrayList<>();
    }

  

    public List<HogwartsStudent> getStudents() {
        return students;
    }

    public void setStudents(List<HogwartsStudent> students) {
        this.students = students;
    }

    

    public void addStudent(HogwartsStudent student) {
        students.add(student);
    }

      public Teacher getTeacher() {
        return teacher;
    }

  public void setBook(Book book) {
        this.book = book;
    }

    public void setCauldron(Cauldron cauldron) {
        this.cauldron = cauldron;
    }

    public void setSilverKnife(SilverKnife silverKnife) {
        this.silverKnife = silverKnife;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

 



 @Override
    public String toString() {
        return "edu.hogwarts.data.Course{" +
                "subject=" + subject +
                ", teacher=" + teacher +
                ", year=" + year +
                ", students=" + students +
                ", book=" + book +
                ", cauldron=" + cauldron +
                ", silverKnife=" + silverKnife +
                ", ingredients=" + ingredients +
                '}';
    }
}
