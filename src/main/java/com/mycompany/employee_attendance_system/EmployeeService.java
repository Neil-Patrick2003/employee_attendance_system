/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee_attendance_system;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Neil Patrick
 */
public class EmployeeService {

    private static final String EMPLOYEES_TABLE = "employees";
    private static final String EMPLOYEE_ID_COLUMN = "employee_id";

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
    private static final String POSITION_COLUMN = "position";

    public static Employee getByUsernameAndPassword(String username, String password) {
        String selectQuery = "SELECT * FROM " + EMPLOYEES_TABLE + " WHERE " + USERNAME_COLUMN + " = '" + username + "' AND " + PASSWORD_COLUMN + " = '" + password + "' LIMIT 1;";

        System.out.println(selectQuery);
        Connection conn = AccessDatabaseConnector.connect();
        try {
            Statement statement = conn.createStatement();

            ResultSet resultSet = statement.executeQuery(selectQuery);

            Employee employee = null;

            // Process the results
            while (resultSet.next()) {
                // Retrieve data from the result set
                int id = resultSet.getInt(EMPLOYEE_ID_COLUMN);

                String last_name = resultSet.getString(LAST_NAME_COLUMN);
                String first_name = resultSet.getString(FIRST_NAME_COLUMN);
                String email = resultSet.getString(EMAIL_COLUMN);
                String phone_number = resultSet.getString(PHONE_NUMBER_COLUMN);
                String address = resultSet.getString(ADDRESS_COLUMN);
                boolean is_admin = resultSet.getBoolean(IS_ADMIN_COLUMN);
                String hiring_date = resultSet.getString(HIRING_DATE_COLUMN);
                int department_id = resultSet.getInt(DEPARTMENT_ID_COLUMN);
                String position = resultSet.getString(POSITION_COLUMN);

                employee = new Employee(id, last_name, first_name, email, phone_number, address, username, password, is_admin, hiring_date, department_id, position);
            }

            // Close the result set and statement
            resultSet.close();
            statement.close();

            return employee;
        } catch (SQLException e) {
            System.out.println("ERROR HERE");
            System.out.print(e);
        } finally {
            AccessDatabaseConnector.closeConnection(conn);
        }

        return null;
    }

    public static void addEmployee(String last_name, String first_name, String email, String phone_number, String address, String username, String password, boolean is_admin, int departmenta_id, String position) {
        Connection conn = AccessDatabaseConnector.connect();
        try {

            // Execute an INSERT query
            try (Statement statement = conn.createStatement()) {
                // Execute an INSERT query

                String insertQuery = "INSERT INTO " + EMPLOYEES_TABLE + " (" + LAST_NAME_COLUMN + ", " + FIRST_NAME_COLUMN + ", " + EMAIL_COLUMN + ", " + PHONE_NUMBER_COLUMN + ", " + ADDRESS_COLUMN + ", " + USERNAME_COLUMN + ", " + PASSWORD_COLUMN + ", " + IS_ADMIN_COLUMN + ", " + DEPARTMENT_ID_COLUMN + ", " + password + " ) VALUES ('" + last_name + "', '" + first_name + "', '" + email + "', '" + phone_number + "', '" + address + "', '" + username + "', '" + password + "', " + is_admin + ", '" + departmenta_id + "', '" + position + "');";
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

    public static List getAllEmployee() {
        List<Employee> EmployeeList = new ArrayList<>();

        Connection conn = AccessDatabaseConnector.connect();
        try {
            Statement statement = conn.createStatement();

            // Execute a SELECT query
            String selectQuery = "SELECT * FROM " + EMPLOYEES_TABLE;
            ResultSet resultSet = statement.executeQuery(selectQuery);

            // Process the results
            while (resultSet.next()) {
                // Retrieve data from the result set
                int employee_id = resultSet.getInt(EMPLOYEE_ID_COLUMN);

                String last_name = resultSet.getString(LAST_NAME_COLUMN);
                String first_name = resultSet.getString(FIRST_NAME_COLUMN);
                String email = resultSet.getString(EMAIL_COLUMN);
                String phone_number = resultSet.getString(PHONE_NUMBER_COLUMN);
                String address = resultSet.getString(ADDRESS_COLUMN);
                String username = resultSet.getString(USERNAME_COLUMN);
                String password = resultSet.getString(PASSWORD_COLUMN);
                Boolean is_admin = resultSet.getBoolean(IS_ADMIN_COLUMN);
                String hiring_date = resultSet.getString(HIRING_DATE_COLUMN);
                int department_id = resultSet.getInt(DEPARTMENT_ID_COLUMN);
                String position = resultSet.getString(POSITION_COLUMN);

                Employee employee = new Employee(employee_id, last_name, first_name, email, phone_number, address, username, password, is_admin, hiring_date, department_id, position);

                EmployeeList.add(employee);

            }

            // Close the result set and statement
            resultSet.close();
            statement.close();

            return EmployeeList;
        } catch (SQLException e) {
            System.out.print(e);
        } finally {
            AccessDatabaseConnector.closeConnection(conn);
        }

        return null;
    }

}
