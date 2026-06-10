package com.university.techcorp.domain;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private double cash;
    private List<Employee> employees = new ArrayList<>();
    private List<Project> projects = new ArrayList<>();

    public Company(String name, double cash) {
        this.name = name;
        this.cash = cash;
    }

    public void hire(Employee e) {
        employees.add(e);
    }

    public void addProject(Project p) {
        projects.add(p);
    }

    public void reduceCash(double amount) {
        this.cash -= amount;
    }

    public String getName() { return name; }
    public double getCash() { return cash; }
    public List<Employee> getEmployees() { return employees; }
    public List<Project> getProjects() { return projects; }
}
