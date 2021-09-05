package com.technoelevate.Employee.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.technoelevate.Employee.DAO.EmployeeDatabaseUsingJDBC;
import com.technoelevate.Employee.DTO.EmployeeInformation;

@Component
public class EmployeeService {
	@Autowired
	EmployeeDatabaseUsingJDBC check;
	
	EmployeeInformation info;
	public boolean validateInsert(EmployeeInformation info) throws SQLException, ClassNotFoundException {
		if(info.getEmpid()<=0) {
			return false;
		}
		return check.addEmployee( info );
	}
}
