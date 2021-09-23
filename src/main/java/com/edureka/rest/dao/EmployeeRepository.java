package com.edureka.rest.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edureka.rest.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository <Employee, Long> 
{
	 
}
