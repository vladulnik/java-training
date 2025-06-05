package examples;

public class Employee {
    String name;
    String role;
    double salary;

    Employee(String name, String role, double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    void showInfo() {
        System.out.println("Имя: " + name + "\nРоль: " + role + "\nЗарплата: " + salary);
    }
}
