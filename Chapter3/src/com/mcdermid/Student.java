package com.mcdermid;

public class Student {
    private String name;

    private double totalScore;

    private int quizNumber;

    public Student(String name, double score, int quizzesTaken) {
        this.name = name;
        this.totalScore = score;
        this.quizNumber = quizzesTaken;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public double getScore() {
        return this.totalScore;
    }

    public double getAverageScore() {
        return this.totalScore / this.quizNumber;
    }

    public void addQuiz(double score) {
        this.totalScore += score;
        this.quizNumber++;
    }

    public String toString() {
        return this.name + " has a total score of " + this.totalScore + " and an average score of "
                + this.getAverageScore() + ".";
    }
}
