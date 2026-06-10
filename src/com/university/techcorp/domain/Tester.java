package com.university.techcorp.domain;

public class Tester extends Employee {
    public Tester(String name, int experience, double salary) {
        super(name, experience, salary);
    }

    public int work() { return 7; }
}
