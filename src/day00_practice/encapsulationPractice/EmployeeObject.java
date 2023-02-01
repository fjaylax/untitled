package day00_practice.encapsulationPractice;

import day04_variables.Employee;

public class EmployeeObject {
    public static void main(String[] args) {

        EmployeePractice employee1 = new EmployeePractice();
        employee1.setName("Josh");
        employee1.setSalary(-  110_000);
        System.out.println(employee1.getName());
        System.out.println(employee1.getSalary());


    }

    }