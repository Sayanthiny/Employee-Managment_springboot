package com.employee.operation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.operation.entity.Employee;
import com.employee.operation.entity.ViewLeave;
import com.employee.operation.repository.ViewLeaveRepository;

@Service
public class ViewLeaveServiceImplementation implements ViewLeaveService{
	@Autowired
	ViewLeaveRepository viewLeaveRepository;

	@Override
	public List<ViewLeave> getLeaveDetails() {
		// TODO Auto-generated method stub
		return viewLeaveRepository.findAll();
	}

	@Override
	public ViewLeave getSpecifyLeaveDetails(int id) {
		// TODO Auto-generated method stub
		return viewLeaveRepository.findById(id).orElse(null);
	}

	@Override
	public ViewLeave updateData(ViewLeave viewLeave) {
		// TODO Auto-generated method stub
		return viewLeaveRepository.save(viewLeave);
	}

	
}
