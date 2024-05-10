/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee_attendance_system;

/**
 *
 * @author Neil Patrick
 */
public class Employee {

    int id;
    String last_name;
    String first_name;
    String email;
    String phone_number;
    String address;
    String username;
    String password;
    boolean is_admin;
    String hiring_date;
    int department_id;
    String position;
    Department department;

    public Employee(int id, String last_name, String first_name, String email, String phone_number, String address, String username, String password, boolean is_admin, String hiring_date, int department_id, String position) {
        this.id = id;
        this.last_name = last_name;
        this.first_name = first_name;
        this.email = email;
        this.phone_number = phone_number;
        this.address = address;
        this.username = username;
        this.password = password;
        this.is_admin = is_admin;
        this.hiring_date = hiring_date;
        this.department_id = department_id;
        this.position = position;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
