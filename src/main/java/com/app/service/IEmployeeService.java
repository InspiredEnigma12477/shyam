package com.app.service;

import java.time.LocalDate;
import java.util.List;
import com.app.pojos.*;

public interface IEmployeeService {
	List<Employee> getAllEmpDetails();
    Employee addEmpDetials(Employee transientEmp);
    String deleteEmpDetails(Long empId);
    Employee fetchEmpDetails(Long empId);
    Employee updateEmpDetails(Employee detachedEmp);
    Employee authenticateEmp(String email, String password);
    List<Employee> getEmpsByDateAndDept(LocalDate joinDate, String dept);
    List<Employee> getEmpBySalary(Double minSal, Double maxSal);
}
