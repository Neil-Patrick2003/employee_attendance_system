/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee_attendance_system;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author Neil Patrick
 */
public class AttendanceRecord {
    int attendance_record_id;
    Timestamp timeIn;
    Timestamp timeOut;
    int employee_id;
    Date date;
    Employee employee;
    String status;
    
    
    public AttendanceRecord(int attendance_record_id, Date date, Timestamp timeIn, Timestamp timeOut, int employee_id, String status){
        this.attendance_record_id = attendance_record_id;
        this.date = date;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
        this.status = status;
        this.employee_id = employee_id;
        
    }
    
    public void setEmployee(Employee employee){
        this.employee = employee;
    }
    
    public void setTimeIn( Timestamp timeIn){
        this.timeIn = timeIn;
    }
    
    public void  setTimeOut(Timestamp timeOut){
        this.timeOut = timeOut;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
      
}
