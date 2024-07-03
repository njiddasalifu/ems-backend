package com.salif.ems.repository;

import com.salif.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //this is all about the repository as it's extends all the CRUD ops from the
    //JpaRepository
}
