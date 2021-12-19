package ru.skypro;

public class Main {

    public static void main(String[] args) {
        EmployeeBook bookEmp = new EmployeeBook(10);
        bookEmp.addEmployee(new Employee("Иван", "Иванов", "Иванович", "4", 150_000));
        bookEmp.addEmployee(new Employee("Сергей", "Смирнов", "Сергеевич", "2", 120_000));
        bookEmp.addEmployee(new Employee("Александр", "Михайлов", "Олегович", "4", 50_000));
        bookEmp.addEmployee(new Employee("Александр", "Александров", "Александрович", "5", 50_000));
        bookEmp.addEmployee(new Employee("Алексей", "Семенов", "Николаевич", "3", 60_000));
        bookEmp.addEmployee(new Employee("Юрий", "Радомский", "Викторович", "3", 70_000));
        bookEmp.addEmployee(new Employee("Игорь", "Огурцов", "Анатольевич", "4", 50_000));
        bookEmp.addEmployee(new Employee("Игорь", "Огурцов", "Анатольевич", "4", 50_000));

        System.out.println(bookEmp.listOfEmployeesInDepartments());



    }

    public static void printMassiveEmployee(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i]);
            }
        }
    }


    }
