package com.meghana.Springbootday3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meghana.Springbootday3.model.*;
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
