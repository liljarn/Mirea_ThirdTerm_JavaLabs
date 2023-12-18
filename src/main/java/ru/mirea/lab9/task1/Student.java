package ru.mirea.lab9.task1;

public class Student{
    private String name;
    private int iDNumber;
    private int score;

    public Student(String name, int iDNumber, int score) {
        this.name = name;
        this.iDNumber = iDNumber;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    @Override
    public String toString() {
        return "Студент: " + name +", номер: " + iDNumber + ", баллы: " + score;
    }
}