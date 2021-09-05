package com.technoelevate.Employee.Controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.technoelevate.Employee.DTO.EmployeeInformation;
import com.technoelevate.Employee.service.EmployeeService;

@Controller
@ComponentScan({"com.technoelevate.Employee.service","com.technoelevate.Employee.DAO"})
public class EmployeeController {

	@Autowired
	EmployeeService serv;
	
	@GetMapping("/login")
	public String getLogin(ModelMap  map)
	{
		return "login";
	}
	@PostMapping("/getDetails")
	public String getDetails(ModelMap map,EmployeeInformation ref) throws SQLException, ClassNotFoundException {
		if(ref!=null) {
			serv.validateInsert(ref);
			map.addAttribute("addEmp", ref);
			map.addAttribute("msg","Data Successfully Stored");
		}
		else
		{
			map.addAttribute("msg","Data not Stored");
		}
	return "display";
	}
	
	
}
