package com.springexample.Springboot.tutorial.repository;

import com.springexample.Springboot.tutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    public Department findByDepartmentName(String departmentName);

    public Department findByDepartmentNameIgnoreCase(String departmentName);


    // To pass SQL Query to search
//    @Query(value = "SELECT department from departmentTable", nativeQuery = true)
//    public Department findByDepartmentNameCustomSearch(String departmentName);
}
