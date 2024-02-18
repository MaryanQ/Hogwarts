package edu.generic;

import edu.hogwarts.data.HouseEnum;

public class Student {
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private HouseEnum house;
    private String role;

    public Student(String firstName, String middleName, String lastName, int age, HouseEnum house) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.house = house;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public HouseEnum getHouse() {
        return house;
    }

    public void setHouse(HouseEnum house) {
        this.house = house;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", house=" + house +
                ", role='" + role + '\'' +
                '}';
    }
}

