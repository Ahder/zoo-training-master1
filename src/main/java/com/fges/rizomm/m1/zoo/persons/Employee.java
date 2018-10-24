package main.java.com.fges.rizomm.m1.zoo.persons;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Employee extends Person{

    private List<String> materials = new ArrayList<>();

    private Double salary;

    private LocalTime startTime;
    private LocalTime endTime;

    private Employee manager;

    public Employee(State age) {
        super(age);
    }

    public Employee() {

    }
}
