/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.employee_attendance_system;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author Neil Patrick
 */
public class Employee_attendance_system {

    public static void main(String[] args) {
        
        Date startDate = Date.valueOf(LocalDate.MAX);
        Date endDate = Date.valueOf(LocalDate.MAX);
        
       // LeaveRequestService.addLeaveReq(startDate, endDate, "Pending", "emergency", 1, d);
        
        
        
        
//        Timestamp timeIn = new Timestamp(System.currentTimeMillis());
//        System.out.println("Current Timestamp: " + timeIn);
//        
//        Timestamp timeOut = new Timestamp(System.currentTimeMillis());
//        System.out.println("Current Timestamp: " + timeOut);
//        
//        LocalDate currentDate = LocalDate.now();
//        System.out.println("Current Date: " + currentDate);
//        
//        AttendanceRecordService.addAttendanceRecord(currentDate, timeIn, timeOut, 0, "Present");
        
//        JFrame frame = new JFrame("Film Equipment Rental Service");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // EmployeeService.addEmployee("mulingbayan", "neil", "neil@gmail.com", "09215046150", "magahis", "neil123456", "neil123456", true, 1, 1000.00, "hr");
        MainFrame LoginFrame = new MainFrame();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setVisible(true);
        LoginFrame.setLocationRelativeTo(null);
        
        

    }
}
