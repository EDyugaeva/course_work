package ru.skypro;

public class EmployeeBook {
    private final Employee employeeBook[];

    public EmployeeBook(int size) {
        employeeBook = new Employee[size];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Сотрудники: ");
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null) {
                sb.append(i + ". " + employeeBook[i]);
                sb.append(System.lineSeparator());
            }
        }
        return sb.toString();

    }

    //basic

    public void listOfEmployees() {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null) System.out.println(employeeBook[i]);

        }
    }

    public int sum() {
        int sum = 0;
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null) {
                sum = sum + employeeBook[i].salary;
            }
        }
        return sum;
    }

    public Employee[] employeeMinSalary() {
        int temp = Integer.MAX_VALUE;
        Employee[] tempEmployee = new Employee[employeeBook.length];
        int k = 0;
        for (int i = 0; i < tempEmployee.length; i++) {
            if (employeeBook[i] != null && employeeBook[i].salary <= temp) {
                temp = employeeBook[i].salary;
                tempEmployee[k] = employeeBook[i];
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

    public Employee[] employeeMaxSalary() {
        int temp = Integer.MIN_VALUE;
        Employee[] tempEmployee = new Employee[employeeBook.length];
        int k = 0;
        for (int i = 0; i < tempEmployee.length; i++) {
            if (employeeBook[i] != null && employeeBook[i].salary >= temp) {
                temp = employeeBook[i].salary;
                tempEmployee[k] = employeeBook[i];
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

    public int mediumSalary() {
        int medium = sum() / countElements();
        return medium;
    }

    public void printNames() {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null) {
                System.out.println(employeeBook[i].getFullName());
            }
        }
    }


    // medium

    public void indexSalary(int arg) {
        float temp = (float) (1 + arg / 100f);
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null) {
                employeeBook[i].salary = (int) (employeeBook[i].salary * temp);
            }
        }
    }
// Поиски по отделу

    public Employee[] findEmployeeWithMinSalaryInDepartment(String department) {
        int temp = Integer.MAX_VALUE;
        Employee[] tempEmployee = new Employee[employeeBook.length];
        int k = 0;
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null && employeeBook[i].department.equals(department) && employeeBook[i].salary <= temp) {
                temp = employeeBook[i].salary;
                tempEmployee[k] = employeeBook[i];
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

    public Employee[] findEmployeeWithMaxSalaryInDepartment(String department) {
        int temp = Integer.MIN_VALUE;
        Employee[] tempEmployee = new Employee[employeeBook.length];
        int k = 0;
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null && employeeBook[i].department.equals(department) && employeeBook[i].salary >= temp) {
                temp = employeeBook[i].salary;
                tempEmployee[k] = employeeBook[i];
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

    public int sumInDepartment(String department) {
        int sum = 0;
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null && employeeBook[i].department.equals(department)) {
                sum = sum + employeeBook[i].salary;
            }
        }
        return sum;
    }

    public int mediumInDepartment(String department) {
        int j = 0;
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null && employeeBook[i].department.equals(department)) {
                j = j + 1;
            }
        }
        int medium = sumInDepartment(department) / j;
        return medium;

    }

    public void indexSalaryInDepartment(int arg, String department) {
        float temp;
        temp = (float) (1 + arg / 100f);
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null && employeeBook[i].department.equals(department)) {
                employeeBook[i].setSalary((int) (employeeBook[i].salary * temp));
            }
        }
    }

    public void printDepartment(String department) {
        System.out.println("Сотрудники отдела " + department + ":");
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null && employeeBook[i].department.equals(department)) {
                System.out.println(employeeBook[i].getFullName() + ", зарплата - " + employeeBook[i].getSalary());
            }

        }
    }

    // поиск по зарплате

    public void findEmployeeWithHigherSalary(int salary) {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null && employeeBook[i].salary >= salary) {
                System.out.println(employeeBook[i].getFullName() + ", зарплата - " + employeeBook[i].getSalary() + " ID сотрудника: " + employeeBook[i].getId());
            }
        }
    }

    public void findEmployeeWithLowerSalary(int salary) {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null && employeeBook[i].salary <= salary) {
                System.out.println(employeeBook[i].getFullName() + ", зарплата - " + employeeBook[i].getSalary());
            }
        }
    }

    public boolean addEmployee(Employee newEmployee) {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] == null) {
                employeeBook[i] = newEmployee;
                return true;
            } else {
            }
        }
        return false;
    }

    public boolean deleteEmployee(String firstName, String lastName, String middleName) {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i].firstName.equals(firstName)
                    && employeeBook[i].lastName.equals(lastName)
                    && employeeBook[i].middleName.equals(middleName)) {
                employeeBook[i] = null;
                return true;
            } else {
            }
        }
        return false;
    }

    public boolean changeEmployee(String firstName, String lastName, String middleName, String department) {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i].firstName.equals(firstName)
                    && employeeBook[i].lastName.equals(lastName)
                    && employeeBook[i].middleName.equals(middleName)) {
                employeeBook[i].setDepartment(department);
                return true;
            } else {
            }
        }
        return false;

    }

    public boolean changeEmployee(String firstName, String lastName, String middleName, int salary) {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i].firstName.equals(firstName)
                    && employeeBook[i].lastName.equals(lastName)
                    && employeeBook[i].middleName.equals(middleName)) {
                employeeBook[i].setSalary(salary);
                return true;
            } else {
            }
        }
        return false;
    }
    public void listOfEmployeesInDepartments() {
        int countOfDepartments = 5;
        for (int j = 0; j < countOfDepartments; j++) {
            System.out.println("Отдел " + findDepartments()[j] + " :");
            for (int i = 0; i < employeeBook.length; i++) {
                if (employeeBook[i] != null && employeeBook[i].department.equals(findDepartments()[j])) {
                    System.out.println(employeeBook[i].toString());
                }
            }

        }
    }

    // other


    private int countElements() {
        int j = 0;
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null) {
                j++;
            }
        }
        return j;
    }




    private String[] findDepartments() {
        int countOfDepartments = 5;
        String[] departments = new String[countOfDepartments];
        departments[0] = employeeBook[0].department;
        for (int i = 0; i < employeeBook.length; i++) {
            if (departments[0] != employeeBook[i].department) {
                departments[1] = employeeBook[i].department;
                break;
            }
        }
        for (int i = 0; i < employeeBook.length; i++) {
            if (departments[0] != employeeBook[i].department && departments[1] != employeeBook[i].department) {
                departments[2] = employeeBook[i].department;
                break;
            }
        }
        for (int i = 0; i < employeeBook.length; i++) {
            if (departments[0] != employeeBook[i].department
                    && departments[1] != employeeBook[i].department
                    && departments[2] != employeeBook[i].department) {
                departments[3] = employeeBook[i].department;
                break;
            }
        }

        for (int i = 0; i < employeeBook.length; i++) {
            if (departments[0] != employeeBook[i].department
                    && departments[1] != employeeBook[i].department
                    && departments[2] != employeeBook[i].department
                    && departments[3] != employeeBook[i].department) {
                departments[4] = employeeBook[i].department;
                break;
            }
        }
        return departments;
    }


}

