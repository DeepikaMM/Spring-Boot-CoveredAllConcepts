package com.dailycodebuffer.springboot.tutorial.controller;


import com.dailycodebuffer.springboot.tutorial.entity.Department;
import com.dailycodebuffer.springboot.tutorial.error.DepartmentNotFoundException;
import com.dailycodebuffer.springboot.tutorial.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {


    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department dept){
        LOGGER.info("inside post");
        return departmentService.saveDepartment(dept);

    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){

        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/department/{DeptId}")
    public Department fetchDepartmentById(@PathVariable("DeptId") Long Id) throws DepartmentNotFoundException {
        return departmentService.fetchDepartmentById(Id);
    }

    @DeleteMapping("department/{DeptId}")
    public String deleteDepartment(@PathVariable("DeptId") Long Id){
        departmentService.deleteDepartmentById(Id);
        return "Depart deleted sussess";
    }

    @PutMapping("department/{DeptId}")
    public Department updateDepartment(@PathVariable("DeptId") Long Id,
                                       @RequestBody Department department){

        return departmentService.updateDepartment(Id,department);

    }
    @GetMapping("department/name/{dn}")
    public Department fetchDepartmentByName(@PathVariable("dn") String deptName){
        return departmentService.fetchDepartmentByName(deptName);
    }

}
