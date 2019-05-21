package com.example.azadt.deutournament;

public class Referee extends Human{

    int salary;

    public Referee(int age, int weight, int height, int salary) {
        super(age, weight, height);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}

