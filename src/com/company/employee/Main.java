package com.company.employee;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager("Alice", 101, 80000.0, 5);
        Developer developer = new Developer("Bob", 102, 60000.0, "Java");

        manager.displayDetails();
        developer.displayDetails();
    }
}
