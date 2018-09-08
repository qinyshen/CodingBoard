package com.company.EffectiveJava;

public class StudentCompare implements Comparable<StudentCompare>{
    private int id;
    private String name;
    private double score;





    @Override
    public int compareTo(StudentCompare student) {

        return 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public StudentCompare(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }
}
