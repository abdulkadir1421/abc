package com.fist.project.first_project.service;

import com.fist.project.first_project.entity.Employee;
import com.fist.project.first_project.dao.EmployeeDao_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired //Template Class
    EmployeeDao_ employeeRepo;

    public void saveEmployee(Employee employee) {
            employeeRepo.save(employee);
    }
    public List<Employee> getUsers() {
        return employeeRepo.findAll();
    }
    public void deleteUser(Long id) {
        employeeRepo.deleteById(id);
    }
    public Employee getUser(Long id) {
        return employeeRepo.findById(id).orElse(new Employee());
    }
}
