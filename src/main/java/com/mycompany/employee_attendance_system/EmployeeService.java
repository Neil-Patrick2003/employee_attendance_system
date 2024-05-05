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
public class EmployeeService {
    
    private static final String EMPLOYEES_TABLE = "employees";   
    private static final String EMPLOYEE_ID_COLUMN = "id";
    
    private static final String FIRST_NAME_COLUMN = "first_name";
    private static final String LAST_NAME_COLUMN = "last_name";
    private static final String EMAIL_COLUMN = "email";
    private static final String PHONE_NUMBER_COLUMN = "phone_number";
    private static final String ADDRESS_COLUMN = "address";
    private static final String USERNAME_COLUMN = "username";
    private static final String PASSWORD_COLUMN = "password";
    private static final String IS_ADMIN_COLUMN = "is_admin";
    private static final String HIRING_DATE_COLUMN = "hiring_date";
    private static final String DEPARTMENT_ID_COLUMN = "department_id";
    private static final String OVERTIME_RATE_COLUMN = "overtime_rate";
    private static final String POSItioPN_COLUMN = "position";
    
    public static void addEmployee(String last_name, String first_name, String email, String phone_number,String address, String username, String password, boolean is_admin, int departmenta_id, double overtime_rate, String position ) {
        Connection conn = AccessDatabaseConnector.connect();
        try {
          
            // Execute an INSERT query
            try (Statement statement = conn.createStatement()) {
                // Execute an INSERT query
                
                String insertQuery = "INSERT INTO " + EMPLOYEES_TABLE + " (" + LAST_NAME_COLUMN + ", " + FIRST_NAME_COLUMN + ", " + EMAIL_COLUMN + ", " + PHONE_NUMBER_COLUMN +  ", " + ADDRESS_COLUMN +  ", " + USERNAME_COLUMN + ", " + PASSWORD_COLUMN + ", " + IS_ADMIN_COLUMN +  ", " + DEPARTMENT_ID_COLUMN + ", " + OVERTIME_RATE_COLUMN + ", " + POSItioPN_COLUMN  +" ) VALUES ('" + last_name + "', '" + first_name + "', '" +  email + "', '" + phone_number + "', '" + address + "', '" + username + "', '" + password + "', "+ is_admin + ", '" + departmenta_id + "', " + overtime_rate + ", '" + position + "');";
                System.out.println(insertQuery);
                int rowsAffected = statement.executeUpdate(insertQuery);
                // Check the number of rows affected
                if (rowsAffected > 0) {
                    System.out.println("Insertion successful. Rows affected: " + rowsAffected);
                } else {
                    System.out.println("Insertion failed.");
                }
                // Close the statement
            }
        } catch (SQLException e) {
            System.out.print(e);
        } finally {
            AccessDatabaseConnector.closeConnection(conn);
        }
    }
    
    
}
