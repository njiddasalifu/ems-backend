package com.salif.ems.service.impl;

import com.salif.ems.dto.EmployeeDto;
import com.salif.ems.entity.Employee;
import com.salif.ems.mapper.EmployeeMapper;
import com.salif.ems.repository.EmployeeRepository;
import com.salif.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
