package com.dailycodebuffer.springboot.tutorial.service;

import com.dailycodebuffer.springboot.tutorial.entity.Department;
import com.dailycodebuffer.springboot.tutorial.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {

    public Department saveDepartment(Department dept);

    List<Department> fetchDepartmentList();

    Department fetchDepartmentById(Long id) throws DepartmentNotFoundException;

    void deleteDepartmentById(Long id);

    Department updateDepartment(Long id, Department department);

    Department fetchDepartmentByName(String deptName);
}
