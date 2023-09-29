package ra.controller;

import ra.entity.Developer;
import ra.entity.Employee;
import ra.entity.SaleEmployee;

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee employee1 = new SaleEmployee(1, "Hiếu", 'a', "English");
        Employee employee2 = new Developer(2, "Thảo", 25, "Java");
        employee1.chamCong();
        employee1.work();
        doing(employee1);
        employee2.chamCong();
        employee2.work();
        doing(employee2);
        int a = 'a';
        System.out.println(a);
    }

    public static void doing(Employee employee) {
        if (employee instanceof Developer) {
            ((Developer) employee).fixBug();
        } else if (employee instanceof SaleEmployee) {
            ((SaleEmployee) employee).sale();
        }
    }
}
