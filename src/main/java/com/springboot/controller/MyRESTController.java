package com.springboot.controller;


import com.springboot.entity.Employee;
import com.springboot.sevice.EmployeeService;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {
    @PersistenceContext
    private EmployeeService employeeService;
    @GetMapping("/employees")
    public List<Employee> showAllEmployees(){
        List<Employee> allEmployees=employeeService.getAllEmployees();
        return allEmployees;
    }
//    @GetMapping("/emplyees/{id}")
//    public Employee getEmployee(@PathVariable int id){
//        Employee employee = employeeService.getEmployee(id);

//        return employee;
//
//    }
//@PostMapping("/employees")
//    public Employee addNewEmployee(@RequestBody Employee employee){
//        employeeService.saveEmployee(employee);
//        return employee;
//}
//@PutMapping("/employees")
//    public Employee updateEmployee(@RequestBody Employee employee){
//        employeeService.saveEmployee(employee);
//        return employee;
//}
//@DeleteMapping("/employees/{id}")
//    public String deleteEmployee(@PathVariable int id){
//        Employee employee = employeeService.getEmployee(id);

//        employeeService.deleteEmployee(id);
//        return "Employee with ID= "+id+" was deleted";
//}

}
