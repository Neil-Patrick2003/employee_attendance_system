/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee_attendance_system;

import static com.mycompany.employee_attendance_system.DepartmentService.DEPARTMENTS_TABLE;
import static com.mycompany.employee_attendance_system.DepartmentService.DEPARTMENT_ID_COLUMN;
import static com.mycompany.employee_attendance_system.DepartmentService.DEPARTMENT_NAME_COLUMN;
import com.mysql.cj.Query;
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
public class LeaveTypeService {

    public static final String LEAVE_TYPES_TABLE = "leave_types";
    public static final String LEAVE_TYPE_ID_COLUMN = "leave_type_id";
    public static final String NAME_COLUMN = "name";
    public static final String LEAVE_LIMIT_COLUMN = "leave_limit";

    public static void addLeaveType(String name, int leave_limit) {
        Connection conn = AccessDatabaseConnector.connect();
        try {

            // Execute an INSERT query
            try (Statement statement = conn.createStatement()) {
                // Execute an INSERT query
                String insertQuery = "INSERT INTO " + LEAVE_TYPES_TABLE + " (" + NAME_COLUMN + "," + LEAVE_LIMIT_COLUMN + ") VALUES ('" + name + "', " + leave_limit + ");";

                int rowsAffected = statement.executeUpdate(insertQuery);
                // Check the number of rows affected
                if (rowsAffected > 0) {
                    System.out.println("Insertion successful. Rows affected: " + rowsAffected);
                } else {
                    System.out.println("Insertion failed.");
                }
                // Close the statement
                System.out.println(insertQuery);
            }
        } catch (SQLException e) {
            System.out.print(e);
        } finally {
            AccessDatabaseConnector.closeConnection(conn);
        }
    }

    public static LeaveType getLeaveTypeByName(String name) {
        String selectQuery = "SELECT * FROM " + LEAVE_TYPES_TABLE + " WHERE " + NAME_COLUMN + " = '" + name + "' LIMIT 1;";
        System.out.println(selectQuery);
        Connection conn = AccessDatabaseConnector.connect();
        try {
            Statement statement = conn.createStatement();

            ResultSet resultSet = statement.executeQuery(selectQuery);

            LeaveType leaveType = null;

            // Process the results
            while (resultSet.next()) {
                int leave_type_id = resultSet.getInt(LEAVE_TYPE_ID_COLUMN);
                leaveType = new LeaveType(leave_type_id, name, leave_type_id);
            }

            // Close the result set and statement
            resultSet.close();
            statement.close();

            return leaveType;
        } catch (SQLException e) {
            System.out.print(e);
        } finally {
            AccessDatabaseConnector.closeConnection(conn);
        }

        return null;
    }

    public static List getAllLeaveTypes() {
        List<LeaveType> leaveTypes = new ArrayList<>();

        Connection conn = AccessDatabaseConnector.connect();
        try {
            Statement statement = conn.createStatement();

            // Execute a SELECT query
            String selectQuery = "SELECT * FROM " + LEAVE_TYPES_TABLE;
            ResultSet resultSet = statement.executeQuery(selectQuery);

            // Process the results
            while (resultSet.next()) {
                // Retrieve data from the result set
                int leave_type_id = resultSet.getInt(LEAVE_TYPE_ID_COLUMN);
                String name = resultSet.getString(NAME_COLUMN);
                LeaveType leaveType = new LeaveType(leave_type_id, name, leave_type_id);
                leaveTypes.add(leaveType);
            }

            // Close the result set and statement
            resultSet.close();
            statement.close();

            return leaveTypes;
        } catch (SQLException e) {
            System.out.print(e);
        } finally {
            AccessDatabaseConnector.closeConnection(conn);
        }

        return null;
    }

}
