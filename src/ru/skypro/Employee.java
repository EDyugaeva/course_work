package ru.skypro;

public class Employee {
    public final String firstName;
    public final String lastName;
    public final String middleName;
    public String department;
    public int salary;
    public static int id = 0;

    public Employee(String firstName, String lastName, String middleName, String department, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        id = id + 1;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getFullName() {
        return lastName + " " + firstName + " " + middleName;
    }


    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Имя - " + firstName +
                ", фамилия - " + lastName +
                ", отчество - " + middleName +
                ", Отдел - " + department +
                ", Зарплата - " + salary;
    }
}
