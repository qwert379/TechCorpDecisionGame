package com.university.techcorp.domain;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private String name;
    private int progress;
    private int requiredWork;
    private List<Employee> team = new ArrayList<>();

    public Project(String name, int requiredWork) {
        this.name = name;
        this.requiredWork = requiredWork;
    }

    public void addEmployee(Employee e) {
        team.add(e);
    }

    public void workOneTurn() {
        for (Employee e : team) {
            progress += e.work();
        }
    }

    public boolean isCompleted() {
        return progress >= requiredWork;
    }

    public String getName() { return name; }
    public int getProgress() { return progress; }
    public int getRequiredWork() { return requiredWork; }
}
