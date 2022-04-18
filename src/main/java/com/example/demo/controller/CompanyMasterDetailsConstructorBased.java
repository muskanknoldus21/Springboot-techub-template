package com.example.demo.controller;
import com.example.demo.EmployeeMasterDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 *@Author Muskan Jain
 * **/

@RestController
public class CompanyMasterDetailsConstructorBased {
    private EmployeeMasterDetails employeeMasterDetails;

    @Autowired
    public CompanyMasterDetailsConstructorBased(EmployeeMasterDetails employeeMasterDetails){
        this.employeeMasterDetails = employeeMasterDetails;
    }

    public String toString() {
        return "CompanyMasterDetails [empployeeDetails" + employeeMasterDetails + "]";
    }
}
