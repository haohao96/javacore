package com.pyh.inherit.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee extends Person{

    private String name;
    private double salary;
    private LocalDate hireday;
    private String description;

    public Employee(String name, double salary, int year,int month,int day) {
        this.name = name;
        this.salary = salary;
        this.hireday = LocalDate.of(year,month,day);
    }

    public Employee(String name)
    {
        this.name=name;
    }

    public String getDescription()
    {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(name, employee.name) &&
                Objects.equals(hireday, employee.hireday) &&
                Objects.equals(description, employee.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, hireday, description);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireday=" + hireday +
                ", description='" + description + '\'' +
                '}';
    }
}
