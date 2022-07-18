package com.csi.dao;


import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeeDao {

    @Autowired
    EmployeeRepo employeeRepoimpl;

    public Employee saveData(Employee employee){

        return  employeeRepoimpl.save(employee);
    }
    public List<Employee> getAllData(){

        return employeeRepoimpl.findAll();
    }

    public Optional<Employee> getDataBYId(int empId){
       return employeeRepoimpl.findById(empId);
    }

    public void deleteData(int empId){

        employeeRepoimpl.deleteById(empId);
    }
}
