package com.example.Spring_Framework_and_Multi_Layer_Development.repository;

import com.example.Spring_Framework_and_Multi_Layer_Development.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
