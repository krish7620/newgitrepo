package com.csi.controller;


import com.csi.model.Employee;
import com.csi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    EmployeeService employeeServiceimpl;
    @PostMapping("/savedata")
    public Employee saveData(@RequestBody Employee employee){
        return  employeeServiceimpl.saveData(employee);
    }

    @GetMapping("/getalldata")
    public List<Employee> getAllData(){
        return employeeServiceimpl.getAllData();
    }
    @GetMapping("/getbyid/{empId}")
    public Optional<Employee> getDataBYId(@PathVariable int empId){
        return employeeServiceimpl.getDataBYId(empId);
}
     @DeleteMapping("/deletebyid/{empId}")
    public String deleteData(@PathVariable int empId){

        employeeServiceimpl.deleteData(empId);
        return "Data Deleted";
    }


}
