package com.pyh.inherit.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Manager extends Employee{

    private double bonus;

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, double salary, int year, int month, int day, double bonus) {
        super(name, salary, year, month, day);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        double baseSalary=super.getSalary();
        return baseSalary+bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +super.toString()+
                "bonus=" + bonus +
                '}';
    }
}
