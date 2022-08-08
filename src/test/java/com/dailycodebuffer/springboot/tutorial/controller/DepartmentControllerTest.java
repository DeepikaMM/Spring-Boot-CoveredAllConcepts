//package com.dailycodebuffer.springboot.tutorial.controller;
//
//import com.dailycodebuffer.springboot.tutorial.entity.Department;
//import com.dailycodebuffer.springboot.tutorial.service.DepartmentService;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//@WebMvcTest(DepartmentController.class)
//class DepartmentControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//    @Autowired
//    private DepartmentService departmentService;
//
//    private Department department;
//    @BeforeEach
//    void setUp() {
//        department = Department.builder()
//                .departmentId(1L)
//                .departmentName("CS")
//                .build();
//    }
//
//    @Test
//    @Disabled
//    void saveDepartment() throws Exception {
//       Department inputDepartment = Department.builder()
//                .departmentName("CS")
//                .build();
//
//       //It will try to hit the URL
//        Mockito.when(departmentService.saveDepartment(inputDepartment))
//                .thenReturn(department);
//        mockMvc.perform(post("/departments")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(
//                       "{\n" +
//                               "\t\"  departmentName\":\"CS\",\n" +
//                                "}")).andExpect(status().isOk());
//
//    }
//
//    @Test
//    @Disabled
//    void fetchDepartmentById() throws Exception {
//        Mockito.when(departmentService.fetchDepartmentById(1L))
//                .thenReturn(department);
//        mockMvc.perform(post("/department/1L")
//                .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.department").value(department.getDepartmentName()));
//    }
//}