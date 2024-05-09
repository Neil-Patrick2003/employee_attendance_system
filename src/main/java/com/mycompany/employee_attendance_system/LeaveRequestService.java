/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee_attendance_system;

import static com.mycompany.employee_attendance_system.DepartmentService.DEPARTMENTS_TABLE;
import static com.mycompany.employee_attendance_system.DepartmentService.DEPARTMENT_NAME_COLUMN;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Neil Patrick
 */
public class LeaveRequestService {
    public static final String LEAVE_REQUESTS_TABLE = "leave_requests";
    public static final String REQUEST_ID_COLUMN = "request_id";
    public static final String START_DATE_COLUMN = "start_date";
    public static final String END_DATE_COLUMN = "end_date";
    public static final String STATUS_COLUMN = "status";  
    public static final String NOTES_COLUMN = "notes";
    public static final String LEAVE_TYPE_ID_COLUMN = "leave_type_id";
    public static final String EMPLOYEE_ID_COLUMN = "employee_id";
    
    public static void addLeaveReq(Date startDate, Date endDate, String status, String notes,  int leave_type_id, int employee_id) {
        Connection conn = AccessDatabaseConnector.connect();
        try {

            // Execute an INSERT query
            try (Statement statement = conn.createStatement()) {
                // Execute an INSERT query

                String insertQuery = "INSERT INTO " + LEAVE_REQUESTS_TABLE + " (" + START_DATE_COLUMN + ", " + END_DATE_COLUMN + ", " + STATUS_COLUMN + ", " + NOTES_COLUMN + ", " + LEAVE_TYPE_ID_COLUMN + ", " + EMPLOYEE_ID_COLUMN + " ) VALUES ('" + startDate + "', '" + endDate + "', '" + status + "', '" + notes + "', '" + leave_type_id + "', '" + employee_id + "');";
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