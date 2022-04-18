package com.example.demo;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Muskan Jain
 *
 * **/

@Component
@Getter
@Setter
@ToString
public class EmployeeMasterDetails {
    private long empId;
    private String empName;
    private String empDept;
}
