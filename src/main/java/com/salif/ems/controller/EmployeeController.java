package com.salif.ems.controller;

import com.salif.ems.dto.EmployeeDto;
import com.salif.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
@AllArgsConstructor
public class EmployeeController {
    private EmployeeService employeeService;

    //building the add employee api
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto saveEmployee = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(saveEmployee, HttpStatus.CREATED);
    }
    //building the get emp rest api
    @GetMapping("/{id}")
    public  ResponseEntity<EmployeeDto> getEmployeeByid(@PathVariable("id")  Long employeeId){
        EmployeeDto employeeDto = employeeService.getEmployeeByid(employeeId);
        return ResponseEntity.ok(employeeDto);
    }

}
