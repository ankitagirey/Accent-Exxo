package com.scott.betaexam.entity;

import com.scott.betaexam.repository.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, String> {

}
