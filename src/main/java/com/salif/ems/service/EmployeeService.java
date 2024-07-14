package com.salif.ems.service;

import com.salif.ems.dto.EmployeeDto;
import com.salif.ems.entity.Employee;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeByid(Long employeeId);
    List<EmployeeDto> getAllEmployees();
}
