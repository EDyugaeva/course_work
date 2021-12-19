package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иван", "Иванов", "Иванович", "4", 150_000);
        employees[1] = new Employee("Сергей", "Смирнов", "Сергеевич", "2", 120_000);
        employees[2] = new Employee("Александр", "Александров", "Александрович", "4", 50_000);
        employees[3] = new Employee("Александр", "Александров", "Александрович", "5", 50_000);
        employees[4] = new Employee("Алексей", "Семенов", "Николаевич", "3", 60_000);
        employees[5] = new Employee("Юрий", "Радомский", "Викторович", "3", 70_000);
        employees[6] = new Employee("Игорь", "Огурцов", "Анатольевич", "4", 50_000);


//
        listOfEmployees(employees); // Вывод список сотрудников
//        System.out.println("Зарплата всех сотрудников - " + sum(employees) + " рублей."); // сумма затрат на зарплаты
        System.out.println("Сотрудники с минимальной зарплатой: ");
//        printMassive(employeeMinSalary(employees)); // сотрудник с минимальной зарплатой
        System.out.println("Сотрудники с максимальной зарплатой: ");
//        printMassive(employeeMaxSalary(employees)); // сотрудник с максимальной зарплатой
        System.out.println("=============");

//        System.out.println("Средняя зарплата - " + mediumSalary(employees)); //среднее значение зарплат
//        printNames(employees); // вывод ФИО

        findEmployeeWithHigherSalary(employees,100000);




    }


    public static void listOfEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null)
                System.out.println(employees[i]);

        }
    }

    public static int sum(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum = sum + employees[i].salary;
            }

        }
        return sum;
    }

    public static Employee[] employeeMinSalary(Employee[] employees) {
        int temp = Integer.MAX_VALUE;
        Employee[] tempEmployee = new Employee[employees.length];
        int k = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].salary <= temp) {
                temp = employees[i].salary;
                tempEmployee[k] = employees[i];
                k = k + 1;
            }
        }
        for (int i = 0; i < tempEmployee.length; i++) {
            if (tempEmployee[i] != null && tempEmployee[i].salary > temp) {
                tempEmployee[i] = null;
            }
        }
        return tempEmployee;
    }

    public static void printMassive(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].toString());
            }
        }
    }


    public static Employee[] employeeMaxSalary(Employee[] employees) {
        int temp = Integer.MIN_VALUE;
        Employee[] tempEmployee = new Employee[employees.length];
        int k = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].salary >= temp) {
                temp = employees[i].salary;
                tempEmployee[k] = employees[i];
                k = k + 1;
            }
        }
        for (int i = 0; i < tempEmployee.length; i++) {
            if (tempEmployee[i] != null && tempEmployee[i].salary < temp) {
                tempEmployee[i] = null;
            }
        }
        return tempEmployee;
    }

    public static int mediumSalary(Employee[] employees) {
        int medium = sum(employees) / employees[0].getId();
        return medium;
    }

    public static void printNames(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFullName());
            }

        }
    }

    public static void indexSalary(Employee[] employees, int arg) {
        float temp = (float) (1 + arg / 100f);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employees[i].salary = (int) (employees[i].salary * temp);
            }
        }
    }

    // поиск по номеру отдела

    public static Employee[] findMinSalaryInDepartment(Employee[] employees, String department) {
        int temp = Integer.MAX_VALUE;
        Employee[] tempEmployee = new Employee[employees.length];
        int k = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].department.equals(department) && employees[i].salary <= temp) {
                temp = employees[i].salary;
                tempEmployee[k] = employees[i];
                k = k + 1;
            }
        }
        for (int i = 0; i < tempEmployee.length; i++) {
            if (tempEmployee[i] != null && tempEmployee[i].salary > temp) {
                tempEmployee[i] = null;
            }
        }
        return tempEmployee;

    }

    public static Employee[] findMaxSalaryInDepartment(Employee[] employees, String department) {
        int temp = Integer.MIN_VALUE;
        Employee[] tempEmployee = new Employee[employees.length];
        int k = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].department.equals(department) && employees[i].salary >= temp) {
                temp = employees[i].salary;
                tempEmployee[k] = employees[i];
                k = k + 1;
            }
        }
        for (int i = 0; i < tempEmployee.length; i++) {
            if (tempEmployee[i] != null && tempEmployee[i].salary < temp) {
                tempEmployee[i] = null;
            }
        }
        return tempEmployee;

    }


    public static int sumInDepartment(Employee[] employees, String department) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].department.equals(department)) {
                sum = sum + employees[i].salary;
            }

        }
        return sum;

    }

    public static int mediumInDepartment(Employee[] employees, String department) {
        int j = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].department.equals(department)) {
                j = j + 1;
            }
        }
        int medium = sumInDepartment(employees, department) / j;
        return medium;

    }

    public static void indexSalaryInDepartment(Employee[] employees, int arg, String department) {
        float temp;
        temp = (float) (1 + arg / 100f);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].department.equals(department)) {
                employees[i].salary = (int) (employees[i].salary * temp);
            }
        }
    }

    public static void printDepartment(Employee[] employees, String department) {
        System.out.println("Сотрудники отдела " + department + ":");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].department.equals(department)) {
                System.out.println(employees[i].getFullName() + ", зарплата - " + employees[i].getSalary());
            }

        }
    }


    // поиск по зарплате

    public static void findEmployeeWithHigherSalary(Employee[] employees, int salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].salary >= salary) {
                System.out.println(employees[i].getFullName() + ", зарплата - " + employees[i].getSalary() + " ID сотрудника: " + employees[i].getId());
            }
        }
    }

    public static void findEmployeeWithLowerSalary(Employee[] employees, int salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].salary <= salary) {
                System.out.println(employees[i].getFullName() + ", зарплата - " + employees[i].getSalary() + " ID сотрудника: " + employees[i].ID);
            }
        }
    }

}
