package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.app.pojos.Employee;
import com.app.service.EmployeeServiceImpl;

@RestController
@CrossOrigin("https://localhost:3000")
@RequestMapping("/employees")
public class EmpoyeeController {
	@Autowired
	public EmployeeServiceImpl empService;
	
	public EmpoyeeController() {
		System.out.println("Inside the Controller " + getClass());
	}
	
	@GetMapping
	public List<Employee> getAllEmps(){
        System.out.println("Inside the Get All Employees ..... ");
        return empService.getAllEmpDetails();
    }

	@PostMapping
	public Employee saveEmpDetails(@RequestBody Employee transientEmp) {
		System.out.println("Inside save Emp Details with " + transientEmp.getId());
		return empService.addEmpDetials(transientEmp);
	}

	@DeleteMapping("/{empId}")
	public String deleteEmployee(@RequestParam Long empid){
		return empService.deleteEmpDetails(empid);
	}
	
}
