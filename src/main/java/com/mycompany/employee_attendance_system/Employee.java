/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee_attendance_system;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

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
    double overtime_rate;
    String position;
    
    public Employee(int id, String last_name, String first_name, String email, String phone_number, String address, String username, String password, boolean is_admin, int department_id, double overtime_rate, String postion){
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
        this.overtime_rate = overtime_rate;
        this.position = position;
        
        
                
    }
    
    
}
