package com.employee.operation.services;

import java.util.List;

import com.employee.operation.entity.ApplyLeave;

public interface ApplyLeaveService  {
	public void applyForLeave(ApplyLeave applyLeave);
	
	public ApplyLeave getLeaveApplyById(int id);
}
