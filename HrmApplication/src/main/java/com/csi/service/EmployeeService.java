package com.csi.service;


import com.csi.dao.EmployeeDao;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDao employeeDaoimpl;

    public Employee saveData(Employee employee){

        return  employeeDaoimpl.saveData(employee);
    }
    public List<Employee> getAllData(){

        return employeeDaoimpl.getAllData();
    }

    public Optional<Employee> getDataBYId(int empId){
        return employeeDaoimpl.getDataBYId(empId);
    }

    public void deleteData(int empId){

        employeeDaoimpl.deleteData(empId);
    }
}
