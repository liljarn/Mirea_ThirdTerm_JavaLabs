package ru.mirea.lab10;

public class Student {
    private String firstName;
    private String secondName;
    private String specialty;
    private int course;
    private String group;
    private int GPA;

    public Student(String firstName, String secondName, String specialty, int course, String group, int GPA) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.GPA = GPA;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Студент: " +
                "имя - '" + firstName + '\'' +
                ", фамилия - '" + secondName + '\'' +
                ", специальность - '" + specialty + '\'' +
                ", курс - " + course +
                ", группа - '" + group + '\'' +
                ", средний балл - " + GPA;
    }
}