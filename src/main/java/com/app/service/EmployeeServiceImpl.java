package com.app.service;

import com.app.CustomException.ResourceNotFoundException;
import com.app.pojos.Employee;
import com.app.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;


@Service
@Transactional
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmpRepository empRepo;

    @Override
    public List<Employee> getAllEmpDetails() {
        return empRepo.findAll();
    }

    @Override
    public Employee addEmpDetials(Employee transientEmp) {
        return empRepo.save(transientEmp);
    }

    @Override
    public String deleteEmpDetails(Long empId) {
        if (empRepo.existsById(empId)) {
            empRepo.deleteById(empId);
            return "Emp Deleted Sucessfully";
        }
        return "Deletion Failed : Invalid Emp Id";
    }

    @Override
    public Employee fetchEmpDetails(Long empId) {
        return empRepo.findById(empId).orElseThrow(() -> new ResourceNotFoundException("InValid Emp Id : Fetching Failed"));
    }

    @Override
    public Employee updateEmpDetails(Employee detachedEmp) {
        if (empRepo.existsById(detachedEmp.getId())){
            return empRepo.save(detachedEmp);
        }throw new ResourceNotFoundException("Invalid Emp Id : Updation Failed");
    }

    @Override
    public Employee authenticateEmp(String email, String password) {
        return null;
    }

    @Override
    public List<Employee> getEmpsByDateAndDept(LocalDate joinDate, String dept) {
        return null;
    }

    @Override
    public List<Employee> getEmpBySalary(Double minSal, Double maxSal) {
        return null;
    }

}
