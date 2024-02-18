package edu.generic;

import edu.hogwarts.data.HouseEnum;

public class Teacher extends HogwartsPerson {
    private int id;
    private final String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public HouseEnum getHouse() {
        return HouseEnum.NONE;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", subject='" + subject + '\'' +
                ", house=" + getHouse() +
                '}';
    }
}
