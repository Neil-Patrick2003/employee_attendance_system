/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.employee_attendance_system;

import java.util.List;

/**
 *
 * @author Neil Patrick
 */
public class Employee_attendance_system {

    public static void main(String[] args) {

        // Add department
        // DepartmentService.addDepartment("IT");
        // DepartmentService.addDepartment("HR");
        // DepartmentService.addDepartment("Admin");
        System.out.println("List departments");
        List<Department> departments = DepartmentService.getAllDepartments();
        for (int i = 0; i < departments.size(); i++) {
            Department department = departments.get(i);

            DepartmentService.updateDepartment(department.department_id, department.department_name + " updated");
        }

        departments = DepartmentService.getAllDepartments();
        for (int i = 0; i < departments.size(); i++) {
            Department department = departments.get(i);

            System.out.println(department.department_id + "." + department.department_name);
        }

//        JFrame frame = new JFrame("Film Equipment Rental Service");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // EmployeeService.addEmployee("mulingbayan", "neil", "neil@gmail.com", "09215046150", "magahis", "neil123456", "neil123456", true, 1, 1000.00, "hr");
//        MainFrame LoginFrame = new MainFrame();
//        LoginFrame.setVisible(true);
//        LoginFrame.pack();
//        LoginFrame.setVisible(true);
//        LoginFrame.setLocationRelativeTo(null);
    }
}
