/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee_attendance_system;

import java.util.Date;

/**
 *
 * @author Neil Patrick
 */
public class LeaveRequest {

    int request_id;
    Date startDate;
    Date endDate;
    String status;
    String notes;
    int leave_type_id;
    int employee_id;
    Employee employee;
    LeaveType leaveType;

    public LeaveRequest(int request_id, Date startDate, Date endDate, String notes, String status, int leave_type_id, int employee_id) {
        this.request_id = request_id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.notes = notes;
        this.leave_type_id = leave_type_id;
        this.employee_id = employee_id;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setLeaveType(LeaveType leaveType) {
        this.leaveType = leaveType;
    }

}
