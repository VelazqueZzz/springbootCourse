package com.springboot.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "department")
    private String department;
    @Column(name = "salary")
    private String salary;

    public Employee() {
    }

    public Employee(String name, String surname, String department, String salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

}
