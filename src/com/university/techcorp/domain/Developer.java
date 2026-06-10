package com.university.techcorp.domain;

public class Developer extends Employee {
    public Developer(String name, int experience, double salary) {
        super(name, experience, salary);
    }

    public int work() { return 10; }
}
