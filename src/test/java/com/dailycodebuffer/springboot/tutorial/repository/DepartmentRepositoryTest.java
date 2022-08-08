//package com.dailycodebuffer.springboot.tutorial.repository;
//
//import com.dailycodebuffer.springboot.tutorial.entity.Department;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//
//@DataJpaTest
//class DepartmentRepositoryTest {
//
//
//    @Autowired
//    private DepartmentRepository departmentRepository;
//
//    @Autowired
//    private TestEntityManager testEntityManager;
//
//
//    //here it is saing before easch test and then deletes it
//    @BeforeEach
//    void setUp() {
//        Department department = Department.builder()
//                .departmentName("Mech")
//                .departmentId(1L)
//                .departmentAddress("Delhi")
//                .build();
//        testEntityManager.persist(department);
//    }
//
//    @Test
//    @Disabled
//    public void whenFindById_thenReturnDepartment(){
//        Department department = departmentRepository.findById(1L).get();
//        assertEquals(department.getDepartmentName(),"Mech");
//    }
//}