package com.example.EmployeeAPI.Model;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eid")
    private  int id;
    @Column(name = "ename")
    private String name;
    @Column(name = "eage")
    private int age;
    @Column(name = "esalary")
    private double salary;
    @Column(name = "edesg")
    private String desgin;

    public int getE_id() {
        return id;
    }

    public void setE_id(int id) {
        this.id = id;
    }

    public String getE_name() {
        return name;
    }

    public void setE_name(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDesgin() {
        return desgin;
    }

    public void setDesgin(String desgin) {
        this.desgin = desgin;
    }

    public Employee(int id, String name, int age, double salary, String desgin) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.desgin = desgin;
    }

    public Employee() {
    }
}
