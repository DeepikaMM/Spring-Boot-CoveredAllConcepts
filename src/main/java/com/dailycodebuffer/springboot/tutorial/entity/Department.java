package com.dailycodebuffer.springboot.tutorial.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
//builder pattern
@Builder
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    @NotBlank(message = "Please add department Name")
    @Length(max = 5, min = 1)
    @Size(max =10, min =0)
//    @Email
//    @Positive
//    @Negative
//    @PositiveOrZero

    private String departmentName;
    private String departmentAddress;
    private String departmentCode;




}
