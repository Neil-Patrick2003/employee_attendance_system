/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee_attendance_system;

import java.sql.Date;

/**
 *
 * @author Neil Patrick
 */
public class LeaveRequest {
    int request_id;
    Date startDate;
    Date EndDate;
    String status;
    String notes;
    int leave_type_id;
    int employee_id;
    Employee employee;
    
    public LeaveRequest(int request_id, Date startDate, Date endDate, String notes, String name, int leave_type_id, int employee_id){
        this.request_id = request_id;
        this.startDate = startDate;
        this.EndDate = endDate;
        this.status = this.status;
        this.notes = notes;
        this.leave_type_id = leave_type_id;
        this.employee_id = employee_id;
    }
    
    public void setCustomer(Employee employee) {
        this.employee = employee;
    }
    
    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }
    
    
}
