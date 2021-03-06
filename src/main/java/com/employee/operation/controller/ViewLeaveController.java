package com.employee.operation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.operation.dto.EmployeeDto;
import com.employee.operation.dto.LeaveTypeDto;
import com.employee.operation.dto.ViewLeaveDto;
import com.employee.operation.entity.ApplyLeave;
import com.employee.operation.entity.ViewLeave;
import com.employee.operation.services.ApplyLeaveService;
import com.employee.operation.services.ViewLeaveService;

@RestController
public class ViewLeaveController {
	@Autowired
	ViewLeaveService viewLeaveService;
	@Autowired
	ApplyLeaveService applyLeaveService;
	
	
//	@GetMapping("/getDetails")
//	public ViewLeave getLeaveDetails(int id) {
//		return viewLeaveService.getLeaveDetails(id);
//		
//	}
	
//
	
//	public ResponseEntity<List<ViewLeaveDto>> emp(){
//		List<ViewLeaveDto> dtos=new ArrayList<>();
//		viewLeaveService.getLeaveDetails().forEach(viewLeave->{
//			ViewLeaveDto viewleavedto=new ViewLeaveDto();// view leave dto
//			
//			viewleavedto.setId(viewLeave.getId()); //id	
//			viewleavedto.setRemainingLeaveCount(viewLeave.getRemainingLeaveCount()); // remaining leave count
//			
//			// employee dto
//			EmployeeDto employeeDto=new EmployeeDto();
//			employeeDto.setName(viewLeave.getEmployee().getName());
//			employeeDto.setId(viewLeave.getEmployee().getId()); //employee_id
//			viewleavedto.setEmployee(employeeDto);
//			
//			// leave-type dto
//			LeaveTypeDto leaveTypeDto=new LeaveTypeDto();	// leave_type from leave type table
//			leaveTypeDto.setId(viewLeave.getLeaveType().getId());
//			leaveTypeDto.setType(viewLeave.getLeaveType().getType());
//			viewleavedto.setLeaveType(leaveTypeDto);
//			dtos.add(viewleavedto);
//		});
//		return new ResponseEntity<List<ViewLeaveDto>>(dtos, HttpStatus.OK);
		
	}
	
	

