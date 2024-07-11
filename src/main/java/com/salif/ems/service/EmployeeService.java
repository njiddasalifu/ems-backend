package com.salif.ems.service;

import com.salif.ems.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeByid(Long employeeId);
}
