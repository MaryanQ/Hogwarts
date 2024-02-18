package edu.hogwarts.data;

public class Subject {
    private String name;

    public Subject() {
       
    }

    public Subject(String name) {
        this.name = name;
    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   

    @Override
    public String toString() {
        return "edu.hogwarts.data.Subject{" +
                "name='" + name + '\'' +
                '}';
    }
}
