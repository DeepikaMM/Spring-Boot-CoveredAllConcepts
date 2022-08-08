//package com.dailycodebuffer.springboot.tutorial.service;
//
//import com.dailycodebuffer.springboot.tutorial.entity.Department;
//import com.dailycodebuffer.springboot.tutorial.repository.DepartmentRepository;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//class DepartmentServiceTest {
//
//    @Autowired
//    private DepartmentService departmentService;
//
//    @MockBean
//    private DepartmentRepository departmentRepository;
//
//    @BeforeEach
//    void setUp() {
//        Department department = Department.builder()
//                .departmentAddress("Bangalore")
//                .departmentId(1L)
//                .departmentCode("EC")
//                .departmentName("IT").build();
//
//        Mockito.when(departmentRepository.findByDepartmentName("IT"))
//                .thenReturn(department);
//    }
//
//    //negative scenarios should also be covered
//
//    @Test
//    @Disabled
//    @DisplayName("Get Data based on valid Department Name")
//    public void whenValidDepartmentName_thenDepartmentShouldFound(){
//
//        String departmentName = "IT";
//        Department found = departmentService.fetchDepartmentByName(departmentName);
//
//        assertEquals(departmentName,found.getDepartmentName());
//
//    }
//}